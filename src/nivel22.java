/*
Faça um programa que receba o valor de um carro e mostre uma
tabela com os seguintes dados: preço final, quantidade de parcelas e valor da parcela. Considere o seguinte:

O preço final para compra à vista tem um desconto de 20%;
A quantidades de parcelas pode ser: 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60.
Os percentuais de acréscimo seguem a tabela a seguir.
 */
package src;

import java.util.Scanner;

public class nivel22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantParcial;
        double precoFinal = 0;
        double precoAtual = 0;
        double diferencaAcrescimo = 0;
        double fuscaAzul = 50000.00;
        double chevete = 35000.00;
        double unoVermelhoComEscada = 25000.00;

        System.out.print("Seja bem vindo a concessionária do Vargas!!!\n\n" +
                "Opção 1 = Fusca Azul - Duas portas,  Valor de R$ 50.000.00 \n" +
                "Opção 2 = Chevete Branco - Modo Turbo pré Instalado,  Valor de R$ 35.000.00\n" +
                "Opção 3 = Uno Vermelho - Com escada no Teto,  Valor de R$ 25.000.00\n\n" +
                "Digite a opção desejada: ");

        int escolherCarro = scanner.nextInt();

        switch (escolherCarro) {
            case 1:
                System.out.println("Você escolheu um fusca azul, otima escolha! Aqui estão os metodos de pagamento:");
                precoAtual += fuscaAzul;
                break;
            case 2:
                System.out.println("Você escolheu um Chevete, otima escolha! Aqui estão os metodos de pagamento:");
                precoAtual += chevete;
                break;
            case 3:
                System.out.println("Você escolheu um Uno com Escada, otima escolha! Aqui estão os metodos de pagamento:");
                precoAtual += unoVermelhoComEscada;
                break;
            default:
                System.out.println("Opção não encontrada!!!");
        }
        if (escolherCarro >= 1 && escolherCarro <= 3) {
            System.out.println("1- À vista temos 20% de desconto, aproveite!\n" +
                    "2- Parcelado 6x com 3% em cima do valor final\n" +
                    "3- Parcelado 12x com 6% em cima do valor final\n" +
                    "4- Parcelado 18x com 9% em cima do valor final\n" +
                    "5- Parcelado 24x com 12% em cima do valor final\n" +
                    "6- Parcelado 30x com 15% em cima do valor final\n" +
                    "7- Parcelado 36x com 18% em cima do valor final\n" +
                    "8- Parcelado 42x com 21% em cima do valor final\n" +
                    "9- Parcelado 48x com 24% em cima do valor final\n" +
                    "10- Parcelado 54x com 27% em cima do valor final\n" +
                    "11- Parcelado 60x com 30% em cima do valor final");
            int escolherPagamento = scanner.nextInt();
            switch (escolherPagamento) {
                case 1:
                    diferencaAcrescimo = (precoAtual * 20) / 100;
                    precoFinal = precoAtual - diferencaAcrescimo;
                    System.out.println("O valor do carro com 20% de desconto fica: R$" + precoFinal);
                    break;
                case 2:
                    diferencaAcrescimo = (precoAtual * 3) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 6 vezes fica: R$" + precoFinal);
                    break;
                case 3:
                    diferencaAcrescimo = (precoAtual * 6) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 12 vezes fica: R$" + precoFinal);
                    break;
                case 4:
                    diferencaAcrescimo = (precoAtual * 9) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 18 vezes fica: R$" + precoFinal);
                    break;
                case 5:
                    diferencaAcrescimo = (precoAtual * 12) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 24 vezes fica: R$" + precoFinal);
                    break;
                case 6:
                    diferencaAcrescimo = (precoAtual * 15) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 30 vezes fica: R$" + precoFinal);
                    break;
                case 7:
                    diferencaAcrescimo = (precoAtual * 18) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 36 vezes fica: R$" + precoFinal);
                    break;
                case 8:
                    diferencaAcrescimo = (precoAtual * 21) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 42 vezes fica: R$" + precoFinal);
                    break;
                case 9:
                    diferencaAcrescimo = (precoAtual * 24) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 48 vezes fica: R$" + precoFinal);
                    break;
                case 10:
                    diferencaAcrescimo = (precoAtual * 27) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 54 vezes fica: R$" + precoFinal);
                    break;
                case 11:
                    diferencaAcrescimo = (precoAtual * 30) / 100;
                    precoFinal = precoAtual + diferencaAcrescimo;
                    System.out.println("O valor do carro parcelado em 60 vezes fica: R$" + precoFinal);
                    break;
                default:
                    System.out.println("Nenhuma opção encontrada!");
            }

        }else {
            System.out.println("Infelizmente será necessário reiniciar o processo!");
        }
    }
}
