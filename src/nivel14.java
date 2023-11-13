/*
Faça um programa que recebe a altura de um triangulo em um número inteiro e imprima-o utilizando asteriscos.
Veja o Exemplo:
Entrada: 5
*
**
***
****
*****
 */
package src;

import java.util.Scanner;

public class nivel14 {
    public static void main(String[] args) {
        String linhas = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            linhas += "*";
            System.out.println(linhas);
        }
    }
}
