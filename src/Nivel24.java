/*
 Faça um programa que receba um conjunto de
 valores inteiros e positivos, com o intervalo formado pelo número imprima
 na tela todos os números primos existentes
 */
package src;

import java.util.Scanner;

public class Nivel24 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor inicial do intervalo: ");
            int inicio = scanner.nextInt();

            System.out.print("Digite o valor final do intervalo: ");
            int fim = scanner.nextInt();

            System.out.println("Números primos no intervalo de " + inicio + " a " + fim + ":");

            for (int i = inicio; i <= fim; i++) {
                if (i > 1) {
                    boolean ehPrimo = true;
                    for (int j = 2; j * j <= i; j++) {
                        if (i % j == 0) {
                            ehPrimo = false;
                            break;
                        }
                    }
                    if (ehPrimo) {
                        System.out.print(i + " ");
                    }
                }
            }

        }
    }


