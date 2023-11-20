/*
Faça um programa que receba várias idades e que
calcule e mostre a média das idades digitadas. Finalize digitando a idade igual a zero
 */
package src;

import java.util.Scanner;

public class nivel23 {
    public static void main(String[] args) {
        double opcao = 1;
        double totalIdades = 0;
        double contador = 0;

        while(opcao != 0){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite uma idade, digite (0) para parar: ");
            opcao = scanner.nextInt();

            totalIdades += opcao;
            contador++;
        }
        double menosUm = contador-1;
        System.out.println("A media das idades informadas é: " + (totalIdades / menosUm));
    }

}
