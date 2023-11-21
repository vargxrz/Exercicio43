/*
Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os dados de idade, sexo (M/F)
e salário. Faça um programa que calcule e mostre:

A média dos salários do grupo;
A maior e a menor idade do grupo;
A quantidade de mulheres com salário até R$ 200,00;
A idade e o sexo da pessoa que possui o menor salário.   Finalize a entrada de dados ao ser digitada uma idade negativa.
 */
package src;
import java.util.Scanner;

public class nivel34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = 1;
        int totalSalario = 0;
        char genero = 'a';
        double salario = 0;
        int totalIdade = 0;
        int contagemSalario = 0;
        int maiorIdade = 0;
        int menorIdade = 150;
        int mulheresAte200 = 0;
        double menorSalario = 0;
        int idadeMenorSalario = 0;
        String generoMenorSalario = "";

        while (idade != 0) {
            System.out.println("Digite uma idade: ");
            idade = scanner.nextInt();

            if (idade > 0 && idade < 120) {
                System.out.println("Digite seu genero (F/M): ");
                genero = scanner.next().toLowerCase().charAt(0);

                if (genero == 'm' || genero == 'f') {
                    System.out.println("Digite um salario: ");
                    salario = scanner.nextDouble();
                    totalSalario += salario;
                    contagemSalario++;

                    if (salario < menorSalario) {
                        menorSalario = salario;
                        idadeMenorSalario = idade;
                        generoMenorSalario = (genero == 'm') ? "M" : "F";
                    }
                }

                if (idade > maiorIdade){
                    maiorIdade = idade;
                }
                if (idade < menorIdade){
                    menorIdade = idade;
                }
                if (genero == 'f' && salario <= 200){
                    mulheresAte200++;
                }
            }
        }

        if (contagemSalario > 0) {
            System.out.println("A media de salarios do grupo: " + (totalSalario / contagemSalario));
        } else {
            System.out.println("Nenhum salário foi inserido.");
        }

        System.out.println("A maior idade do grupo é: " + maiorIdade);
        System.out.println("A menor idade do grupo é: " + menorIdade);
        System.out.println("Quantidade de mulheres com salario menor que R$200: " + mulheresAte200);
        System.out.println("A pessoa com o menor salario - idade: " + idadeMenorSalario + ", genero: " + generoMenorSalario);

    }
}
