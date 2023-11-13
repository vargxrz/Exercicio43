/*
  Uma loja deseja cadastrar 5 clientes e verificar se o faturamento da loja foi superior a loja B (faturamento = 54000).
  Se o faturamento atingir esse valor mostre na tela uma mensagem contendo em quanto foi superado o faturamento.
 */
package src;

import java.util.Scanner;

public class nivel6 {
    public static void main(String[] args) {

        int faturamentoB = 54000;
        int faturamentoLoja = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.println("Digite o faturamento " + i + ": ");
            int faturamentocliente = scanner.nextInt();

            faturamentoLoja += faturamentocliente;
        }

        if (faturamentoLoja >= faturamentoB)
        {
            int maiorFaturamento = faturamentoLoja - faturamentoB;
            System.out.println("O faturamento da loja, foi superior a loja b de " + faturamentoB + " reais " + " em " + maiorFaturamento + " reais ");
        } else {
            System.out.println("O faturamento da loja não atingiu o faturamento da loja b " + faturamentoB);
        }
    }
}
