
import java.util.Scanner;

/*
 Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */

/**
 *
 * @author Salvador
 */
public class ej11extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       long num, num2;
       long div, i;
       i = 0;
       div = 0;
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        num = leer.nextLong();
        div = num;
       
        while (div >= 10){
            System.out.println(div+num);
            
            div = div/10;
            
            i++;
            
            
        }
        
        System.out.println("su numero tiene "+(i+1)+" digitos");        
        
        
    }
    
}
