/*8.	Faça um Programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor. 
Imprima a idade e a altura na ordem inversa a ordem lida. */

import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double altura[] = new double[5];
        int idade[] = new int[5];

        for (int i = 1; i < 6; i++) {
            System.out.printf("Insira a %dª idade:\n", i);
            idade[i-1] = input.nextInt();
            System.out.printf("Insira a %dª altura:\n", i);
            altura[i-1] = input.nextDouble();
        }
        input.close();

        System.out.println("Idade e altura na ordem inversa:");

        for (int i = idade.length-1; i >= 0; i--) {
            System.out.println("Idade: " + idade[i]);
            System.out.println("Altura: " + altura[i]);
        }
    }
}
