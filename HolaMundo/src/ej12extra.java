/*
 Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 * and open the template in the editor.
 */

/**
 *
 * @author Salvador
 */
public class ej12extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2, num3, i;
        
        num1 = 0;
        num2 = 0;
        num3 = 0;
        System.out.println(num1+"-"+num2+"-"+num3);
        
         
            
            while(num2 != 9 || num3 != 9 || num1 != 9){
        num3 += 1;
        
        cambiar3(num1, num2, num3);
        
        
           
        
        if (num3 == 9 && num2 != 9) {
            num3 = 0;
            num2 += 1;
            cambiar3(num1, num2, num3); }
        if (num2 == 9 && num3 == 9) {
            num1 += 1;             
            num2 = 0;
            num3 = 0;
            if (num1 > 9){
              break;
           }
            cambiar3(num1, num2, num3);
            
           
           }
        
            
            
            
            
            
       
             
            
            
            
        }
}
        
    public static void cambiar3(int num1, int num2, int num3)  {
      if (num1 == 3 && num3 == 3 && num2 ==3){
            System.out.println("E"+"-"+"E"+"-"+"E");}
        else if (num1 == 3 && num2 ==3){
            System.out.println("E"+"-"+"E"+"-"+num3);}
        else if (num3 == 3 && num2 ==3){
            System.out.println(num1+"-"+"E"+"-"+"E");}
        else if (num3 == 3 && num1 ==3){
            System.out.println("E"+"-"+num2+"-"+"E");}
        
        else if (num3 == 3){
            System.out.println(num1+"-"+num2+"-"+"E");}
        else if (num2 == 3){
            System.out.println(num1+"-"+"E"+"-"+num3);}
        else if (num1 == 3){
            System.out.println("E"+"-"+num2+"-"+num3);}
        
        
        else {
        System.out.println(num1+"-"+num2+"-"+num3);}
          
        
        
        
     }    
    }
    

