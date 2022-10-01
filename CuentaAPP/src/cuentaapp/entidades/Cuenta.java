/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaapp.entidades;

/**
 *
 * @author Salvador
 */
public class Cuenta {
    
    private int numeroCuenta;
    private int saldoActual;
    private long dni;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int saldoActual, long dni) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dni = dni;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public void ingresar(double ingreso){
        this.saldoActual += (int) ingreso;
        System.out.println("usted ha ingresado "+ingreso+" pesos");
        
    }
    public void retirar(double retiro){
        
        if (retiro > this.saldoActual) {
            System.out.println("no le alcanza para realizar el retiro completo");
            System.out.println("se le entregan "+this.saldoActual+" pesos que hay en la cuenta");
            this.saldoActual = 0;
        }
        else {   
        this.saldoActual -=  (int) retiro;
            System.out.println("aqui estan sus "+retiro+" pesos");
        }
    }
    
    public void extraccionRapida(){
        if (this.saldoActual > 0){
             System.out.println("su retiro es "+((this.saldoActual*20)/100)+"pesos");
            this.saldoActual -= ((this.saldoActual*20)/100);
           
        }
        else    {
            System.out.println("su cuenta esta vacia");
        }
            
    }
    
    public void consultarSaldo(){
        System.out.println("su saldo es: "+this.saldoActual);
    }
    public void consultarDatos(){
        System.out.println("sus datos son los siguientes\n"+"numero de cuenta: "+this.numeroCuenta+"\n"+"dni: "+this.dni);
               
    }
    
    
    
}
