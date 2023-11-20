/*
Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos (P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre: A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;

A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis;
 */
package src;

import java.util.Scanner;

public class nivel18 {
    public static void main(String[] args) {


        double idade = 0;
        double peso = 0;
        float altura = 0;
        int contagemAzul = 0;
        char corDosOlhos;
        char corDoCabelo;
        int contadorIdade = 0;
        int contTotal = 0;
        int altura150 = 0;
        int cont = 0;
        int contRuiva = 0;

        for (int i = 1; i <= 2; i++) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Informe uma Idade: ");
            idade = scanner.nextDouble();
            System.out.println("Informe um peso: ");
            peso = scanner.nextDouble();
            System.out.println("Informe uma altura: ");
            altura = scanner.nextFloat();
            System.out.println("Informe a cor dos olhos, A – Azul, P- Preto, V- Verde e C- Castanho");
            corDosOlhos = scanner.next().charAt(0);
            System.out.println("Informe a cor do cabelo, P – Preto, C- Castanho, L – Louro e R-Ruivo");
            corDoCabelo = scanner.next().charAt(0);

            if (idade > 50 && peso < 60) {
                cont++;
            }
            if (altura < 1.50) {
                altura150++;
                contadorIdade += idade;
            }
            if (corDosOlhos == 'a') {
                contagemAzul++;
            } else if (corDoCabelo == 'r') {
                contRuiva++;


            }

            contTotal++;

        }


        if (cont > 0) {
            System.out.println("Quantidade de pessoas com idade superior a 50, e com peso menor que 60 kg: " + cont);
        } else {
            System.out.println("Nao foi encontrado nenhuma pessoa com idade superior a 50, e com peso menor que 60 kg");
        }
        if (altura150 > 0) {
            System.out.println("A media de pessoas com menos de 1.50 de altura é: " + (contadorIdade / altura150));
        } else {
            System.out.println("Nao há nenhuma pessoa com altura menor que 1.50 de altura...");
        }
        if (contagemAzul > 0) {
            System.out.println("Porcentagem de pessoas com olho azul, em relação aos demais: " + ((contagemAzul * 100) / contTotal) + "%");
        } else {
            System.out.println("Nenhuma pessoa possui olhos azuis...");
        }
        if (contRuiva > 0){
            System.out.println("Quantidade de pessoas ruivas que nao possuem olhos azuis: " + contRuiva);
        }

    }
}
