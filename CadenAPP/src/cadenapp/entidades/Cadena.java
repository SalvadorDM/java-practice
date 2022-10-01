/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenapp.entidades;

/**
 *
 * @author Salvador
 */
public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }

    public void mostrarVocales() {
        boolean bandera;
        int cont = 0;
        for (int i = 0; i < this.longitud; i++) {
            bandera = (this.frase.charAt(i) == 'a' || this.frase.charAt(i) == 'e' || this.frase.charAt(i) == 'i' || this.frase.charAt(i) == 'o' || this.frase.charAt(i) == 'u');
            if (bandera) {
                cont++;
            }

        }
        System.out.println("la frase contiene " + cont + " vocales");
    }

    public void vecesRepetido(String letra) {
        char let = letra.charAt(0);
        int cont = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.charAt(i) == let) {
                cont++;
            }
        }
        System.out.println("la letra que usted eligio esta repetida " + cont + " veces");
    }

    public void compararLongitud(String frase) {
        int longi = frase.length();
        System.out.println("la frase original tiene " + this.longitud + " caracteres, mientras que la frase nueva posee " + longi + " caracteres");
    }

    public void unirFrases(String frase) {
        System.out.println(this.frase + " " + frase);
    }

    public void reemplazar(String letra) {

        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.charAt(i) == 'a') {
                System.out.print(letra);
            } else {
                System.out.print(this.frase.charAt(i));
            }

        }

    }

    public boolean contiene(String letra) {
        boolean bandera = false;
        char let = letra.charAt(0);
        for (int i = 0; i < this.longitud; i++) {

            if (this.frase.charAt(i) == let) {

                bandera = true;
                break;

            }
        }

        return bandera;
    }
}
