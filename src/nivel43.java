/*
Faça um programa que apresente o menu de opções a seguir, que permita ao usuário escolher a opção desejada, receba os dados necessários para executar a operação e mostre o resultado.
Verificar a possibilidade de opção inválida e não se preocupar com as restrições, como salário inválido.
Menu de opções:
1. Novo salário
2. Férias
3. Décimo terceiro
4. Sair
Digite a opção desejada :
Na Opção 1: receber o salário de um funcionário, calcular e mostrar o novo salário usando as regras a seguir.
Salários	Percentagem de aumento
Até R$ 350,00	15%
De R$ 350,00 a R$ 600,00	10%
Acima de R$ 600,00	5%
Na opção 2: receber o salário de um funcionário, calcular e mostrar o valor de suas férias. Sabe-se que as férias equivalem ao seu salário acrescido de 1/3.

Na opção 3: receber o salário de um funcionário e o número de meses de trabalho na empresa, no máximo 12, calcular e mostrar o valor do décimo terceiro.
Sabe-se que o décimo terceiro equivale ao seu salário multiplicado pelo número de meses de trabalho dividido por 12.
Na opção 4: sair do programa.
 */
package src;

import java.util.Scanner;

public class nivel43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 0;
        double aumento = 0;
        double salarioAumento = 0;
        System.out.print("1 - Novo Salario\n" +
                "2 - Ferias\n" +
                "3 - Decimo Terceiro\n" +
                "4 - Sair\n" +
                "Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite seu salario: ");
                 salario = scanner.nextDouble();
                if (salario <= 350) {
                    aumento = salario * 0.15;
                    salarioAumento = aumento + salario;
                    System.out.println("Seu novo salario com 15% de aumento é: R$" + salarioAumento);
                } else if (salario <= 600) {
                    aumento = salario * 0.10;
                    salarioAumento = aumento + salario;
                    System.out.println("Seu novo salario com 10% de aumento é: R$" + salarioAumento);
                } else {
                    aumento = salario * 0.10;
                    salarioAumento = aumento + salario;
                    System.out.println("Seu novo salario com 5% de aumento é: R$" + salarioAumento);
                } break;

            case 2:
                System.out.println("Digite seu salario: ");
                  salario = scanner.nextDouble();
                  double ferias = salario / 3;
                  double valorDasFerias = ferias + salario;
                System.out.println("O valor das ferias com base no salario de R$" + salario + " é equivalente a: R$" + valorDasFerias);
                  break;

            case 3:
                System.out.println("Digite seu salario: ");
                salario = scanner.nextDouble();
                System.out.println("A quantos meses você esta na empresa? ");
                int mesesEmpresa = scanner.nextInt();
                double calcularDecimo = salario * mesesEmpresa;
                double DecimoTerceiro = calcularDecimo / 12;
                System.out.println("O valor do seu decimo terceiro é: R$" + DecimoTerceiro);
                break;
            case 4:
                break;

        }

    }
}

