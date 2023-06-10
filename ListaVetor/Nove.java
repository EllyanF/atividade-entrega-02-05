/*9.	Faça um Programa que leia um vetor A com 10 números inteiros, 
calcule e mostre a soma dos quadrados dos elementos do vetor. */

import java.util.Random;

public class Nove {
    public static void main(String[] args) {
        Random rand = new Random();
        int nums[] = new int[10];
        int quadrados[] = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = rand.nextInt(30);
            quadrados[i] = nums[i] * 2;
        }

        System.out.println("A soma dos quadrados dos elementos é " + somaQuadrado(quadrados));
    }

    private static int somaQuadrado(int quadrados[]) {
        int soma = 0;
        for (int num : quadrados) {
            soma += num;
        }
        return soma;
    }
}
