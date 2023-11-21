/*
Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código. Os códigos utilizados são:

1, 2, 3, 4	Votos para os respectivos candidatos
5	Voto nulo
6	Voto em branco
Faça um programa que calcule e mostre:

O total de votos para cada candidato;
O total de votos nulos:
O total de votos em branco;
A percentagem de votos nulos sobre o total de votos;
A percentagem de votos em branco sobre o total de votos.
Para finalizar o conjunto de votos, tem-se o valor zero.
 */
package src;

import java.util.Scanner;

public class nivel39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contagemVoto1 = 0;
        int contagemVoto2 = 0;
        int contagemVoto3 = 0;
        int contagemVoto4 = 0;
        int contagemVoto5 = 0;
        int contagemVoto6 = 0;
        int contagemtotal = 0;



        for (int i = 1; i <= 6; i++) {


            System.out.print("1 - Luiz Inácio Lula da Silva\n" +
                    "2 - Jair Messias Bolsonaro\n" +
                    "3 - Ciro Gomes \n" +
                    "4 - Marina Silva\n" +
                    "5 - Voto Nulo\n" +
                    "6 - Voto em branco\n" +
                    "Digite o voto " + i + ":" );
            int voto = scanner.nextInt();

            if(voto == 1){
                contagemVoto1++;
            }
            else if (voto == 2){
                contagemVoto2++;
            }
            else if (voto == 3){
                contagemVoto3++;
            }
            else if (voto == 4){
                contagemVoto4++;
            }
            else if (voto == 5){
                contagemVoto5++;
            }
            else if (voto == 6){
                contagemVoto6++;
            } else {
                System.out.println("Nenhuma opção selecionada!");
            }
            contagemtotal++;
        }
        if (contagemVoto1 > 0) {
            System.out.println("O numero de votos para Luiz Inácio Lula da Silva é: " + contagemVoto1);
        } else {
            System.out.println("O candidato Luiz Inácio Lula da Silva nao recebeu nenhum voto!");
        }
        if (contagemVoto2 > 0) {
            System.out.println("O numero de votos para Jair Messias Bolsonaro é: " + contagemVoto2);
        } else {
            System.out.println("O candidato Jair Messias Bolsonaro nao recebeu nenhum voto!");
        }
        if (contagemVoto3 > 0) {
            System.out.println("O numero de votos para Ciro Gomes é: " + contagemVoto3);
        } else {
            System.out.println("O candidato Ciro Gomes nao recebeu nenhum voto!");
        }
        if (contagemVoto4 > 0) {
            System.out.println("O numero de votos para Marina Silva é: " + contagemVoto4);
        } else {
            System.out.println("Marina Silva nao recebeu nenhum voto!");
        }
        if (contagemVoto1 > 0) {
            System.out.println("O total de votos nulos é: " + contagemVoto5);
        } else {
            System.out.println("Nenhum voto nulo foi informado!");
        }
        if (contagemVoto1 > 0) {
            System.out.println("O total de votos em branco é: " + contagemVoto6);
        } else {
            System.out.println("Nenhum voto em branco foi informado!");
        }
        System.out.println("A porcentagem de votos nulos sobre o total de votos é: " + (contagemVoto5 * 100) / contagemtotal + "%");
        System.out.println("A porcentagem de votos em branco sobre o total de votos é: " + (contagemVoto6 * 100) / contagemtotal + "%");

    }
}

