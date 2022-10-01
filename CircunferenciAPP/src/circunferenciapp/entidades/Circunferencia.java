/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferenciapp.entidades;

/**
 *
 * @author Salvador
 */
public class Circunferencia {
    
    
    private double radio;

    public Circunferencia() {
    }
    
    

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    public void area(){
        System.out.println("el area es: "+(Math.PI*Math.pow(this.radio, 2)));
        
        
    }
    
    public void perimetro(){
        System.out.println("el perimetro es: "+(Math.PI*this.radio*2));
    }
    
    
    
    
}
