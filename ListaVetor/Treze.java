/*13.	Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. 
Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual, e em 
que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ). */

import java.util.Random;

public class Treze {
    public static void main(String[] args) {
        Random rand = new Random();

        String[] arrayMeses = mesesAno();
        int[] arrayTemeperatura = new int[12];

        // Populando array com as respectivas temperaturas
        for (int i = 0; i < 12; i++) {
            arrayTemeperatura[i] = rand.nextInt(40);
        }

        int TempMedia = calcularTempMedia(arrayTemeperatura);

        System.out.printf("Temperatura média do ano: %d °C\n", TempMedia);

        System.out.println("Meses cuja temperatura ficaram acima da média:");
        for (int i = 0; i < 12; i++) {
            if (arrayTemeperatura[i] > TempMedia) {
                System.out.printf("%d - %s - Temperatura: %d °C\n", i+1, arrayMeses[i], arrayTemeperatura[i]);
            }
        }
    }

    private static String[] mesesAno() {
        String[] arrayMeses = {
            "Janeiro", 
            "Fevereiro", 
            "Março", 
            "Abril", 
            "Maio", 
            "Junho", 
            "Julho", 
            "Agosto",
            "Setembro",
            "Outubro", 
            "Novembro", 
            "Dezembro"
        };

        return arrayMeses;
    }

    private static int calcularTempMedia(int[] arrayTemeperatura) {
        int soma = 0;

        for (int i : arrayTemeperatura) {
            soma += i;
        }

        return soma / arrayTemeperatura.length;
    }
}
