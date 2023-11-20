/*
Faça um programa que receba dez idades, pesos e Alturas e que calcule e mostre:

A média das idades das dez pessoas;
A quantidade de pessoas com peso superior a 90 quilos e altura inferior a 1,50;
A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90;
 */
package src;
import java.util.Scanner;

public class nivel20 {
    public static void main(String[] args) {

        int idade = 0;
        int peso = 0;
        int totalIdade= 0;
        float altura = 0;
        int mediaDez = 0;
        int pesoMaiorque90altura1_50 = 0;
        int porcentEntre10e30Mais1_90 = 0;
        int cont = 0;

        for (int i = 1; i <= 5; i++) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite uma idade: ");
            idade = scanner.nextInt();

              System.out.println("Digite um peso: ");
             peso = scanner.nextInt();

            System.out.println("Digite uma altura: ");
               altura = scanner.nextFloat();


         totalIdade += idade;

         if (peso >= 90 && altura <= 1.50){
             pesoMaiorque90altura1_50++;
         }
         if (idade >= 10 && idade <= 30 && altura >= 1.90){
             porcentEntre10e30Mais1_90++;
         }
         cont++;
            }


            System.out.println("A media de idade das dez pessoas é: " + (totalIdade / 10));

         if ( pesoMaiorque90altura1_50 > 0){
             System.out.println("A quantidade de pessoas com peso superior a 90 e com altura menor que 1.90: " + pesoMaiorque90altura1_50);
         } else {
             System.out.println("Nenhuma pessoa com peso superior a 90 e com altura menor que 1.90!!");
         }
         if (pesoMaiorque90altura1_50 > 0){
             System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos e com altura maior que 1.90" + ((porcentEntre10e30Mais1_90 * 100) / cont) + "%");
         } else {
             System.out.println("Nenhuma pessoa com idade entre 10 e 30 e com altura menor que 1.90");
         }
    }
}