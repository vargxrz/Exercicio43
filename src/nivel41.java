/*
 Faça um programa que receba a idade e a altura de várias pessoas e que calcule e mostre a
média das alturas das pessoas com mais de 50 anos.
Para encerrar a entrada de dados digite idade menor ou igual a zero.
 */
package src;

import java.util.Scanner;

public class nivel41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 1;
        double altura = 1;
        double totalAltura = 0;
        int contagem = 0;


        while (idade != 0) {
            System.out.println("Digite uma idade, (0) para parar: ");
            idade = scanner.nextInt();
            if (idade != 0) {
                System.out.println("Digite uma altura; (0) para parar: ");
                altura = scanner.nextDouble();
             }
            if (idade > 50){
                totalAltura += altura;
                contagem++;
            }
        }
        System.out.println("A media de altura das pessoas com mais de 50 anos é: " + totalAltura / contagem);
    }
}
