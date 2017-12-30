package com.javifast.tema04;

import java.util.ArrayList;
import java.util.List;

public class App {

        @SuppressWarnings("Convert2Diamond")
	public static void main(String... javifast) {
		 
		/*List<String> lista = new ArrayList<>();
		lista.add("MitoCode");
		//lista.add(25);
		
		String texto = lista.get(0);
		System.out.println(texto);
		
		/*String[] array = new String[5];
		array[0] = "MitoCode";
		array[1] = 1;*/
		
		Clase<String,Integer,String,Double> c = new Clase<>("Javifast",23,"Javier",23.0);
		c.mostrarTipo();
		
		List<Clase<String,Integer,String,String>> lista = new ArrayList<>();
		lista.add(new Clase<String,Integer,String,String>("Javifast",23,"Javier","Txc1033"));
		
		for(Clase<String,Integer,String,String> cl : lista){
			cl.mostrarTipo();
		}
		
		
		
		
		
		
		
		
		
		
 	}
}
