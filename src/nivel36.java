/*
Faça um programa que receba o tipo da ação, ou seja, uma letra a ser comercializada na bolsa de valores,
o preço de compra e o preço de venda de cada ação e que calcule e mostre:

O lucro de cada ação comercializada;
A quantidade de ações com lucro superior a R$ 1.000,00;
A quantidade de ações com lucro inferior a R$ 200,00;
O lucro total da empresa   Finalize com o tipo de ação “F”.
 */
package src;

import java.util.Scanner;

public class nivel36 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                char tipoAcao;
                double precoCompra;
                double precoVenda;
                double lucro;
                double lucroTotal = 0;
                int qtdLucroSuperior1000 = 0;
                int qtdLucroInferior200 = 0;

                System.out.println("Digite o tipo de ação (ou 'f' para finalizar): ");
                tipoAcao = scanner.next().charAt(0);

                while (tipoAcao != 'f') {
                    System.out.println("Digite o preço de compra da ação: ");
                    precoCompra = scanner.nextDouble();

                    System.out.println("Digite o preço de venda da ação: ");
                    precoVenda = scanner.nextDouble();

                    lucro = precoVenda - precoCompra;
                    lucroTotal += lucro;

                    if (lucro > 1000.0) {
                        qtdLucroSuperior1000++;
                    } else if (lucro < 200.0) {
                        qtdLucroInferior200++;
                    }

                    System.out.println("Lucro da ação: " + lucro);

                    System.out.println("Digite o tipo de próxima ação (ou 'f' para finalizar): ");
                    tipoAcao = scanner.next().charAt(0);
                }

                System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + qtdLucroSuperior1000);
                System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + qtdLucroInferior200);
                System.out.println("Lucro total da empresa: " + lucroTotal);
            }
        }

