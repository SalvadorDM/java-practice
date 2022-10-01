/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentaapp.servicios;

import cuentaapp.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class CuentaService {
    
    public Cuenta crearCuenta(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese su numero de cuenta");
        int cuenta = leer.nextInt();
        System.out.println("ingrese su dni");
        long dni = leer.nextLong();
                
        Cuenta unaCuenta = new Cuenta(cuenta, 0, dni);
        return unaCuenta;
    }

    public CuentaService() {
    }

 
    
    
    
}
