package com.javifast.tema06;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppLinkedHashSet {

	public static void main(String... javifast) {
		Set<Persona> lista = new LinkedHashSet<>();		
		lista.add(new Persona(1,"Javifast",22));
		lista.add(new Persona(1,"Javier",22));
		lista.add(new Persona(1,"JavierMS",22));
		lista.add(new Persona(1,"JavierMS",22));
		lista.add(new Persona(1,"Javifast",25));
		lista.add(new Persona(1,"Txc1033",22));
		
		for(Persona per : lista){
			System.out.println(per.getEdad()+"-" + per.getNombre());
		}
	}
}
