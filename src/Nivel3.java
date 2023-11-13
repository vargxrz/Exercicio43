package src;

import java.util.Scanner;
/*
Fácil 3 –  Faça um programa que verifique e mostre os números entre 1.000
 e 2.000 (inclusive) que, quando divididos por 11 produzam resto igual a 2.
 */
public class Nivel3 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 2000 ; i++) {
if (i % 11 == 0){
    System.out.println(i);
}
        }
    }
}
