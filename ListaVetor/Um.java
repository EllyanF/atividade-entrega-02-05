/*1.	Faça um Programa que leia um vetor de 5 números inteiros e mostre-os. */

import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetor[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe o %d° digito:\n", i+1);
            vetor[i] = input.nextInt();
        }
        input.close();

        System.out.println("Os números do vetor são:");

        for (int numero : vetor) {
            System.out.println(numero);
        }
    }
}
