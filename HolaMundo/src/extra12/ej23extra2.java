/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra12;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class ej23extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] vectorA = new String[5];
        String[][] matrizA = new String[20][20];
        String palabra = "";
        int n = 0;

        llenarVector(vectorA);

        ubicarPalabras(matrizA, vectorA);

        rellenarMatriz(matrizA);

        mostrarMatriz(matrizA);

    }

    public static void llenarVector(String[] vectorA) {
        for (int i = 0; i < vectorA.length; i++) {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una palabra de entre 3 y 5 letras");
            vectorA[i] = leer.next();

            while (vectorA[i].length() < 3 || vectorA[i].length() > 5) {
                System.out.println("la palabra no tiene ellargo indicado, ingresela nuevamente");
                vectorA[i] = leer.next();
            }
        }
    }

    public static void ubicarPalabras(String[][] matrizA, String[] vectorA) {
        int n = 0;
        int m = 0;
        boolean bandera = true;
        for (int j = 0; j < 5; j++) {
            n = (int) (Math.random() * 20);
            m = (int) (Math.random() * 20);
            while (m > 20 - vectorA[j].length()) {
                m = (int) (Math.random() * 20);
            }
            while (bandera) {
                for (int i = 0; i < vectorA[j].length(); i++) {
                    if (matrizA[n][m + i] == null) {
                        bandera = false;
                    } else {
                        bandera = true;
                        n = (int) (Math.random() * 20);
                        break;
                    }
                }
            }

            for (int i = 0; i < vectorA[j].length(); i++) {

                matrizA[n][m + i] = vectorA[j].substring(0 + i, 1 + i);
            }
        }
    }

    public static void rellenarMatriz(String[][] matrizA) {
        int n = 0;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                if (matrizA[i][j] == null) {
                    n = (int) (Math.random() * 10);
                    matrizA[i][j] = String.valueOf(n);
                }

            }
        }
    }

    public static void mostrarMatriz(String[][] matrizA) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                System.out.print("[" + matrizA[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
