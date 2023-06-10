/*11.	Altere o programa anterior, intercalando 3 vetores de 10 elementos cada. */

import java.util.Arrays;
import java.util.Random;

public class Onze {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        int[] arrayC = new int[10];
        int[] arrayIntercalado = new int[30];
        int index = 0;

        for (int i = 0; i < 10; i++) {
            arrayA[i] = rand.nextInt(50);
            arrayB[i] = rand.nextInt(50);
            arrayC[i] = rand.nextInt(50);
        }

        //Exibindo os valores dos arrays
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(arrayC));

        //Intercalando os valores dos arrays
        for (int i = 0; i < 10; i++) {
            arrayIntercalado[index++] = arrayA[i];
            arrayIntercalado[index++] = arrayB[i];
            arrayIntercalado[index++] = arrayC[i];
        }

        System.out.println(Arrays.toString(arrayIntercalado));
    }
}
