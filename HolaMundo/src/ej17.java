
import java.util.Scanner;

/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */

/**
 *
 * @author Salvador
 */
public class ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner leer=new Scanner(System.in);
        int[][] matriz=new int [4][4];
        int [][] matrizT=new int [4][4];
        autorellenar(matriz);
        System.out.println(" ");
        System.out.println(" ");
        mostrarMatrizB(matriz, matrizT);
       // mostrar(matriz, matrizT);
    }
    
public static void autorellenar(int matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
             matriz[i][j]= (int) (Math.random()*10);
             System.out.print(matriz[i][j]+" ");
        }
        System.out.println(" ");
    }
}   

public static void mostrarMatrizB(int matriz[][], int matrizT[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizT[i][j] = matriz[j][i];
                System.out.print("[" +matrizT[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
 

}

    
    

