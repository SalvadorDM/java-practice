/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import entidades.Rectangulo;

/**
 *
 * @author Salvador
 */
public class RectanguloService {

    public RectanguloService() {
    }
    
    
    
    public Rectangulo crearRectangulo(double base, double altura){
        Rectangulo unRectangulo = new Rectangulo(base,altura);
        return unRectangulo;
    }
    
}