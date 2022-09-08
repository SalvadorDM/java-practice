
import java.util.Scanner;

/*
 Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */

/**
 *
 * @author Salvador
 */
public class ej8extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner leer = new Scanner(System.in);
    int num, par, impar, cont;
    par = 0;
    impar = 0;
    cont = 0;  
       do {
            System.out.println("ingrese un numero");
           num = leer.nextInt();
           
           if (num >= 0){
            cont++;
            if ((num%2) == 0){
                par++;
            }
            else
            impar++;
            }
       
       } while((num%5) != 0) ;
        
        System.out.println("ingreso  "+par+" pares y "+impar+" impares");
        
       
        
        
        
    }
    
}
