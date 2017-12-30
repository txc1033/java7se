/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javifast.tema03;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javie
 */
public class PaisDAOImpl{
    
    
    private static List paises = null;
    public static PaisDAOImpl instancia = null;
    
    private PaisDAOImpl(){
        
    }
    
    
    public static PaisDAOImpl getInstance(){
      if (instancia == null){
          instancia = new PaisDAOImpl();
      }  
      return instancia;
    }
    

    
    public List getPaises(){
     if(paises == null){   
     paises = new ArrayList();   
     Pais p1 = new Pais("CHILE");
     Pais p2 = new Pais("MEXICO");
     
     paises.add(p1);
     paises.add(p2);
     }
     return paises;
    }
}
