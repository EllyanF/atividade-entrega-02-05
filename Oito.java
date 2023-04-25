/*8. Faça um programa que leia a idade e peso de sete pessoas. Calcule e mostre:
	- a quantidade de pessoas com mais de 90 kg
	- a média das idades das sete pessoas
 */

 import java.util.Scanner;

 public class Oito {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int totalIdades = 0;
         int pessoasMais90kgs = 0;
 
         for (int i = 1; i < 8; i++) {
             System.out.printf("%d° Pessoa: informe sua idade:\n", i);
             totalIdades += input.nextInt();
             System.out.printf("%d° Pessoa: informe seu peso:\n", i);
             int peso = input.nextInt();
 
             if (peso > 90) {
                 pessoasMais90kgs++;
             }
         }
         input.close();
 
         System.out.printf("Há %d pessoas acima de 90 Kgs. A idade média das pessoas é de %d anos", 
             pessoasMais90kgs, (totalIdades/7));
     }
 }
 