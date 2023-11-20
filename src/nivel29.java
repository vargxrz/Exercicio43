/*
 O sistema de avaliação de uma determinada disciplina obedece aos seguintes critérios:

Durante o semestre são dadas três notas;
A nota final é obtida pela média aritmética das três notas;
É considerado aprovado o aluno que obtiver a nota final superior ou igual a 6 e que tiver comparecido a um mínimo de 40 aulas.
 */
package src;

import java.util.Scanner;

public class nivel29 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota do aluno: ");
        int nota1 = scanner.nextInt();
        System.out.println("Informe a segunda nota do aluno: ");
        int nota2 = scanner.nextInt();
        System.out.println("Informe a terceira nota do aluno: ");
        int nota3 = scanner.nextInt();

        System.out.println("Informe o numero de presenças na aula: ");
        int presenca = scanner.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;
        boolean aprovado = media >= 6 && presenca >= 40;

        System.out.println("A media final do aluno é: " + media);
        System.out.println("O aluno esta " + (aprovado? "Aprovado" : "Reprovado!!"));
}}
