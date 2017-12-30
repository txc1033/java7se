package com.javifast.tema03;

/**
 *
 * @author javie
 */
public class Conexion {
    private static Conexion instancia = null;
    
    public static Conexion getInstance(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;

    }
    private Conexion(){
        
    }
}
