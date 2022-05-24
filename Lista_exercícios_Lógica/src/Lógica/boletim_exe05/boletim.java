package Lógica.boletim_exe05;

import java.util.Scanner;

public class boletim {
    /*
     * Escreva um algoritmo que leia o
     * nome de um aluno e as
     * notas das três provas que ele obteve no semestre.
     * No final informar o nome do aluno e a sua média (aritmética);
     * */
    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        String alunoNome = "";
        double[] notas = new double[3];
        double media = 0;
        double totalNotas = 0;

        System.out.print("Informe o nome do aluno: ");
        alunoNome = entradaDeDadosTeclado.nextLine();

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Insira sua " + (i + 1) + "ª nota: ");
            notas[i] = entradaDeDadosTeclado.nextDouble();
        }

        for (double nota : notas) {
            totalNotas += nota;
        }

        media = totalNotas / notas.length;
        System.out.printf("A média de notas do aluno %s é: %.2f", alunoNome, media);

        entradaDeDadosTeclado.close();
    }

}
