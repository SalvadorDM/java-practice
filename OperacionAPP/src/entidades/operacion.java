/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Salvador
 */
public class operacion {
    
    private double numero1;
    private double numero2;

    public operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double suma(){
        return this.numero1+this.numero2;
    }
    public double resta(){
        return this.numero1-this.numero2;
    }
    public double multiplicacion(){
        if (this.numero1 == 0 || this.numero2 == 0){
            System.out.println("el numero ingresado es erroneo");
            return 0;
        }
        else {
            return this.numero1*this.numero2;
        }
    }
    public double division(){
        if (this.numero1 == 0 || this.numero2 == 0){
            System.out.println("el numero ingresado es erroneo");
            return 0;
        }
        else {
            return this.numero1/this.numero2;
        }
    }
    
    
    
}
