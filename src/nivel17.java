package src;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class nivel17 {
    public static void main(String[] args) {

        int maiorque90 = 90;
        int contagemPeso = 0;
        int peso = 0;
        int idadeTotal = 0;

        for (int i = 1; i <= 5; i++) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();
            idadeTotal +=idade;


            System.out.println("Digite seu peso: ");
            peso = scanner.nextInt();

            if (peso >= maiorque90) {
                contagemPeso++;
            }

        }
        int mediaIdade = idadeTotal / 5;

        System.out.println("Quantidade de pessoas com peso maior que 90kg: " + contagemPeso + "pessoas");
        System.out.println("A media de idade de todas as pessoas é: " + mediaIdade);


    }
}
