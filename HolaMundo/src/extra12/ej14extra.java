/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package extra12;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class ej14extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer núm");
        System.out.println("ingrese le segundo num");
        double num1 = leer.nextInt();
        double num2 = leer.nextInt();
        int r = 0;
        do {
            System.out.println("1.Sumar\n"
                    + "2.restar\n"
                    + "3.multiplicar\n"
                    + "4.dividir\n"
                    + "5.salir");
            r = leer.nextInt();
            switch (r) {

                case 1:
                    System.out.println("la suma es de " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("la resta es de " + rest(num1, num2));
                    break;

                case 3:
                    System.out.println("la multip es de " + multp(num1, num2));
                    break;
                case 4:
                    System.out.println("la división es de " + div(num1, num2));
                    break;
            }

        } while (r != 5);

    }

    public static double sumar(double n1, double n2) {
        double s = n1 + n2;
        return s;
    }

    public static double multp(double n1, double n2) {
        double s = n1 * n2;
        return s;
    }

    public static double rest(double n1, double n2) {
        double s = n1 - n2;
        return s;
    }

    public static double div(double n1, double n2) {
        double s = n1 / n2;
        return s;
    }
}
