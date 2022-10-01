/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package extra12;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class ej23extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        for (int j = 0; j < 5; j++) {
            n = (int) (Math.random() * 20);

            for (int i = 0; i < vectorA[j].length(); i++) {
                while ((matrizA[n][0 + i]) != null) {
                    n = (int) (Math.random() * 20);
                }
                matrizA[n][0 + i] = vectorA[j].substring(0 + i, 1 + i);
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
