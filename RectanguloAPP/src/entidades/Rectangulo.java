/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Salvador
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double perimetro() {
        return (this.base + this.altura) * 2;
    }

    public double superficie() {
        return this.base * this.altura;
    }

    public void dibujarRectangulo() {

        for (int i = 0; i < (int) this.altura; i++) {
            for (int j = 0; j < (int) this.base; j++) {
                if (i == 0 || i == (int) this.altura - 1) {
                    System.out.print("* ");
                } else {
                    if (j == 0 || j == (int) this.base - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
            }
            System.out.println("");

        }
    }

}
