package src;

import java.util.Scanner;

public class nivel4 {
    public static void main(String[] args) {

        double soma = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();



        for (int i = 1; i <= numero; i++) {

            soma = soma + (double)1/i;
            System.out.println("1/"+ i);
            System.out.println(soma);

        }
    }

}
