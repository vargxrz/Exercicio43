/*
Difícil 25 –  Faça um programa para calcular n! (Fatorial de n), sendo que o valor
inteiro de n é fornecido pelo usuário. Sabe-se que: N! = 1 * 2 * 3 * … (n – 1) * n 0! = 1,
por definição;
 */
package src;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class nivel25 {
    public static void main(String[] args) {

        long fatorial;
        long numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero para calcular fatorial: ");
        numero = scanner.nextInt();

        for (fatorial = 1;numero > 1; numero--) {
            fatorial = fatorial * numero;

        }
        System.out.println("Fatorial calculado: " + fatorial);
    }
}
