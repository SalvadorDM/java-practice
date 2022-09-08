
import java.util.Scanner;

/*
 Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */

/**
 *
 * @author Salvador
 */
public class ej6extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double prom1, prom2, contador, altura;
        contador = 0;
        prom1 = 0;
        prom2 = 0;        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que va a analizar");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese la altura de la persona "+(i+1));
            altura = leer.nextDouble();
            prom1 += altura;
            if (altura < 1.60) {
                prom2 += altura;
                contador++;
            }
        }
        
        
        System.out.println("el promedio de altura general es " +(prom1/num)+ " y de altura menor a 1.60 es " +(prom2/contador));
        
    }
    
}
