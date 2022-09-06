/*
 * Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1, num2,num3, num4;
        
        System.out.println("Ingrese 4 numeros entre el 1 y el 20");
        
        
        num1 = leer.nextInt();
        
        while(num1 < 0 || num1 > 20) {
            
            System.out.println("el numero no eta entre 1 y 20, ingreselo de nuevo");
            num1 = leer.nextInt();
        }
        
        num2 = leer.nextInt();
        
        while(num2 < 0 || num2 > 20) {
            
            System.out.println("el numero no eta entre 1 y 20, ingreselo de nuevo");
            num2 = leer.nextInt();
        }
        
        num3 = leer.nextInt();
        
        while(num3 < 0 || num3 > 20) {
            
            System.out.println("el numero no eta entre 1 y 20, ingreselo de nuevo");
            num3 = leer.nextInt();
        }
        
        num4 = leer.nextInt();
        
        while(num4 < 0 || num4 > 20) {
            
            System.out.println("el numero no eta entre 1 y 20, ingreselo de nuevo");
            num4 = leer.nextInt();
        }
        
        System.out.print(num1 + " ");
        for (int i = 0; i < num1;i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print( num2 + " ");
        for (int i = 0; i < num2;i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num3 + " ");
        for (int i = 0; i < num3;i++) {
            System.out.print("*");
        }
        System.out.println("");
        System.out.print(num4 + " ");
        for (int i = 0; i < num4;i++) {
            System.out.print("*");
        }
        
        
        // TODO code application logic here
    }
    
}
