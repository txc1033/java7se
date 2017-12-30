package com.javifast.tema06;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String... javifast) {
		
		List<Persona> lista = new ArrayList<>();
		lista.add(new Persona(1,"Javier",23));
		lista.add(new Persona(1,"Javifast",23));
		lista.add(new Persona(1,"JaviMS",25));
		lista.add(new Persona(1,"Txc1033",24));
		
		//Collections.sort(lista, new NombreComparator());
		/*Collections.sort(lista, new Comparator<Persona>(){

			@Override
			public int compare(Persona per1, Persona per2) {
				int rpta = 0;
				if(per1.getEdad() > per2.getEdad()){
					rpta = 1;
				}else if(per1.getEdad() < per2.getEdad()){
					rpta = -1;
				}else{
					rpta = 0;
				}
				return rpta;
			}
			
		});*/
		//Collections.reverse(lista);
		
		//Collections.sort(lista);
			
		for(Persona p : lista){
			System.out.println(p.getEdad() + "-" + p.getNombre());
		}
		
	}

}
