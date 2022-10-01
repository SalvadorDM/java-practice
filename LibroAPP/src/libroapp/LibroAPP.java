/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package libroapp;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class LibroAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro();
        
        
        
        cargarLibro(libro1);
        
        mostrarLibro(libro1);
    }
    
    public static void cargarLibro(Libro libro1){
      
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los datos del libro");
        System.out.println("titulo");
        libro1.setTitulo(leer.nextLine());
        System.out.println("autor");
        libro1.setAutor(leer.nextLine());
        System.out.println("ISBN");
        libro1.setISBN(leer.nextInt());
        System.out.println("numero de paginas");
        libro1.setNumeroDePaginas(leer.nextInt());
    }
    
   public static void mostrarLibro(Libro libro1){
       
       System.out.println(libro1.getTitulo()+libro1.getAutor()+libro1.getISBN()+libro1.getNumeroDePaginas());
   }
    
    
    
}
