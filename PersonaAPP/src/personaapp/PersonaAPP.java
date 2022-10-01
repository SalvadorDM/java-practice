/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaapp;

import personaapp.entidades.Persona;
import personaapp.servicios.PersonaService;

/**
 *
 * @author Salvador
 */
public class PersonaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double age = 0;
        double imc = 0;
        double imc1 = 0;
        double imc2 = 0;
        PersonaService pers = new PersonaService();
        Persona p1 = pers.crearPersona();
        Persona p2 = pers.crearPersona();
        Persona p3 = pers.crearPersona();
        Persona p4 = pers.crearPersona();

        switch (p1.calcularIMC()) {
            case 1:
                imc1++;
                break;
            case -1:
                imc2++;
                break;
            case 0:
                imc++;
                break;
            default:
                break;
        }
        if (p1.esMayorDeEdad()) {
            age++;
        }

        switch (p2.calcularIMC()) {
            case 1:
                imc1++;
                break;
            case -1:
                imc2++;
                break;
            case 0:
                imc++;
                break;
            default:
                break;
        }
        if (p2.esMayorDeEdad()) {
            age++;
        }
        switch (p3.calcularIMC()) {
            case 1:
                imc1++;
                break;
            case -1:
                imc2++;
                break;
            case 0:
                imc++;
                break;
            default:
                break;
        }
        if (p3.esMayorDeEdad()) {
            age++;
        }
        switch (p4.calcularIMC()) {
            case 1:
                imc1++;
                break;
            case -1:
                imc2++;
                break;
            case 0:
                imc++;
                break;
            default:
                break;
        }
        if (p4.esMayorDeEdad()) {
            age++;
        }

        System.out.println("el porcentaje de mayores de edad es " + ((age / 4) * 100)+"%");
        System.out.println("el porcentaje de gorditos es " + ((imc1 / 4) * 100)+"%");
        System.out.println("el porcentaje de flquitos es " + ((imc2 / 4) * 100)+"%");
        System.out.println("el porcentaje de sanos es " + ((imc / 4) * 100)+"%");

    }
}

