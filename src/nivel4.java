/*
 Faça um programa que leia um valor n, inteiro e positivo, calcule e mostre a seguinte soma: S = 1 + 1/2 + 1/3 + 1/4 + … + 1/n.
 */
package src;

import java.util.Scanner;

public class nivel4 {
    public static void main(String[] args) {

        double soma = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();



        for (int i = 1; i <= numero; i++) {

            soma = soma + (double)1/i;
            System.out.println("1/"+ i);
            System.out.println(soma);

        }
    }

}
