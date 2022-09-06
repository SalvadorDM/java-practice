/*
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        
        int num, suma;
        
        suma = 0;
        
        do {
            System.out.println("Ingrese un numero");
            
            num = leer.nextInt();
        if (num >= 0){
            suma = suma + num;
        }
        
        
        
        
        }while(num != 0);
        
        System.out.println("se capturo el numero 0");
        
        System.out.println("la suma de los numeros positivos es: " + suma);
        
        
        
        
        
        
        
    }
    
}
