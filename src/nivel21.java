/*
Faça um programa que receba a idade e o sexto de sete pessoas e que calcule e mostre:

A idade média do grupo;
A idade média das mulheres;
A idade média dos homens;
 */
package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class nivel21 {
    public static void main(String[] args) {

        int totalIdade = 0;
        int idade = 0;
        char sexo;
        int contagemM = 0;
        int contagemF = 0;
        int contadorMasculino = 0;
        int contadorFeminino = 0;
        int contTotal = 0;

        for (int i = 1; i <= 4; i++) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();

            System.out.println("Digite o sexo biologico: ");
            sexo = scanner.next().charAt(0);

            totalIdade += idade;

            if (sexo == 'f') {
                contadorFeminino++;
                contagemF += idade;
            }
            else if (sexo == 'm') {
                contadorMasculino++;
                contagemM += idade;

            }
            contTotal++;
        }

        System.out.println("A media das idades de todas as pessoas informadas: " + (totalIdade / contTotal));
        System.out.println("A media de mulheres é: " + (contagemF / contadorFeminino));
        System.out.println("A media de homens é: " + (contagemM / contadorMasculino));

    }

}

