package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaoHelper {

	private static final ThreadLocal<Connection> context = new ThreadLocal<Connection>();

	public Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Não encontrou o drive: com.mysql.jdbc.Driver: " + e);
		}
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost/Eletrica?useSSL=false", "root", "12345");
		} catch (SQLException e) {
			System.out.println("Não conectou com o banco de dados Sql no DaoHelper(): " + e);
		}

		return conn;

	}

	public void beginTransaction() {

		if (isTransactionStarted())
			return; // << 13 -- provide support to transaction propagation

		Connection conn = null;
		conn = getConnection();
		try {
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("Erro no conn.setAutoCommit(false): " + e);
		}
		context.set(conn);
	}

	private boolean isTransactionStarted() {
		return (context.get() != null);
	}

	public void endTransaction() {
		try {
			commit(getConnectionFromContext());
		} catch (SQLException e) {
			System.out.println("Não conseguiu fazer endTransaction(): " + e);
		}

		releaseTransaction();

	}

	public void releaseTransaction() {
		Connection conn = null;
		try {
			conn = getConnectionFromContext();
		} catch (SQLException e) {
			System.out.println("Não conseguiu fazer releaseTransaction(): " + e);
		}
		release(conn);
		context.remove();
	}

	public void rollbackTransaction() {
		Connection conn;
		try {
			conn = getConnectionFromContext();
			rollback(conn);
			release(conn);
		} catch (SQLException e) {
			System.out.println("Não conseguiu fazer o rollbackTransaction(): " + e);
		}

		context.remove();
	}

	public void commit(Connection conn) {
		try {
			conn.commit();
		} catch (SQLException e) {
			System.out.println("Não conseguiu fazer o conn.commit() em commit(): " + e);
		}
	}

	public void rollback(Connection conn) {
		if (conn != null)
			try {
				conn.rollback();
			} catch (SQLException e) {
				System.out.println("Não conseguiu fazer o conn.rollback() em rollback(): " + e);
			}
	}

	public Connection getConnectionFromContext() throws SQLException {

		Connection conn = context.get();

		if (conn == null)
			throw new SQLException("Transação inválida. Sem conexão.");

		if (conn.isClosed())
			throw new SQLException("Transação inválida. Conexao esta fechada.");

		return conn;

	}

	public int executaDaoComRetornoDeChave(Connection conn, String query, Object... params) {

		PreparedStatement pstmt = null;
		ResultSet rset = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		} catch (SQLException e) {
			System.out.println(
					"Não conseguiu fazer o prepareStatement() em DaoHelper()/executaDaoComRetornoDeChave(): " + e);
		}

		int i = 0;
		for (Object param : params) {
			try {
				pstmt.setObject(++i, param);
			} catch (SQLException e) {
				System.out.println(
						"Não conseguiu fazer o setObject() em DaoHelper()/executaDaoComRetornoDeChave(): " + e);
			}
		}

		try {
			pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(
					"Não conseguiu fazer o executeUpdate() em DaoHelper()/executaDaoComRetornoDeChave(): " + e);
		}

		try {
			rset = pstmt.getGeneratedKeys();
			if (rset.next())
				result = rset.getInt(1);
		} catch (SQLException e) {
			System.out.println(
					"Não conseguiu fazer o getGeneratedKeys() em DaoHelper()/executaDaoComRetornoDeChave(): " + e);
		}

		release(pstmt);
		release(rset);

		return result;
	}

	public void executaDao(Connection conn, String query, Object... params) {

		PreparedStatement pstmt = null;

		try {

			pstmt = conn.prepareStatement(query);

		} catch (SQLException e) {
			System.out.println("Não conseguiu fazer o prepareStatement() em DaoHelper()/executaDao(): " + e);
		}
		int i = 0;

		for (Object param : params) {
			try {
				pstmt.setObject(++i, param);
			} catch (SQLException e) {
				System.out.println("Não conseguiu fazer o setObject() em DaoHelper()/executaDao(): " + e);
			}
		}

		try {
			pstmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Não conseguiu fazer o executeUpdate() em DaoHelper()/executaDao(): " + e);
		} catch (NullPointerException e) {
			System.out.println("Valores com Null em pstmt.executeUpdate(): " + e);
		}

		release(pstmt);

	}

	public void executaDaoSimplesNoContexto(String query, Object... params) throws ArrayIndexOutOfBoundsException, NullPointerException, SQLException {

		executaDao(getConnectionFromContext(), query, params);
	}

	public int executaDaoComRetornoDeChave(String query, Object... params) throws SQLException, NullPointerException {

		int id = 0;

		id = executaDaoComRetornoDeChave(getConnectionFromContext(), query, params);

		return id;
	}

	public <T> List<T> executePreparedQueryList(String query, QueryMapper<T> mapper)
			throws SQLException, NumberFormatException, NullPointerException {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;

		List<T> list = new ArrayList<T>();

		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rset = stmt.executeQuery(query);
			list = mapper.mapping(rset);
		} finally {
			releaseAll(conn, stmt, rset);
		}

		return list;

	}

	public void release(Statement stmt) {
		if (stmt == null)
			return;
		try {
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Não conseguiu fechar o Statement: " + e);
		}
	}

	public void release(Connection conn) {

		if (conn == null)
			return;
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Não conseguiu fechar a Connection: " + e);
		}

	}

	public void release(ResultSet rset) {
		if (rset == null)
			return;
		try {
			rset.close();
		} catch (SQLException e) {
			System.out.println("Não conseguiu fechar o ResultSArrayIndexOutOfBoundsExceptionet: " + e);
		}
	}

	public void releaseAll(Connection conn, Statement stmt) {
		release(stmt);
		release(conn);
	}

	public void releaseAll(Connection conn, Statement stmt, ResultSet rset) {
		release(rset);
		releaseAll(conn, stmt);
	}

}
