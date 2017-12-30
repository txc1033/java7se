package com.javifast.tema06;

import java.util.Set;
import java.util.TreeSet;

public class AppTreeSet {

	public static void main(String... javifast) {
		Set<Persona> lista = new TreeSet<>();
		lista.add(new Persona(1,"Javifast",22));
		lista.add(new Persona(1,"Javier",22));
		lista.add(new Persona(1,"JavierMS",22));
		lista.add(new Persona(1,"JavierMS",22));
		lista.add(new Persona(1,"Javifast",25));
		lista.add(new Persona(1,"Txc1033",22));
		
		
		for(Persona per : lista){
			System.out.println(per.getId() + "-" + per.getNombre() + "-" + per.getEdad());
		}
	}
}
