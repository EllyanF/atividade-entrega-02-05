/*2.	Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa. */

import java.util.Random;

public class Dois {
    public static void main(String[] args) {
        Random rand = new Random();
        int limite = 50;
        double vetor[] = new double[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = rand.nextDouble(limite);
        }

        System.out.println("Números do vetor:");

        for (double numero : vetor) {
            System.out.printf("%.2f  ", numero);
        }

        System.out.printf("\nNúmeros do vetor ao contrário:\n");

        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.printf("%.2f  ", vetor[i]);
        }
    }
}
