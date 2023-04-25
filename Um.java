/*1. Faça um programa que solicite ao usuário que informe a matrícula e as três notas de um conjunto de alunos. 
O programa deverá exibir a mensagem informando se o aluno foi aprovado (média maior ou igual a 70), 
exame (nota maior ou igual a 60 e menor que 70) ou reprovado (nota inferior a 60). 
O programa irá terminar quando o usuário informar uma matrícula negativa.  */

import java.util.ArrayList;
import java.util.Scanner;

public class Um {
    public static void main(String[] args) {
        ArrayList<Float> notas = new ArrayList<Float>();
        Scanner input = new Scanner(System.in);

        System.out.println("Insira sua matrícula:");
        int matricula = input.nextInt();
        
        if (matricula < 0) {
            System.out.println("Matrícula inválida. Fim do programa");
        }

        for (int i = 1; i < 4; i++) {
            System.out.printf("Insira a %d° nota:\n", i);
            float nota = input.nextFloat();
            notas.add(nota);
        }

        input.close();
        
        float mediaNotas = mediaNotas(notas);

        String situacao  = (mediaNotas >= 70) ? "aprovado" 
        : (mediaNotas >= 60 && mediaNotas < 70) ? "em exame" : "reprovado";

        System.out.printf("A média do aluno foi de %.1f pontos e ele está %s" , mediaNotas, situacao);
    }

    private static float mediaNotas(ArrayList<Float> notas) {
        float soma = 0;
        for (float i: notas) {
            soma += i;
        }
        return soma/3;
    }
}
