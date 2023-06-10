/*12.	Foram anotadas as idades e alturas de 30 alunos. 
Faça um Programa que determine quantos alunos com mais de 13 anos possuem altura 
inferior à média de altura desses alunos. */

import java.util.Scanner;

public class Doze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arrayIdade = new int[30];
        double[] arrayAltura = new double[30];
        int contaAlunos = 0;
        double mediaAltura;

        for (int i = 0; i < 30; i++) {
            System.out.printf("Informe a %dª idade:\n", i+1);
            arrayIdade[i] = input.nextInt();

            System.out.printf("Informe a %dª altura:\n", i+1);
            arrayAltura[i] = input.nextDouble();
        }

        input.close();

        mediaAltura = calcularMediaAltura(arrayAltura);

        for (int i = 0; i < 30; i++) {
            if (arrayIdade[i] > 13 && arrayAltura[i] < mediaAltura) {
                contaAlunos++;
            }
        }

        System.out.println("Altura média: " + mediaAltura);
        System.out.printf("Houveram %d alunos abaixo da altura média\n", contaAlunos);
    }

    private static double calcularMediaAltura(double[] arrayAltura) {
        double soma = 0;

        for (double i : arrayAltura) {
            soma += i;
        }

        return soma / arrayAltura.length;
    }
}
