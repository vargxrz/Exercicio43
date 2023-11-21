/*
Uma empresa deseja aumentar seus preços em 20%. Faça um programa que leia o código e o preço de custo de cada produto e que calcule o novo preço.
Calcule também a média dos preços com e sem aumento. Mostre o código e o novo preço de cada produto e, no final, as médias.
A entrada de dados deve terminar quando for lido um código de produto negativo.
 */
package src;

import java.util.Scanner;

    public class nivel35 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            int codigoProduto;
            double precoCusto;
            double novoPreco;
            double somaPrecosSemAumento = 0;
            double somaPrecosComAumento = 0;
            int countProdutos = 0;


            System.out.println("Digite o código do produto (ou um código negativo para encerrar): ");
            codigoProduto = scanner.nextInt();

            while (codigoProduto >= 0) {
                System.out.println("Digite o preço de custo do produto: ");
                precoCusto = scanner.nextDouble();


                novoPreco = precoCusto * 1.2;

                somaPrecosSemAumento += precoCusto;
                somaPrecosComAumento += novoPreco;
                countProdutos++;


                System.out.println("Código do produto: " + codigoProduto);
                System.out.println("Novo preço do produto: " + novoPreco);

                System.out.println("Digite o código do próximo produto (ou um código negativo para encerrar): ");
                codigoProduto = scanner.nextInt();
            }


            if (countProdutos > 0) {

                double mediaPrecosSemAumento = somaPrecosSemAumento / countProdutos;
                double mediaPrecosComAumento = somaPrecosComAumento / countProdutos;


                System.out.println("Média dos preços sem aumento: " + mediaPrecosSemAumento);
                System.out.println("Média dos novos preços com aumento: " + mediaPrecosComAumento);
            } else {
                System.out.println("Nenhum produto foi inserido.");
            }


        }
    }


