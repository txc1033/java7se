package com.javifast.tema13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherApp {

	public static void main(String... javierMS) {		
		String texto = "Hola Javier o Javifast Javifast";
		Pattern p = Pattern.compile("Javifast", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(texto);
		
		System.out.println("matches " + m.matches());
		
		//System.out.println("lookingAt " + m.lookingAt());
		
		int contador = 0;
		while(m.find()){
			contador++;
			System.out.println("Coincidencia N� " + contador + " start " + m.start() + " end " + m.end());
		}
	}

}
