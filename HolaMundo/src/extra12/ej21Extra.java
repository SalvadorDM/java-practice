/*
 Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.
 */
package extra12;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class ej21Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] v = new double[10];
        rellenarv(v);
        contar(v);

    }

    public static void rellenarv(double[] v) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese la nota del primer parcial del alumno " + i);
            double p1 = leer.nextInt() * 0.1;
            System.out.println("ingrese la nota del segundo parcial del alumno " + i);
            double p2 = leer.nextInt() * 0.15;
            System.out.println("ingrese la nota del primer integrador del alumno " + i);
            double i1 = leer.nextInt() * 0.25;
            System.out.println("ingrese la nota del segundo parcial del alumno " + i);
            double i2 = leer.nextInt() * 0.5;
            v[i] = p1 + p2 + i1 + i2;
        }

    }

    public static void contar(double[] v) {
        int contd=0;int conta=0;
        for (int i = 0; i < 10; i++) {
            if(v[i]<7){
            contd++;}else{conta++;}
        }
        System.out.println("la cantidad de alumnos aprobados es de "+conta+" y la de desaprobados es de "+contd);
}
    }