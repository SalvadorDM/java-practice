/*
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase y terminela con un punto");
        String frase = leer.nextLine();
        
        String frase2;
       
        frase2 = codigo(frase);
        
        System.out.println(frase2);
        
        
    }
    
    public static String codigo(String frase){
        String codificador = "";
        
        for (int i = 0; i < frase.length();i++){
            
            switch(frase.substring(i, i+1)) {
                
                case "a":
                    codificador = codificador.concat("@");
                    break;
                case "A":
                    codificador = codificador.concat("@");
                    break;
                case "e":
                    codificador = codificador.concat("#");
                    break;
                case "E":
                    codificador = codificador.concat("#");
                    break;
                case "i":
                    codificador = codificador.concat("$");
                    break;
                case "I":
                    codificador = codificador.concat("$");
                    break;
                case "o":
                    codificador = codificador.concat("%");
                    break;
                case "O":
                    codificador = codificador.concat("%");
                    break;
                case "u":
                    codificador = codificador.concat("*");
                    break;
                case "U":
                    codificador = codificador.concat("*");
                    break;
                default:
                    codificador = codificador.concat(frase.substring(i, i+1));
            }
            
        }
        
        
        
        
       return codificador;
        
        
    }

   
        
        
        
        
        
    }
    

