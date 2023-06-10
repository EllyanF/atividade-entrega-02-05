/*3.	Faça um Programa que leia 4 notas, mostre as notas e a média na tela. */

import java.text.DecimalFormat;
import java.util.Random;

public class Tres {
    public static void main(String[] args) {
        Random rand = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        double notas[] = new double[4];
        double soma = 0;

        for (int i = 0; i < 4; i++) {
            double nota = rand.nextDouble(10);
            notas[i] = nota;
            soma += nota;
        }

        System.out.println("As notas são:");

        for (double numero : notas) {
            System.out.println(decimalFormat.format(numero));
        }

        System.out.println("A média das notas é: " + decimalFormat.format(soma/notas.length));
    }
}
