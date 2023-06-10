/*14.	Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
a.	"Telefonou para a vítima?"
b.	"Esteve no local do crime?"
c.	"Mora perto da vítima?"
d.	"Devia para a vítima?"
e.	"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a 
participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve 
ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, 
ele será classificado como "Inocente".
 */

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Quatorze {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int respostasPositivas = 0;

        List<String> perguntas = Arrays.asList(new String[] {
                "Telefonou para a vítima?",
                "Esteve no local do crime?",
                "Mora perto da vítima?",
                "Devia para a vítima?",
                "Já trabalhou com a vítima?"
        });

        for (String s : perguntas) {
            System.out.println(s);
            String resposta = input.nextLine();
            if (resposta.equals("sim")) {
                respostasPositivas++;
            }
        }


        input.close();

        System.out.println((respostasPositivas == 2) ? "Suspeita"
                : (respostasPositivas > 2 && respostasPositivas < 5)
                ? "Cúmplice"
                : (respostasPositivas == 5)
                ? "Assassino"
                : "Inocente");
    }
}
