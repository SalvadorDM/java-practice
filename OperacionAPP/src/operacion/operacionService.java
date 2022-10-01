/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

import entidades.operacion;

/**
 *
 * @author Salvador
 */
public class operacionService {

   
    
    
    public operacion crearOperacion(double numero1, double numero2){
        operacion unaOperacion = new operacion(numero1,numero2);
        return unaOperacion;
        
    }

    public operacionService() {
    }
    
    
}
