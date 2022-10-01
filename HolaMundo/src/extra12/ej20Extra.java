/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package extra12;

/**
 *
 * @author Salvador
 */
public class ej20Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vector = new int[10];
        llenarVector(vector);
        imprimirVector(vector);

    }

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 20);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
    }
}
