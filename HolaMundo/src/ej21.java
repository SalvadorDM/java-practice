
import java.util.Scanner;

/*
 Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */

/**
 *
 * @author Salvador
 */
public class ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matrizG = new int[10] [10];
        int[][] matrizC = new int[3] [3];
        rellenarMatrizG(matrizG);
        rellenarMatrizC(matrizC);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
   public static void rellenarMatrizG(int[][] matrizG){
       for (int i = 0; i < matrizG.length; i++) {
           for (int j = 0; j < matrizG.length; j++) {
               matrizG[i][j] = (int) (Math.random()*10);
               System.out.print("["+matrizG[i][j]+"]");
           }
           System.out.println(" ");
       }
   }
    
    public static void rellenarMatrizC(int[][] matrizC){
        Scanner leer = new Scanner(System.in);
       for (int i = 0; i < matrizC.length; i++) {
           for (int j = 0; j < matrizC.length; j++) {
               matrizC[i][j] = leer.nextInt();
               
           }
           
       }
       for (int i = 0; i < matrizC.length; i++) {
           for (int j = 0; j < matrizC.length; j++) {
               System.out.print("["+matrizC[i][j]+"]");
               
           }
           System.out.println(" ");
   }
    
    
    
    
    
    
    
    
    
}
