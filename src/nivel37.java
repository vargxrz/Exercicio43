/*
Faça um programa que receba vários números e que calcule e mostre:

A quantidade de números inferiores a 35;
A média dos números positivos;
A percentagem de números entre 50 e 100 entre todos os números digitados;
A percentagem de números entre 10 e 20 entre os números menores que 50.
 */
package src;

import java.util.Scanner;

public class nivel37 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int qtdInferiores35 = 0;
        int qtdPositivos = 0;
        int qtdEntre50e100 = 0;
        int qtdEntre10e20Menor50 = 0;
        int totalNumeros = 0;

        System.out.println("Digite um número (ou 0 para finalizar): ");
        numero = scanner.nextInt();

        while (numero != 0) {
            totalNumeros++;

            if (numero < 35) {
                qtdInferiores35++;
            }
            if (numero > 0) {
                qtdPositivos++;

                if (numero >= 50 && numero <= 100) {
                    qtdEntre50e100++;
                }

                if (numero < 50 && numero >= 10 && numero <= 20) {
                    qtdEntre10e20Menor50++;
                }
            }

            System.out.println("Digite outro número (ou 0 para finalizar): ");
            numero = scanner.nextInt();
        }

        if (totalNumeros > 0) {
            double mediaPositivos = (double) qtdPositivos / totalNumeros * 100;
            double percentEntre50e100 = (double) qtdEntre50e100 / totalNumeros * 100;
            double percentEntre10e20Menor50 = (double) qtdEntre10e20Menor50 / qtdPositivos * 100;

            System.out.println("Quantidade de números inferiores a 35: " + qtdInferiores35);
            System.out.println("Média dos números positivos: " + mediaPositivos);
            System.out.println("Percentagem de números entre 50 e 100: " + percentEntre50e100);
            System.out.println("Percentagem de números entre 10 e 20 entre os menores que 50: " + percentEntre10e20Menor50);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }

    }
}
