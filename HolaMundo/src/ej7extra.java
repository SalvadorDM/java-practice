
import java.util.Scanner;

/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */

/**
 *
 * @author Salvador
 */
public class ej7extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, num2, i, max, min, prom;
        prom = 0;
        i = 0;
        max = 0;
        min = 99999999;
        System.out.println("Ingrese la cantidad de numero a analizar");
        num = leer.nextInt();
        
        while  (i<num) {
            System.out.println("Ingrese el numero "+(i+1));
            num2 = leer.nextInt();
            
          while (num2 < 0) {
              System.out.println("el numero es  menor a 0, ingreselo nuevamente");
            num2 = leer.nextInt();
        }
        
          prom += num2;
                if (num2 > max) {
                max = num2;
            }
                if (num2<min){
                min = num2;
            }
          i++;
      }      
        
        System.out.println("el minimo es: "+min+ " el maximo es: "+max+ " y el promedio es: "+prom/num);
        
        
        
        
        
        // TODO code application logic here
    }
    
}
