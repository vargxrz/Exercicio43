/*
Uma loja utiliza o código V para transação à vista e P para transação a prazo.
Faça um programa que receba código e valor de 15 transações usando laços de repetição. Calcule e mostre:

O valor total das compras à vista
O valor total das compras a prazo c.
O valor total das compras efetuadas
O valor da primeira prestação das compras a prazo, sabendo-se que essas serão pagas em três vezes
 */
package src;

import java.util.Scanner;

public class nivel15 {
    public static void main(String[] args) {

        float valor = 0;
        float totalcompras = 0;
        float totalV = 0;
        float totalP = 0;
        float parcelado = 0;
        String escolhaDeCompra;

        for (int i = 1; i <= 4; i++) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o metodo de compra, V para a vista e P para parcelamento: ");
            String opcaoCompra = scanner.next();

            if (opcaoCompra.equalsIgnoreCase("v") || opcaoCompra.equalsIgnoreCase("p")) {
                System.out.print("Informe valor de compra: R$ ");
                valor = scanner.nextFloat();
            }
            else {
                System.out.println("Entrada invalida!!");
            }
            totalcompras += valor;

            if ( opcaoCompra.equalsIgnoreCase("v")) {
                totalV += valor;
            } else {
                totalP += valor;
            }
            parcelado = totalP / 3;
        }

        System.out.println("Valor total das compras a vista: " + totalV);
        System.out.println("Valor total das compras parceladas: " + totalP);
        System.out.println("Valor total de compras: " + totalcompras);
        System.out.println("Valores das parcelas a prazo: " + parcelado);

    }
}
