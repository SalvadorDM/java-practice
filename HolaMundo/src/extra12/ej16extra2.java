/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra12;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class ej16extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        String nombre= "";
        String salida="";
        int edad;
        boolean salir=true;
        
        nombre = entrada.next();

        while (salir) {

            System.out.println("Ingrese el nombre");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la edad");
            edad = entrada.nextInt();
            if (edad > 18) {
                System.out.println(nombre);
                System.out.println(edad);
                System.out.println("Es mayor de edad");

            } else {
                System.out.println(nombre);
                System.out.println(edad);
                System.out.println("Es menor de edad");

            }
            
            System.out.println("desea continuar?");
            salida=entrada.next();
            if (salida=="NO") {
                salir=false;
                
            }

        }
}
    }