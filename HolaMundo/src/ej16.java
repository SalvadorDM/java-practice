
import java.util.Scanner;

/*
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */

/**
 *
 * @author Salvador
 */
public class ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        
        int[] vector = new int[n];
        
        for (int i = 0; i < vector.length; i++ )
        
                vector[i] = (int)(Math.random() * 10+1);
        
        buscarNumero(vector);
        
        
    }
    
    public static void buscarNumero(int[] vector){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("que numero desea buscar");
        
        int num = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] == num)
                System.out.println("Su numero se encuentra en posicion: Vector["+ i +"]");
            
        }
      
        
    }

