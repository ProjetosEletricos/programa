package auxiliar;

import java.text.DecimalFormat;

public class Numero {

	public static String decimal(Double valor, String formato) {

		DecimalFormat df = null;
		try {
			df = new DecimalFormat(formato);
		} catch (IllegalArgumentException e) {
			System.out.println("Formatação incorreta em decimal(): " + e);
		}
		String dfString = df.format(valor);
		return dfString;
	}

	public static Double stringToDouble(String valor) {

		String pv = valor.replaceAll(",", ".");

		double dfDouble = Double.parseDouble(pv);

		return dfDouble;
	}

}
