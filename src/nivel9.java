/*/
Faça um programa que receba a idade de 15 pessoas e que calcule e mostre:
a) A quantidade de pessoas em cada faixa etária;
b) A percentagem de pessoas na primeira e na última faixa etária, com relação ao total de pessoas:
 */
package src;

import java.util.Scanner;

public class nivel9 {
    public static void main(String[] args) {
        float porcent15 = 0;
        float porcent60 = 0;
        int pessoas = 15;
        int contagem1 = 0;
        int contagem2 = 0;
        int contagem3 = 0;
        int contagem4 = 0;
        int contagem5 = 0;
        int ir = 10;

        for (int i = 1; i <= ir; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a idade " + i + " : ");
            int idade = scanner.nextInt();

            if (idade <= 15) {
                contagem1++;
            } else if (idade <= 30) {
                contagem2++;
            } else if (idade <= 45) {
                contagem3++;
            } else if (idade <= 60) {
                contagem4++;
            } else {
                contagem5++;
            }

        }
        porcent15 = (100 * contagem1) / ir;       //ir
        porcent60 = (100 * contagem5) / ir;
        float porcentSobra = (porcent15 + porcent60);
        float porcentSob = (100 - porcentSobra);



        System.out.println("Quantidade de pessoas com menos de 15 anos: " + contagem1);
        System.out.println("Quantidade de pessoas com idade entre 16 e 30 anos: " + contagem2);
        System.out.println("Quantidade de pessoas com idade entre 31 e 45 anos: " + contagem3);
        System.out.println("Quantidade de pessoas com idade entre 40 e 60 anos: " + contagem4);
        System.out.println("Quantidade de pessoas com idade maior que 60 anos: " + contagem5);

        System.out.println("Porcetagem de pessoas com até 15 anos: " + porcent15 + "%");
        System.out.println("Porcetagem de pessoas com entre 15 anos a 60 anos: " + porcentSob + "%");
        System.out.println("Porcetagem de pessoas com até 60 anos: " + porcent60 + "%");



    }
}


