/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package extra12;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class ej19Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("ingrese el tamaño de los vectores");
        n = leer.nextInt();
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        System.out.println("ingrese los valores del vector 1");
        for (int i = 0; i < vectorA.length; i++) {
            vectorA[i] = leer.nextInt();
        }
        System.out.println("ingrese los valores del vector 2");
        for (int i = 0; i < vectorB.length; i++) {
            vectorB[i] = leer.nextInt();
        }
        System.out.println("comparando vectores");
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("vector1: [" + vectorA[i] + "]");
            System.out.println("vector 2: [" + vectorB[i] + "]");
            if (vectorA[i] != vectorB[i]) {
                System.out.println("el vector es diferente");
                break;
            }

        }

    }

}
