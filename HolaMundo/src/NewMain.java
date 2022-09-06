/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salvador
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese tamaño de cuadrado: ");
        num = leer.nextInt();
        for (int i = 1; i <= num ; i++) {
            
            for (int j = 1; j <= num; j++) {
                if  (i == 1 || i == num || j == num || j == 1){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                } 
            }
            System.out.println(" ");
        }
    }
    
}

