/*
Escreva um aplicativo que recebe inteiro e mostra os números pares e ímpares (separados), de 1 até esse inteiro.
 */
package src;

import java.util.Scanner;

public class nivel11 {
    public static void main(String[] args) {

        int contagemPar = 0;
        int contagemImpar = 0;

        String txtImpares = "Impares: ";
        String txtPares = "Pares: ";


        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0){
                txtPares += i + ", ";
                contagemPar++;
            } else {
                txtImpares += i + ", ";
            }


        }
        System.out.println(txtImpares);
        System.out.println(txtPares);
    }
}