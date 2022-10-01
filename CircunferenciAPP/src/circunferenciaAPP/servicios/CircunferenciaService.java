/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferenciaAPP.servicios;

import circunferenciapp.entidades.Circunferencia;

/**
 *
 * @author Salvador
 */
public class CircunferenciaService {

    public CircunferenciaService() {
    }
    
    
    
    public Circunferencia crearCircunferencia(double radio){
        Circunferencia unaCircunferencia = new Circunferencia(radio);
        return unaCircunferencia;
        
    }
    
    
    
}
