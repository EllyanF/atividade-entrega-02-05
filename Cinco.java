/*5. Faça um programa que solicite ao usuário que informe o valor das temperaturas coletadas nos 10 
primeiros dias do mês de janeiro de 2021, em Belo Horizonte. Imprima em seguida a média dessas temperaturas. */

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temp = 0;

        for (int i = 1; i < 11; i++) {
            System.out.printf("Insira a temperatura do %d° dia de Janeiro:\n", i);
            temp += input.nextFloat();
        }

        System.out.printf("A média de temperatura foi de %.2f °C\n", (temp / 10));
        input.close();
    }
}
