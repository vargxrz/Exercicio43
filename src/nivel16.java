/*
Faça um programa que receba a idade, altura e o peso de 25 pessoas, Calcule e mostre:

A quantidade de pessoas com idade superior a 50 anos;
A média das Alturas das pessoas com idade entre 10 e 20 anos
A porcentagem das pessoas com peso inferior a 40 quilos entre todas as pessoas analisadas.
 */
package src;

import java.sql.SQLOutput;
import java.util.Scanner;

public class nivel16 {
    public static void main(String[] args) {

        int cont = 0;
        int idade = 0;
        float altura = 0;
        int peso = 0;
        float mediaAltura = 0;
        float somaAltura = 0;
        int idadeMaiorQue50 = 50;
        int contagemIdade = 0;
        int contagemAltura = 0;
        int contagemPeso = 0;

        for (int i = 1; i <= 7; i++) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual seu idade? ");
            idade = scanner.nextInt();
            System.out.println("Qual sua altura? ");
            altura = scanner.nextFloat();
            System.out.println("Qual seu peso? ");
            peso = scanner.nextInt();
            System.out.println("-----------------");

            if (idade > idadeMaiorQue50) {
                contagemIdade++;
            }
            if (idade >= 10 && idade <= 20) {
                contagemAltura++;
                somaAltura += altura;
            }
            if (peso <= 40) {
                contagemPeso++;
            }
            cont++;
        }

        if (contagemIdade > 0) {
            System.out.println("Quantidade de Pessoas com mais de 50 anos: " + contagemIdade);
        } else {
            System.out.println("Nenhuma pessoa tem mais de 50 anos...");
        }
        if (contagemAltura > 0) {
            System.out.println("A media da altura de pessoas entre 10 e 20 anos é: " + (somaAltura / contagemAltura));
        } else {
            System.out.println("Nenhuma pessoa tem entre 10 e 20 anos...");
        }
        if (contagemPeso > 0) {
            System.out.println("Porcentagem de pessoas com menos de 40kg é " + ((contagemPeso * 100) / cont) + "%");
        } else {
            System.out.println("Nenhuma pessoa tem peso menor que 40kg.");


        }
    }
}
