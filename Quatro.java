/*4. Faça um programa que leia um número e que imprima os números ímpares de 1 até o número informado.  */

import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = input.nextInt();
        for (int i = 1; i < num; i++) {
            if (verificaImpar(i)) {
                System.out.println(i);
            }
        }

        input.close();
    }

    private static boolean verificaImpar(int num) {
        return num % 2 != 0 ? true : false;
    }
}
