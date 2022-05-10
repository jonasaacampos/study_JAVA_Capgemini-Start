package soma_exe01;

import java.util.Scanner;

/*
 * Faça um algoritmo que receba dois números e exiba o resultado da sua soma
 */
public class soma {
    public static void main(String[] args) {
        Scanner entradadeDadosTeclado = new Scanner(System.in);
        int soma = 0;
        int[] numeros = new int[2];

        System.out.println("Insira 2 números para obter a soma");

        for (int i = 0; i < 2; i++) {
            System.out.print("Insira o " + (i + 1) + "° número: ");
            numeros[i] = entradadeDadosTeclado.nextInt();
        }

        for (int numeroAtualArray : numeros) {
            soma += numeroAtualArray;
        }

        System.out.printf("A soma dos valores digitados é: %d", soma);

        entradadeDadosTeclado.close();
    }

}
