/*4.	Faça um Programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. 
Imprima as consoantes. */

import java.util.ArrayList;
import java.util.Random;

class Quatro {
    public static void main(String[] args) {
        Random rand = new Random();

        char[] arrayLetras = new char[10];
        ArrayList<Character> consoantes = new ArrayList<>();

        for (int i = 0; i < arrayLetras.length; i++) {
            arrayLetras[i] = (char) (rand.nextInt(26) + 'a');
        }

        //Verificando consoantes
        for (int i = 0; i < arrayLetras.length; i++) {
            char letra = arrayLetras[i];
            if (!verificaVogal(letra)) {
                consoantes.add(letra);
            }
        }

        System.out.println("Consoantes: " + String.valueOf(consoantes));
        System.out.printf("Foram encontradas %d consoantes\n", consoantes.size());
    }

    private static boolean verificaVogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    };
}
