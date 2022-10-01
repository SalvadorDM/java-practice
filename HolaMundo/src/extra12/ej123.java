/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra12;

/**
 *
 * @author Salvador
 */
public class ej123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        String[] vectorDos = new String[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = i;
        }

        for (int i = 0; i < 10; i++) {

            if (i == 3) {
                vectorDos[i] = "E";
            } else {
                vectorDos[i] = String.valueOf(vector[i]);
            }

        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {

                    System.out.println(vectorDos[i] + "-" + vectorDos[j] + "-" + vectorDos[k]);
                }
            }

        }

    }

}
