/*
Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas. Calcule e mostre as médias dos pesos das pessoas
da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos.
 */
package src;

import java.util.Scanner;

public class nivel26 {
    public static void main(String[] args) {

        int idade = 0;
        int peso = 0;
        int contagem1 = 0;
        int contagem2 = 0;
        int contagem3 = 0;
        int contagem4 = 0;
        int media1e10 = 0;
        int media11e20 = 0;
        int media21a30 = 0;
        int mediaMaiorque30 = 0;

        for (int i = 1; i <= 5; i++) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a idade " + i + " : ");
            idade = scanner.nextInt();

            System.out.println("Digite seu peso " + i + " : ");
            peso = scanner.nextInt();

            if (idade >= 1 && idade <= 10) {
                contagem1++;
                media1e10 += peso;
            }
            if (idade >= 11 && idade <= 20) {
                contagem2++;
                media11e20 += peso;
            }
            if (idade >= 21 && idade <= 30) {
                contagem3++;
                media21a30 += peso;
            }
            if (idade >= 31) {
                contagem4++;
                mediaMaiorque30 += peso;
            }

        }
       if (contagem1 > 0) {
           System.out.println("A media de peso de pessoas entre 1 e 10 anos é: " + (media1e10 / contagem1));
       }
       else {
           System.out.println("Nenhuma idade entre 1 e 10 foi informada!");
       }
        if (contagem2 > 0) {
            System.out.println("A media de peso de pessoas entre 11 e 20 anos é: " + (media11e20 / contagem2));
        }
        else {
            System.out.println("Nenhuma idade entre 11 e 20 foi informada!");
        }
        if (contagem3 > 0) {
            System.out.println("A media de peso de pessoas entre 21 e 30 anos é: " + (media21a30 / contagem3));
        }
        else {
            System.out.println("Nenhuma idade entre 21 e 30 foi informada!");
        }
        if (contagem1 > 0) {
            System.out.println("A media de peso de pessoas com idade maior que 30 é: " + (mediaMaiorque30 / contagem4));
        }
        else {
            System.out.println("Nenhuma idade maior que 30 foi encontrada!");
        }

}}


