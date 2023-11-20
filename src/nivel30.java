/*
 Faça um programa que leia um conjunto de dados contendo o número da matrícula, as três notas e a
 frequência (número de aulas frequentadas) de dez alunos.
Calcule e mostre:

Para cada aluno o número da matrícula, a nota final e a mensagem (aprovado ou reprovado);
A maior e a menor nota da turma;
O total de alunos reprovados;
A percentagem de alunos reprovados por frequência abaixo da mínima necessária.
 */
package src;

import java.util.Scanner;

public class nivel30 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                double maiorNota = 0;
                double menorNota = 0;
                int totalReprovados = 0;
                int totalAlunos = 4;

                for (int i = 1; i <= totalAlunos; i++) {
                    System.out.println("Informe a matrícula do aluno" + i + ":");
                    int matricula = scanner.nextInt();
                    System.out.println("Informe a primeira nota do aluno " + i + ":");
                    double nota1 = scanner.nextDouble();
                    System.out.println("Informe a segunda nota do aluno " + i + ":");
                    double nota2 = scanner.nextDouble();
                    System.out.println("Informe a terceira nota do aluno " + i + ":");
                    double nota3 = scanner.nextDouble();
                    System.out.println("Informe a frequencia do aluno " + i + ":");
                    int aulasFrequentadas = scanner.nextInt();

                    double media = (nota1 + nota2 + nota3) / 3.0;

                    if (media > maiorNota) {
                        maiorNota = media;
                    }

                    if (media < menorNota) {
                        menorNota = media;
                    }

                    if (!(media >= 6.0 && aulasFrequentadas >= 40)) {
                        totalReprovados++;
                    }

                    System.out.println("Matrícula: " + matricula + "\nNota Final: " + media +
                            "\nAprovado ou reprovado: " + (media >= 6.0 && aulasFrequentadas >= 40 ? "Aprovado" : "Reprovado") + "\n");
                }

                System.out.println("Maior nota da turma: " + maiorNota);
                System.out.println("Menor nota da turma: " + menorNota);
                System.out.println("Total de alunos reprovados: " + totalReprovados);
                System.out.println("Porcentagem de alunos reprovados: " + ((double) totalReprovados / totalAlunos * 100) + "%");
            }
        }
