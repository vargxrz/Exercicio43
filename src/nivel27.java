/*
Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e a sua opinião em relação ao filme:
 ótimo – 3, bom – 2, regular – 1. Faça um programa que receba a idade e a opinião de 15 espectadores e que calcule e mostre:

A média das idades das pessoas que responderam ótimo;
A quantidade de pessoas que respondeu regular;
A percentagem de pessoas que respondeu bom entre todos os espectadores analisados.
 */
package src;

import java.util.Scanner;

public class nivel27 {
    public static void main(String[] args) {

        int idade = 0;
        int mediaIdades = 0;
        int quantidade = 0;
        int porcentBom = 0;
        int contagemOtimo = 0;
        int contagemRegular = 0;
        int contagemBom = 0;
        int contagemRepeticao = 0;


        for (int i = 1; i <= 5; i++) {


            Scanner scanner = new Scanner(System.in);

            System.out.print("Informe sua idade: ");
            idade = scanner.nextInt();

            System.out.print("Informe uma nota para o filme\n" +
                    " 1 - Otimo\n" +
                    " 2 - Bom\n" +
                    " 3 - Regular\n" +
                    "Digite sua nota: ");

            int escolherNota = scanner.nextInt();

            switch (escolherNota) {
                case 1:
                    contagemOtimo++;
                    mediaIdades += idade;
                    break;
                case 2:
                    contagemBom++;
                    break;
                case 3:
                    contagemRegular++;
                    break;
                default:
                    System.out.println("Informação não encontrada!!\n");

            }
            contagemRepeticao++;
        }
        System.out.println("a media de idades que responderam com a nota 1 - Otimo: " + mediaIdades / contagemOtimo);
        System.out.println("A quantidade de pessoas que responderam com a nota 3 - regular: " + contagemRegular);
        System.out.println("A porcentagem de pessoas que digitaram a nota 2 - Bom: " + ((contagemBom * 100) / contagemRepeticao) + "%");

    }
}

