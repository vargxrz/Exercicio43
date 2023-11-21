/*
Faça um programa que apresente um menu de opções para o cálculo das seguintes operações entre dois números:
adição, subtração, multiplicação e divisão. O programa deve usar laços de repetição para possibilitar ao usuário a escolha
da operação desejada, a exibição do resultado e a volta ao menu de opções. O programa só termina quando for escolhida
a opção de saída. package src;
 */

import java.util.Scanner;

public class nivel42 {
    public static void main(String[] args) {


        teste();



    }

    private static void teste(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Adição\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão\n" +
                "5 - Sair\n" +
                "Digite uma opção: ");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o primeiro numero: ");
                int numero1Adicao = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                int numero2Adicao = scanner.nextInt();
                int totalAdicao = numero1Adicao + numero2Adicao;
                System.out.println(numero1Adicao + " + " + numero2Adicao + " = " + totalAdicao);
                break;
            case 2:
                System.out.println("Digite o primeiro numero: ");
                int numero1Sub = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                int numero2Sub = scanner.nextInt();
                int totalSubtracao = numero1Sub - numero2Sub;
                System.out.println(numero1Sub + " - " + numero2Sub + " = " + totalSubtracao);
                break;
            case 3:
                System.out.println("Digite o primeiro numero: ");
                int numero1Multi = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                int numero2Multi = scanner.nextInt();
                int totalMultiplicacao = numero1Multi * numero2Multi;
                System.out.println(numero1Multi + " x " + numero2Multi + " = " + totalMultiplicacao);
                break;
            case 4:
                System.out.println("Digite o primeiro numero: ");
                float numero1Divi = scanner.nextInt();
                System.out.println("Digite o segundo numero: ");
                float numero2Divi = scanner.nextInt();
                float totalDivisao = numero1Divi / numero2Divi;
                System.out.println(numero1Divi + " / " + numero2Divi + " = " + totalDivisao);
                break;
            case 5:
                System.exit(0);
                break;


        }

        teste();


    }
}
