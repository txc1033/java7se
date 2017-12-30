package com.javifast.tema04;

public class Alumno extends Persona {

    public Alumno(String nombre) {
        super(nombre);
    }

    public void saludar() {
        System.out.println("Hola, soy un alumno de Javifast");
    }

}
