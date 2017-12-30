package com.javifast.tema11;

public class SplitApp {

	public static void main(String... javierMS) {
		String cadena = "1000000.315|+|5.8|/|(|6.0|+|1|-|8|*|2.0|)";
		String[] extraccion = cadena.split("\\|",13);
		
		for(String elemento : extraccion){
			System.out.println(elemento);	
		}
		
	}
}
