/*2. A prefeitura de uma cidade fez uma pesquisa entre os seus habitantes, coletando dados sobre o salário e o número de filhos. A prefeitura deseja saber: 
a ) A média do salário da população; 
b ) A média do número de filhos. 
O final da leitura de dados dar-se-á com a entrada de salários negativos. 
 */

 import java.util.Scanner;

 public class Dois {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         float valorSalarios = 0;
         int quantidadeFilhos = 0;
         int quantidadeEntrevistados = 0;
         
         System.out.println("----- Pesquisa da prefeitura -----");
         
         loop: while (true) {
             System.out.println("Escolha uma opção:\nresponder\nsair\nver resultado");
             String resposta = input.nextLine();
 
             switch (resposta) {
                 case "responder":
                     System.out.println("Informe seu salário:");
                     float salario = Float.parseFloat(input.nextLine());
                     valorSalarios += salario;
 
                     if (salario < 0) {
                         System.out.println("Fim. Não é possível recerber salário negativo!");
                         break loop;
                     }
 
                     System.out.println("Informe quantos filhos você tem:");
                     quantidadeFilhos += input.nextInt();
                     input.nextLine();
                     quantidadeEntrevistados++;
                     continue;
                 case "sair":
                     System.out.println("Fim do programa!");
                     break loop;
                 case "ver resultado":
                     if (quantidadeEntrevistados == 0) {
                         System.out.println("Ninguém foi entrevistado ainda");
                         break;
                     }
 
                     float mediaSalarial = valorSalarios / quantidadeEntrevistados;
                     int mediaFilhos = quantidadeFilhos / quantidadeEntrevistados;
                     System.out.printf("Houveram %d pessoa(s) entrevistadas.", quantidadeEntrevistados);
                     System.out.printf("A média salarial é de R$%.2f por pessoa.", mediaSalarial);
                     System.out.printf("A média de filhos por pessoa é de %d\n", mediaFilhos);
             }
         }
         input.close();
     }
 }
 