/*
 Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadrado daquele tamanho com asteriscos.
 Seu programa deve usar laços de repetição e funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
 */
package src;

import javax.swing.*;
import java.util.Scanner;

public class nivel12 {
    public static void main(String[] args) {


        String linhas = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 20: ");
        int recebe = scanner.nextInt();


        for (int i = 1; i <= recebe; i++) {
            linhas += "*";

        }
            for (int j = 1; j <= recebe; j++) {

            System.out.println(linhas);

        }


    }}




