/*
Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida.  Em seguida, mostre-os em ordem crescente e decrescente.
 */
package src;

import javax.swing.*;
import java.util.Scanner;

public class nivel5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero (A): ");
        int numeroA = scanner.nextInt();

        System.out.print("Informe um numero (B): ");
        int numeroB = scanner.nextInt();

        System.out.print("Informe um numero (C): ");
        int numeroC = scanner.nextInt();

        System.out.println("---------------------------------------");

        int maiorNumero = 0;
        int numeroDoMeio = 0;
        int menorNumero = 0;


        if (numeroA > numeroB && numeroA >numeroC) {
            maiorNumero = numeroA;


        if (numeroB > numeroC){
            numeroDoMeio = numeroB;
            menorNumero = numeroC;
        }
        else {
            numeroDoMeio = numeroC;
            menorNumero = numeroB;
        }}

        if (numeroB > numeroA && numeroB > numeroC){
            maiorNumero = numeroB;

            if (numeroA > numeroC){
                numeroDoMeio = numeroA;
                menorNumero = numeroC;
            }
            else {
                numeroDoMeio = numeroC;
                menorNumero = numeroB;
            }
        }

        if (numeroC > numeroA && numeroC > numeroB) {
            maiorNumero = numeroC;

            if (numeroA > numeroB) {
                numeroDoMeio = numeroA;
                menorNumero = numeroB;
            } else {
                numeroDoMeio = numeroB;
                menorNumero = numeroA;
            }
        }

        System.out.println("O maior numero é: " + maiorNumero);
        System.out.println("O numero do meio é " + numeroDoMeio);
        System.out.println("O menor numero é: " + menorNumero);


        System.out.println("---------------------------------------");


        System.out.println("O menor numero é: " + menorNumero);
        System.out.println("O numero do meio é " + numeroDoMeio);
        System.out.println("O maior numero é: " + maiorNumero);

    }
}



