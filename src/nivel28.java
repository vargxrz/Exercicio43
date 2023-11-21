/*
Uma firma fez uma pesquisa de mercado para saber se as pessoas gostaram ou não de um novo produto lançado no mercado.
Para isso forneceu o sexo do entrevistado e sua resposta (S – Sim ou N – Não). Sabe-se que foram entrevistadas dez pessoas.
 Faça um programa que calcule e mostre:

O número de pessoas que respondeu sim;
O número de pessoas que respondeu não;
O número de mulheres que respondeu sim;
A percentagem de homens que respondeu não entre todos os homens analisados.
 */
package src;

import java.util.Scanner;

public class nivel28 {
    public static void main(String[] args) {
        int contagemSim = 0;
        int contagemNao = 0;
        int mulherSim = 0;
        int porcentHomemNao = 0;
        int contagemMulher = 0;
        int contagemHomem = 0;

        for (int i = 1; i <= 4; i++) {

            Scanner scanner = new Scanner(System.in);

            char genero = 'a';
            while (!(genero == 'm' || genero == 'f')) {
                System.out.print("(M) masculino (F) Feminino\n" +
                        "Digite seu genero: ");
                genero = scanner.next().charAt(0);
            }

            char avaliacao = 'b';
            while (!(avaliacao == 's' || avaliacao == 'n')) {
                System.out.print("\nGostou do novo produto lançado? \n" +
                        "(S) sim  (N) não\n" +
                        "Digite aqui sua resposta: \n");
                avaliacao = scanner.next().charAt(0);
            }

            if (genero == 'm') {
                contagemHomem++;


            } else if (genero == 'f') {
                contagemMulher++;
                mulherSim++;

            }
            if (avaliacao == 's') {
                contagemSim++;
            } else if (avaliacao == 'n') {
                contagemNao++;
                porcentHomemNao++;
            }

        }
        if (contagemSim > 0) {
            System.out.println("Numero de pessoas que responderam sim para avaliação do produto: " + contagemSim);
        } else {
            System.out.println("Nenhuma pessoa informou que gostou do produto!");
        }
        if (contagemNao > 0) {
            System.out.println("Numero de pessoas que responderam não para avaliação do produto: " + contagemNao);
        } else {
            System.out.println("Nenhuma pessoa informou que nao gostou do produto!");
        }
        if (contagemMulher != 0) {
            System.out.println("A quantidade de mulheres que gostaram do produto: " + mulherSim);
        } else {
            System.out.println("Nenhuma mulher gostou do produto!");
        }
        if (contagemHomem != 0) {
            System.out.println("A porcentagem de homens que nao gostaram do produto é: " + ((contagemHomem * 100) / porcentHomemNao) + "%");
        }


    }
}
