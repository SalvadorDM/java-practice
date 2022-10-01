/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Salvador
 */
public class Libro {

    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int ISBN;

    public Libro() {

    }

    public Libro(String titulo, String autor, int numeroDePaginas, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    
    public void setNumeroDePaginas(int numeroDePaginas){
        this.numeroDePaginas = numeroDePaginas;
    }
    
    public String getTitulo(){
        return titulo;        
    }

    public String getAutor() {
        return autor;
    }
    
    public int getISBN(){
        return ISBN;
    }
    
    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas + ", ISBN=" + ISBN + '}';
    }
    
    
    

}
