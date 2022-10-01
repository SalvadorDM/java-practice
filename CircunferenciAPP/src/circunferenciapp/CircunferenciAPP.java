/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).
 */
package circunferenciapp;

import circunferenciaAPP.servicios.CircunferenciaService;
import circunferenciapp.entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class CircunferenciAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        double radio;

        System.out.println("Ingrese el valor del radio");

        radio = leer.nextDouble();

        CircunferenciaService circunferencia1 = new CircunferenciaService();

        Circunferencia cir1 = circunferencia1.crearCircunferencia(radio);

        cir1.area();

        cir1.perimetro();

    }

}
