/*
Faça um programa que apresente o menu de opções a seguir:

Menu de opções:

1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada:

Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem
 */
package src;

import java.util.Scanner;

public class nivel38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        int totalAritmetico = 0;
        int contagemAritmetica = 0;

        System.out.print("1 - Media Aritmetica\n" +
                "2 - Media Ponderada\n" +
                "3 - Sair\n" +
                "Digite uma opçao: ");

        opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.print("Digite a primeira nota para calcular a media Aritmetica: ");
                int numeroAritmetico1 = scanner.nextInt();
                System.out.print("Digite a segunda nota para calcular a media Aritmetica:");
                int numeroAritmetico2 = scanner.nextInt();
                totalAritmetico = numeroAritmetico2 + numeroAritmetico1;

                System.out.print("\nA media aritmetica é: " + (totalAritmetico / 2));
                break;
            case 2:
                System.out.println("Digite a primeira nota:");
                double nota1 = scanner.nextDouble();

                System.out.println("Digite o peso da primeira nota:");
                double peso1 = scanner.nextDouble();

                System.out.println("Digite a segunda nota:");
                double nota2 = scanner.nextDouble();

                System.out.println("Digite o peso da segunda nota:");
                double peso2 = scanner.nextDouble();

                System.out.println("Digite a terceira nota:");
                double nota3 = scanner.nextDouble();

                System.out.println("Digite o peso da terceira nota:");
                double peso3 = scanner.nextDouble();

                double totalPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3 ) / (peso1 + peso2 + peso3);

                System.out.println("A media ponderada é: " + totalPonderada);
                break;

            case 3:
                break;

            default:
                System.out.println("Nenhuma das opções selecionadas.");
                break;


        }


        }
    }

