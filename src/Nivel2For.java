/*
Faça um programa que mostre as tabuadas dos números de 1 a 10 usando laços de repetição.
 */
package src;

public class Nivel2For {
    public static void main(String[] args) {



        for (int i = 1; i <= 10; i++) {


            for (int j = 0; j <= 10 ; j++) {

                System.out.println( i + " x " + j + " = " + (i * j));

            }



        }
    }
}
