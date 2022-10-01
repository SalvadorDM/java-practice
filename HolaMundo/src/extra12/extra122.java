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
public class extra122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[10];
        String[] vector2 = new String[10];
        int num1, num2, num3, j, k;

        for (int i = 0; i < 10; i++) {
            vector[i] = i;
        }
        for (int i = 0; i < 10; i++) {

            if (i == 3) {
                vector2[i] = "E";

            } else {

                vector2[i] = String.valueOf(vector[i]);
            }

            for (int l = 0; l < 10; l++) {
                for (int m = 0; m < 10; m++) {
                    for (int n = 0; n < 10; n++) {
                        System.out.println(vector2[l] + "-" + vector2[m] + "-" + vector[n]);

                    }
                }
            }

        }

    }
}
