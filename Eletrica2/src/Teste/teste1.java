package Teste;

import java.util.HashMap;

import programa.Dao.hashMap;


public class teste1 {

	public static void main (String[] args) {
		
	hashMap dicionario = new hashMap();
	
	dicionario.adiciona("teste", 10);

		
		System.out.println("valor: "+ dicionario.getvalor("teste"));
		
		
	}

}
