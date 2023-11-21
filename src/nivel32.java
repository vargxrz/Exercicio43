/*
Foi feita uma pesquisa de audiência de canal de TV em várias
casas de uma cidade, em um determinado dia. Para cada casa consultada foi
fornecido o número do canal (4, 5, 7, 12) e o número de pessoas que estavam assistindo aquele canal.
Se a televisão estivesse desligada, nada era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:

Leia um número indeterminado de dados (número do canal e o número de pessoas que estavam assistindo);
Calcule e mostre a percentagem de audiência de cada canal.
Para encerrar a entrada de dados digite o número do canal ZERO.
 */
package src;

import java.util.Scanner;

public class nivel32 {
    public static void main(String[] args) {

        int quantidadePessoas = 0;
        int canal4 = 0;
        int contador4 = 0;
        int contador5 = 0;
        int contador7 = 0;
        int contador12 = 0;
        int canal5 = 0;
        int canal7 = 0;
        int canal12 = 0;
        int opcaoSelecionada = 1;

        while (opcaoSelecionada != 0) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Canal (4) Canal (5) Canal (7) Canal (12)\n" +
                    "Digite o canal que você esta assistindo: ");
            opcaoSelecionada = scanner.nextInt();

            if (opcaoSelecionada == 4) {
                System.out.println("Quantas pessoas estão assistindo?");
                canal4 = scanner.nextInt();
                if(canal4 > 0){
                    contador4 += canal4;
                }else {
                    System.out.println("Deve ter no minimo uma pessoa assistindo.");
                }
            } else if (opcaoSelecionada == 5) {
                System.out.println("Quantas pessoas estão assistindo?");
                canal5 = scanner.nextInt();

                if(canal5 > 0){
                    contador5 += canal5;
                }else {
                    System.out.println("Deve ter no minimo uma pessoa assistindo.");
                }
            } else if (opcaoSelecionada == 7) {
                System.out.println("Quantas pessoas estão assistindo?");
                canal7 = scanner.nextInt();

                if(canal7 > 0){
                    contador7 += canal7;
                }else {
                    System.out.println("Deve ter no minimo uma pessoa assistindo.");
                }

            } else if (opcaoSelecionada == 12) {
                System.out.println("Quantas pessoas estão assistindo?");
                canal12 = scanner.nextInt();

                if(canal12 > 0){
                    contador12= canal12;
                }else {
                    System.out.println("Deve ter no minimo uma pessoa assistindo.");
                }

            } else if (opcaoSelecionada == 0) {
                System.out.println("Encerrando o seu programa!");
            } else {
                System.out.println("Opção inválida");
            }
        }
        int totalPessoas = (canal4 + canal5 + canal7 + canal12);

        System.out.println("Total de pessoas que estavam assistindo " + totalPessoas);
        System.out.println("Total de pessoas que estavam assistindo canal 4: " + canal4 + " pessoas");
        System.out.println("Total de pessoas que estavam assistindo canal 5: " + canal5 + " pessoas");
        System.out.println("Total de pessoas que estavam assistindo canal 7: " + canal7 + " pessoas");
        System.out.println("Total de pessoas que estavam assistindo canal 12: " + canal12 + " pessoas\n");

        System.out.println("Porcentagem de pessoas que estavam vendo o canal 4 é: " + (canal4 * 100) / totalPessoas + "%");
        System.out.println("Porcentagem de pessoas que estavam vendo o canal 5 é: " + (canal5 * 100) / totalPessoas + "%");
        System.out.println("Porcentagem de pessoas que estavam vendo o canal 7 é: " + (canal7 * 100) / totalPessoas + "%");
        System.out.println("Porcentagem de pessoas que estavam vendo o canal 12 é: " + (canal12 * 100) / totalPessoas + "%");

    }
}


