
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salvador
 */
public class ej3extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String letra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra y comprobaremos que sea una vocal");
        letra = leer.next();
        System.out.println("");

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
            System.out.println("La letra -" + letra + "- ingresada es una vocal");

        } else {
            System.out.println("La letra -" + letra + "- ingresada no corresponde a una vocal");

    }
    
}
    }
