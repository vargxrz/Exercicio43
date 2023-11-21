/*
Faça um programa que apresente um menu de opções para o cálculo das seguintes operações
entre dois números: adição, subtração, multiplicação e divisão. O programa deve usar laços de
repetição para possibilitar ao usuário a escolha da operação desejada, a exibição do resultado
e a volta ao menu de opções. O programa só termina quando for escolhida a opção de saída.
 */
package src;

import java.util.Scanner;

public class nivel42B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean control = true;
        while (control) {


            System.out.println("\n1 - Adição\n" +
                    "2 - Subtração\n" +
                    "3 - Multiplicação\n" +
                    "4 - Divisão\n" +
                    "5 - Sair\n" +
                    "Digite uma opção: ");

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro numero: ");
                    int numero1Adicao = scanner.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int numero2Adicao = scanner.nextInt();
                    int totalAdicao = numero1Adicao + numero2Adicao;
                    System.out.print(numero1Adicao + " + " + numero2Adicao + " = " + totalAdicao);
                    break;
                case 2:
                    System.out.print("Digite o primeiro numero: ");
                    int numero1Sub = scanner.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int numero2Sub = scanner.nextInt();
                    int totalSubtracao = numero1Sub - numero2Sub;
                    System.out.print(numero1Sub + " - " + numero2Sub + " = " + totalSubtracao);
                    break;
                case 3:
                    System.out.print("Digite o primeiro numero: ");
                    int numero1Multi = scanner.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    int numero2Multi = scanner.nextInt();
                    int totalMultiplicacao = numero1Multi * numero2Multi;
                    System.out.print(numero1Multi + " x " + numero2Multi + " = " + totalMultiplicacao+ "\n");
                    break;
                case 4:
                    System.out.print("Digite o primeiro numero: ");
                    float numero1Divi = scanner.nextInt();
                    System.out.print("Digite o segundo numero: ");
                    float numero2Divi = scanner.nextInt();
                    float totalDivisao = numero1Divi / numero2Divi;
                    System.out.print(numero1Divi + " / " + numero2Divi + " = " + totalDivisao + "\n");
                    break;
                case 5:
                    control = false;
                    break;
            }
        }
    }
}