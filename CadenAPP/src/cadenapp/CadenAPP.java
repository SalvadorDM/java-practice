/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package cadenapp;

import cadenapp.entidades.Cadena;
import cadenapp.servicios.CadenaService;
import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class CadenAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase");
        String frase = leer.next();
        Cadena c1 = new Cadena();
        CadenaService service1 = new CadenaService();
        c1.setFrase(frase);

        /*c1.mostrarVocales();
        service1.invertirFrase(c1);
        System.out.println("ingrese una letra a buscar");
        c1.vecesRepetido(leer.next());       
        System.out.println("ingrese una neva frase para comparar la longitud");
        c1.compararLongitud(leer.next());
        c1.unirFrases(leer.next());
        
        c1.reemplazar(leer.next());*/
        System.out.println(c1.contiene(leer.next()));   
        
    }
    
}
