package com.javifast.tema02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javie
 */
public class App {
    
    private List canasta = new ArrayList();
    
    private void verificar(Object objeto){
        if(objeto instanceof Fruta){
            canasta.add(objeto);
            System.out.println("Fruta Agregada "+((Fruta)objeto).getNombre());
        }else{
            System.out.println("No permitido, Solo frutas");
        }
    }
    
    public static void main(String... javifast){
      /*  String  texto = new String("Javifast");
    if(texto instanceof String){
        System.out.println("Es un string: "+texto);
    }*/
     /* Alumno al = new Alumno();
      if(al instanceof Persona){
        System.out.println("Es una persona");
    }*/
    //Se tiene una canasta en donde solo se debe permitir ingresar frutas
    System.out.println("Ingresar Frutas");
    
    Manzana m1 = new Manzana("ROJA");
    Manzana m2 = new Manzana("VERDE");
    Naranja n1 = new Naranja("NARANJA SIN PEPA");
    Galleta g1 = new Galleta("GALLETA DE CHOCOLATE");
    
    App app = new App();
    app.verificar(m1);
    app.verificar(m2);
    app.verificar(n1);
    app.verificar(g1);
    }
}
