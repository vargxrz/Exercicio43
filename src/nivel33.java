/*
A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando dados sobre o salário e o número de filhos.
 A prefeitura deseja saber:

A média do salário da população;
A média do número de filhos;
O maior salário;
A percentagem de pessoas com salários até R$ 150,00.   O final da leitura de dados dar-se-á com a entrada de um salário negativo.
 */
package src;

import java.util.Scanner;

public class nivel33 {
    public static void main(String[] args) {

           double salario = 0;
           int numeroFilhos = 0;
           double totalSalario = 0;
           int totalFilhos = 0;
           double maiorSalario = 0;
           int contagem = 0;
           int contadorTotal = 0;
           int contador150 = 0;



        for (int i = 1; i <= 3; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite seu salario: ");
            salario = scanner.nextDouble();

            System.out.println("Digite o numero de filhos: ");
            numeroFilhos = scanner.nextInt();

            totalSalario += salario;
            contagem++;

            totalFilhos += numeroFilhos;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }
            if (salario < 150){
                contador150++;

            }
            contadorTotal++;
        }
        System.out.println("A media de salarios é: R$" + (totalSalario / contagem));
        System.out.println("A media de filhos é: " + (totalFilhos / contagem));
        System.out.println("O maior salário é: " + maiorSalario);
        System.out.println("A porcentagem de pessoas com salario até R$150 é: " + (contador150 * 100) / contadorTotal + "%");
    }
}