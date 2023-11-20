/*
 Faça um programa que receba dez números e usando laços de repetição calcule e mostre a quantidade de números entre 30 e 90.
 */
package src;

import java.util.Scanner;

public class nivel19 {
    public static void main(String[] args) {

        int numero = 0;
        int contagem = 0;
        int totalDeIdadesDeterminada = 0;

        for (int i = 1; i <= 10; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite 10 numeros: ");
            numero = scanner.nextInt();
            if (numero >= 30 && numero <= 90) {
                contagem++;
                totalDeIdadesDeterminada += numero;
            }
        }
        System.out.println("Quantidade de pessoas com idades entre 30 a 90 anos: " + contagem);
        System.out.println("Idades somadas: " + totalDeIdadesDeterminada);

    }
}
