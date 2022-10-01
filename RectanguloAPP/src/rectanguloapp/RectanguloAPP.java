/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectanguloapp;

import Servicios.RectanguloService;
import entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class RectanguloAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la base y luego la altura");
        double base = leer.nextDouble();
        double altura = leer.nextDouble();
        
        RectanguloService rec1 = new RectanguloService();
        Rectangulo r1 = rec1.crearRectangulo(base, altura);
        
        System.out.println("superficie:"+r1.superficie());
        System.out.println("perimetro:"+r1.perimetro());
        
        r1.dibujarRectangulo();
        
        
        
        
        
        
    }
    
}
