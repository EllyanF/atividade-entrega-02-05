/*10.	Faça um Programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos, 
cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores. */

import java.util.Arrays;
import java.util.Random;

public class Dez {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        int[] arrayIntercalado = new int[20];
        int index = 0;

        for (int i = 0; i < 10; i++) {
            arrayA[i] = rand.nextInt(50);
            arrayB[i] = rand.nextInt(50);
        }

        //Exibindo os valores dos arrays
        System.out.println("arrayA: " + Arrays.toString(arrayA));
        System.out.println("arrayB: " + Arrays.toString(arrayB));

        //Intercalando os valores dos arrays
        for (int i = 0; i < 10; i++) {
            arrayIntercalado[index++] = arrayA[i];
            arrayIntercalado[index++] = arrayB[i];
        }

        //Exibindo os valores intercalados
        System.out.println(Arrays.toString(arrayIntercalado));
    }
}
