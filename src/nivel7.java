package src;

import java.util.Scanner;
/*
Uma loja tem tem uma política de descontos de acordo com o valor da compra do cliente.
Os descontos começam acima dos R$500. A cada 100 reais acima dos R$500,00 o cliente ganha 1% de desconto cumulativo até 25%.
 */
public class nivel7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o valor da compra: ");
        double valorDeCompra = scanner.nextInt();




        if (valorDeCompra > 500.0) {
            double desconto = (int) ((valorDeCompra - 500) / 100); //30
            if (desconto > 25) {
                desconto = 25;
            }
            double valorcomDescont = valorDeCompra - (valorDeCompra * (desconto / 100)); //2450


                System.out.println("seu desconto é de: " + desconto + "%");
                System.out.println("O valor com desconto é de R$" + valorcomDescont);

        }




    }

}

