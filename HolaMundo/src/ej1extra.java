
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
public class ej1extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz10 = new int[10][10];
        int[][] matriz3 = new int[3][3];

        matriz10 = llenarMatriz10(matriz10);
        mostrarMatriz(matriz10);
        matriz3 = llenarMatriz3(matriz3);
        mostrarMatriz(matriz3);
        comparar(matriz10, matriz3);

    }

    public static int[][] llenarMatriz10(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10 - 1);
            }
        }
        return matriz;
    }

    public static int[][] llenarMatriz3(int[][] matriz) {
        System.out.println("rellene la matriz de 3X3");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

    public static void comparar(int[][] m10, int[][] m3) {
        int conti,contj;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                conti=0;contj=0;
               if(m10[i][j]==m3[conti][contj]){
                   contj++;
                  
                   if(m10[i][j+contj]==m3[conti][contj]){
                   contj++;
                   if(m10[i][j+contj]==m3[conti][contj]){
                   conti++;contj=0;
                    if(m10[i+conti][j+contj]==m3[conti][contj]){
                   contj++;
                   if(m10[i+conti][j+contj]==m3[conti][contj]){
                   contj++;
                   if(m10[i+conti][j+contj]==m3[conti][contj]){
                   conti++;contj=0;
                     if(m10[i+conti][j+contj]==m3[conti][contj]){
                   contj++;
                   if(m10[i+conti][j+contj]==m3[conti][contj]){
                   contj++;
                   if(m10[i+conti][j+contj]==m3[conti][contj]){
                       System.out.println("la matriz se encuentra desde la posición ["+i+"]["+j+"]");
                   
               }
               }
               }
               }
               }
               } 
               }
               }
               } 
            }
   
        }