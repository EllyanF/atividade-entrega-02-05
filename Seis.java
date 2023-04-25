/*6. Faça um programa que leia o sexo e o peso de 10 pessoas, e mostre quantas pessoas do sexo masculino possuem 
peso entre 60 e 80 kg, bem como a quantidade de mulheres que possuem peso entre 50 e 70 kg. */

import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int homensPesoEntre60e80 = 0;
        int mulheresPesoEntre50e70 = 0;

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d° pessoa\n", i);
            System.out.println("Informe o seu sexo: M - Masculino F - Feminino");
            String sexo = input.nextLine().toUpperCase();
            System.out.println("Informe o seu peso:");
            float peso = input.nextFloat();
            input.nextLine();

            if (sexo.equals("M") && peso >= 60 && peso <= 80) {
                homensPesoEntre60e80++;
            } else if (sexo.equals("F") && peso >= 50 && peso <= 70) {
                mulheresPesoEntre50e70++;
            }

        }

        input.close();

        System.out.printf("Há %d homens com peso entre 60 e 80 kgs\n", homensPesoEntre60e80);
        System.out.printf("Há %d mulheres com peso entre 50 e 70 kgs\n", mulheresPesoEntre50e70);
    }
}
