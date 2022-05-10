package trocaDeValores_exe06;

import java.util.Scanner;

public class trocaDeValores {
    /*
     * Leia dois valores para as variáveis A e B,
     * e efetuar as trocas dos valores de forma que a variávelA passe a
     * possuir o valor da variável B e a variável B passe a possuir o valor da variável A
     * Apresentar os valores trocados;
     * */

    public static void main(String[] args) {

        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        int numeroA, numeroB;

        System.out.print("Insira o valor de A: ");
        numeroA = entradaDeDadosTeclado.nextInt();

        System.out.print("Insira o valor de B: ");
        numeroB = entradaDeDadosTeclado.nextInt();

        int numeroTemporario = numeroB;
        numeroB = numeroA;
        numeroA = numeroTemporario;

        System.out.printf("A = %d\nB = %d", numeroA, numeroB);

        entradaDeDadosTeclado.close();

    }
}
