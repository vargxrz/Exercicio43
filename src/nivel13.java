package src;

import java.util.Scanner;

public class nivel13 {
    public static void main(String[] args) {

        String linhas = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 20: ");
        int recebe = scanner.nextInt();


        for (int i = 1; i <= recebe; i++) {
            for (int j = 1; j <= recebe; j++){

                if (i == 1 || i == recebe) {
                    linhas += "*"; }
                else if (j == 1 || j == recebe) {
                    linhas += "*";
                }
                else {
                    linhas += " ";
                }




            }


            System.out.println(linhas);
            linhas = "";
        }
}}
