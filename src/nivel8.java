/*
Faça um programa que receba a idade de dez pessoas e que calcule e
mostre a quantidade de pessoas com idade maior ou igual a 18 anos.
 */
package src;

import java.util.Scanner;


public class nivel8 {
    public static void main(String[] args) {
     int total = 10;
     int maiordeidade = 0;

        for (int i = 1; i < total; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a idade " + i + " : ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                maiordeidade++;
            }
        }
        System.out.println("A quantidade de pessoas maiores de idade: " + maiordeidade);

        }
    }

