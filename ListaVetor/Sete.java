/*7.	Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números. */

import java.util.Random;

public class Sete {
    public static void main(String[] args) {
        Random rand = new Random();
        int numeros[] = new int[5];
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            numeros[i] = rand.nextInt(100);
        }

        System.out.println("Os números são:");

        for (int i : numeros) {
            System.out.println(i);
            soma += i;
        }
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A multiplicação dos números é: " + multiplicaNumeros(numeros));
    }

    private static int multiplicaNumeros(int numeros[]) {
        int multiplicacao = 1;
        for (int i : numeros) {
            multiplicacao *= i;
        }

        return multiplicacao;
    }
}
