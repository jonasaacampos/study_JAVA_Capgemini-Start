package Lógica.operacoesBasicas_exe02;

import java.util.Scanner;

/*
 * Faça um algoritmo que receba dois números e ao final mostre a
 * soma, subtração, multiplicação e a divisão dos dois números lidos;
 * */
public class operacoesBasicas {
    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        int[] numeros = new int[2];

        int soma = 0;
        int subtracao = 0;
        int produto = 1;
        double divisao = 0;

        System.out.println("Insira dois números para obter o resultado das 4 operações matemáticas elementares.");

        for (int i = 0; i < 2; i++) {
            System.out.print("Insira o " + (i + 1) + "° número: ");
            numeros[i] = entradaDeDadosTeclado.nextInt();
        }

        for (int numeroAtualArray : numeros) {
            soma += numeroAtualArray;
            produto *= numeroAtualArray;

            if (subtracao == 0) {
                subtracao = numeroAtualArray;
            } else {
                subtracao -= numeroAtualArray;
            }

            if (divisao == 0) {
                divisao = numeroAtualArray;
            } else {
                divisao /= numeroAtualArray;
            }
        }

        System.out.println("Com base nos números digitados, calculados os seguintes dados:");
        System.out.printf("Soma: %d" +
                "\nSubtração = %d" +
                "\nProduto   = %d" +
                "\nDivisão   = %.2f", soma, subtracao, produto, divisao);

        entradaDeDadosTeclado.close();
    }

}
