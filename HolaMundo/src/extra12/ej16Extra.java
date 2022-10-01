/*
 Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package extra12;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class ej16Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantas personas desea ingresar");
        int n = leer.nextInt();
        int[] vectorA = new int[n];
        String[] vectorB = new String[n];
        String resp = "";
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre de la persona nro[" + (i + 1) + "]");
            vectorB[i] = leer.next();
            System.out.println("Ingrese la edad de la persona nro [" + (i + 1) + "]");
            vectorA[i] = leer.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.println("La persona " + vectorB[i]);
            if (vectorA[i] < 18) {
                System.out.println("Es menor");
            } else {
                System.out.println("Es mayor de edad");
            }
            if (i != n - 1) {

                System.out.println("Si desea terminar ingrese No de lo contrario presione cualquier tecla");
                resp = leer.next();
            } else {
                break;
            }
            if (resp.equalsIgnoreCase("no")) {
                break;
            }

        }
        System.out.println("Gracias vuelva prontos ");
    }

}
