/*
Faça um programa que receba como entrada uma lista de números positivos ou negativos, terminada com o número zero.
O programa deve usar laços de repetição para produzir como saída a soma dos números positivos,
a soma dos números negativos e a soma das duas somas parciais.
 */
package src;


import java.util.Scanner;

public class nivel40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 1;
        int numerosPositivos = 0;
        int numerosNegativos = 0;
        int totalNumero = 0;

        while (numero != 0) {
            System.out.println("Digite um numero, (0) para parar: ");
            numero = scanner.nextInt();

            if (numero > 0) {
                numerosPositivos += numero;
            } else if (numero < 0) {
                numerosNegativos += numero;
            }
        }
        totalNumero = numerosPositivos + numerosNegativos;

        System.out.println("A soma dos numeros positivos é: " + numerosPositivos);
        System.out.println("A soma dos numeros negativos é: " + numerosNegativos);
        System.out.println("A soma dos numeros positivos e numeros negativos é: " + totalNumero);

        }
    }
