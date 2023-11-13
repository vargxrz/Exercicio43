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
