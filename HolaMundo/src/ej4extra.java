
import java.util.Scanner;

/*
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */

/**
 *
 * @author Salvador
 */
public class ej4extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10 para convertira numero romano");
        int num = leer.nextInt();
        convertir(num);
        
        
        
        
        
        
    }
    
    
     public static void convertir(int numero){
        switch (numero){
            case 1:
                System.out.println("El número " +numero+ " convertido a número romano es I");
                break;
            case 2:
                System.out.println("El número " +numero+ " convertido a número romano es II");
                break;
            case 3:
                System.out.println("El número " +numero+ " convertido a número romano es III");
                break;
            case 4:
                System.out.println("El número " +numero+ " convertido a número romano es IV");
                break;
            case 5:
                System.out.println("El número " +numero+ " convertido a número romano es V");
                break;
            case 6:
                System.out.println("El número " +numero+ " convertido a número romano es VI");
                break;
            case 7:
                System.out.println("El número " +numero+ " convertido a número romano es VII");
                break;
            case 8:
                System.out.println("El número " +numero+ " convertido a número romano es VIII");
                break;
            case 9:
                System.out.println("El número " +numero+ " convertido a número romano es IX");
                break;
            case 10:
                System.out.println("El número " +numero+ " convertido a número romano es x");
                break;
            default:
                System.out.println("Te dijimos entre 1 y 10!!!!!!");
}
}
}
