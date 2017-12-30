/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.tema03;

/**
 *
 * @author javie
 */
public class App {
 
    public static void main(String... javifast){
        //Con Singleton correcto
        PaisDAOImpl dao = PaisDAOImpl.getInstance();
        
        for(Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
         System.out.println("******************");
        for(Object obj : dao.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
         System.out.println("******************");
        PaisDAOImpl daoi = PaisDAOImpl.getInstance();
        
        for(Object obj : daoi.getPaises()){
            System.out.println(((Pais)obj).getNombre());
        }
    }
    
}
