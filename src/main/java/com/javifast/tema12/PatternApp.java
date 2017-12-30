package com.javifast.tema12;

import java.util.regex.Pattern;

public class PatternApp {

	public static void main(String... javierMS) {
		String patron = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		
		long ini = System.currentTimeMillis();
		Pattern p = Pattern.compile(patron);

		
		for(int i = 0; i < 10000;i++){
			String[] arreglo = p.split("Javier;Javifast;Javi;JavierMS");	
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println(fin - ini);
		
		////////////////////////////////////
		
		long iniSplit = System.currentTimeMillis();		
		
		for(int i = 0; i < 10000;i++){
			String[] arreglo = "Javier;Javifast;Javi;JavierMS".split(patron);	
		}
		
		long finSplit = System.currentTimeMillis();
		
		System.out.println(finSplit - iniSplit);
		
		
	}
}
