package com.javifast.tema07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class App {

    public static void main(String... javifast) {

        Map<Persona, String> map = new HashMap<>();
        map.put(new Persona(1, "Javifast", 21), "Javifast");
        map.put(new Persona(2, "Javifast", 22), "javier");
        map.put(new Persona(2, "Javifast", 22), "JavierMS");
        map.put(new Persona(2, "Javifast", 22), "Javier");
        map.put(new Persona(3, "Javifast", 24), "Txc1033");
        map.put(new Persona(6, "Javifast", 26), null);

        /*Iterator it = map.keySet().iterator();
		while(it.hasNext()){
		  Persona key = (Persona) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}*/
        for (Entry<Persona, String> ent : map.entrySet()) {
            System.out.println("Clave: " + ent.getKey() + " -> Valor: " + ent.getValue());
        }
    }

}
