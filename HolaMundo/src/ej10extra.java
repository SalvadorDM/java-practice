
import java.util.Scanner;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */

/**
 *
 * @author Salvador
 */
public class ej10extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, res, ing;
        Scanner leer = new Scanner(System.in);
        num1 = (int) (Math.random()*10+1);
        num2 = (int) (Math.random()*10+1);
        
        res = num1 * num2;
        System.out.println("numero1: "+num1+" numero2: "+num2+" resultado: "+res);
        System.out.println("Ingrese un posible resultado");
        ing = leer.nextInt();
        
      while (res != ing) {
          System.out.println("resultado equivocado, pruebe nuevamente");
          ing = leer.nextInt();
      }
        System.out.println("Acertaste, felicitaciones!");
        
        // TODO code application logic here
    }
    
}
