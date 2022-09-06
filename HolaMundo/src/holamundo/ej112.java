/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;


/**
 *
 * @author Salvador
 */
public class ej112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            
            switch(frase.substring(i, i)) {
                
                case "a":
                case "A":
                    codificador.concat("@");
                    break;
                case "e":
                case "E":
                    codificador.concat("@");
                    break;
                case "i":
                case "I":
                    codificador.concat("@");
                    break;
                case "o":
                case "O":
                    codificador.concat("@");
                    break;
                case "u":
                case "U":
                    codificador.concat("@");
                    break;
                default:
                    codificador.concat(frase.substring(i,i));
            }
            
        }
        
        
        
        
       return codificador;
        
        
    }

    private static String concat(String codificador, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


  
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una nota entre 1 y 10");
        
        int nota = leer.nextInt();
        
        while (nota < 0 || nota > 10) {
            System.out.println("La nota no es correcta, ingresela nuevamente");
            nota = leer.nextInt();
        }
                
        System.out.println("Su nota es correcta y es: " + nota);
         
        
        