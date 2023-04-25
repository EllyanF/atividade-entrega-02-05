/*7. Faça um programa que leia as notas de 5 alunos, e que exiba a maior e menor notas entre elas. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Float> list = new ArrayList<>();

        for (int i = 1; i < 6; i++){
            System.out.printf("Insira a nota do %d° aluno:\n", i);
            float nota = input.nextFloat();
            list.add(nota);
        }

        input.close();
        
        System.out.printf("A maior nota foi %.1f e a menor nota foi %.1f\n", Collections.max(list), Collections.min(list) );
    }
}
