/*3. Faça um programa que faça a leitura de 5 valores, e para cada valor, mostre o seu dobro na tela.  */

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite o %d° número:\n", i);
            int num = input.nextInt();
            System.out.printf("O número digitado é %d e seu dobro é %d.\n", num, (num*2));
        }
        input.close();
    }
}
