/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenapp.servicios;

import cadenapp.entidades.Cadena;

/**
 *
 * @author Salvador
 */
public class CadenaService {

    public CadenaService() {
    }
    
    public void invertirFrase(Cadena c1){
        
        
        for (int i = c1.getLongitud()-1; i >= 0; i--) {
            System.out.print(c1.getFrase().charAt(i));
        }
        System.out.println("");
        
    }
    
}
