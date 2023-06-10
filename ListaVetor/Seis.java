/*6.	Faça um Programa que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, 
imprima o número de alunos com média maior ou igual a 7.0. */

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alunosMediaIgualMaior7 = 0;
        int contaAluno = 0;
        double medias[] = new double[10];

        for (int i = 1; i < 11; i++) {
            double notas[] = new double[4];
            for (int y = 1; y < 5; y++) {
                System.out.printf("Insira a %dª nota do %d° aluno:\n", y, i);
                notas[y-1] = input.nextDouble();
            }

            medias[contaAluno] = calculaMedia(notas);
            contaAluno++;
        }
        input.close();

        for (double i : medias) {
            if (i >= 7) {
                alunosMediaIgualMaior7++;
            }
        }

        System.out.printf("Houveram %d alunos com média maior ou igual à 7", alunosMediaIgualMaior7);
    }

    private static double calculaMedia(double notas[]) {
        double media = 0;
        for (double i : notas) {
            media += i;
        }
        
        return media/ notas.length;
    }
}
