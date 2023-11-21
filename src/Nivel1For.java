/*
1 – Faça um programa que receba um número e usando laços de repetição calcule e mostre a tabuada desse número.
 */
package src;

import java.util.Scanner;

public class Nivel1For {
    public static void main(String[] args) {
 int total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            total = numero * i;
            System.out.println(numero + " x " +  i + " = " + total);
        }
    }
}