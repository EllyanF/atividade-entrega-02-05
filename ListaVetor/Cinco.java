/*5.	Faça um Programa que leia 20 números inteiros e armazene-os num vetor. 
Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores. */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Cinco {
    public static void main(String[] args) {
        Random rand = new Random();
        int vetor[] = new int[20];
        List<Integer> numeroImpar = new ArrayList<>();
        List<Integer> numeroPar = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            vetor[i] = rand.nextInt(20);
        }

        for (int i = 0; i < 20; i++) {
            if (vetor[i] % 2 != 0) {
                numeroImpar.add(vetor[i]);
            } else {
                numeroPar.add(vetor[i]);
            }
        }

        System.out.println("Números no vetor: " + Arrays.toString(vetor));

        Object[] arrayNumeroImpar = numeroImpar.toArray();
        Object[] arrayNumeroPar = numeroPar.toArray();

        System.out.println("Números ímpares: " + Arrays.toString(arrayNumeroImpar));

        System.out.println("Números pares: " + Arrays.toString(arrayNumeroPar));
    }
}
