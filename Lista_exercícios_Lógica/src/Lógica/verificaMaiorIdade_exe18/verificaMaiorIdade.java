package Lógica.verificaMaiorIdade_exe18;

import java.util.Scanner;

public class verificaMaiorIdade {
    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        int quantidadePessoasParaProcessar, idade;
        int idadeMaioridadePenal = 18;

        System.out.print("Insira quantas pessoas deseja informar a idade: ");
        quantidadePessoasParaProcessar = entradaDeDadosTeclado.nextInt();

        int iteracoes = 1;

        while (quantidadePessoasParaProcessar >= iteracoes){
            System.out.printf("Insira a idade da pessoa %d: ", iteracoes);
            idade = entradaDeDadosTeclado.nextInt();

            if (idade >= idadeMaioridadePenal){
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }

            iteracoes++;
        }
        System.out.println("---- Fim do programa ---");


        entradaDeDadosTeclado.close();

    }
}
