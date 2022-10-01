/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package cuentaapp;

import cuentaapp.entidades.Cuenta;
import cuentaapp.servicios.CuentaService;
import java.util.Scanner;

/**
 *
 * @author Salvador
 */
public class CuentaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        double ingreso, retiro;
        String letra;
        Scanner leer = new Scanner(System.in);
        CuentaService cuentas = new CuentaService();
        
        
        System.out.println("bienvenido, cree su cuenta bancaria?");
        Cuenta c1 = cuentas.crearCuenta();
                         
        
        do {
            
            System.out.println("ingrese una opcion numerica");
            System.out.println("1-ingresar dinero");
            System.out.println("2-retirar dinero");
            System.out.println("3-extraccion rapida");
            System.out.println("4-consultar saldo");
            System.out.println("5-consultar datos");
            System.out.println("6-Salir");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("ingrese cantidad a ingresar");
                    ingreso = leer.nextDouble();
                    c1.ingresar(ingreso);
                    break;
                case 2:
                    System.out.println("ingrese cantidad a retirar");
                    retiro = leer.nextDouble();
                    c1.retirar(retiro);
                    break;
                case 3:
                    c1.extraccionRapida();
                    break;
                case 4:
                    c1.consultarSaldo();
                    break;
                case 5:
                    c1.consultarDatos();
                    break;
                case 6:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("la opcion ingresada es incorrecta");
                    break;
                            
            }
        
        
        
        
        
        
        
        } while (op!=6);
        
        
        
        
        
        
        
        
        
        
    }
    
}
