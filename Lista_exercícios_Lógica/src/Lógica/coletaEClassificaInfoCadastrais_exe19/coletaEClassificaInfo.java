package Lógica.coletaEClassificaInfoCadastrais_exe19;

import java.util.Scanner;

public class coletaEClassificaInfo {
    public static void main(String[] args) {

        /*
         * Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem
         * ou mulher. No final informe total de homens e de mulheres;
         * */

        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        String pessoaNome;
        int pessoaSexo = 0;
        int quantidadePessoaSexoMasc = 0;
        int quantidadePessoaSexoFem = 0;

        int quantidadeCadastros;

        System.out.print("Quantas pessoas deseja cadastrar? ");
        quantidadeCadastros = entradaDeDadosTeclado.nextInt();
        int iteracoes = 1;
        boolean controle = true;

        while (quantidadeCadastros >= iteracoes) {
            System.out.printf("Qual o nome da pessoa %d? ", iteracoes);
            pessoaNome = entradaDeDadosTeclado.next();


            do {
                System.out.print("Qual sexo? \n0 para Masculino\n1 para Feminino");
                pessoaSexo = (entradaDeDadosTeclado.nextInt());
                System.out.println();

                if (pessoaSexo == 0 || pessoaSexo == 1) {
                    controle = false;
                }

            } while (controle);

            switch (pessoaSexo) {
                case 0:
                    quantidadePessoaSexoMasc++;
                case 1:
                    quantidadePessoaSexoFem++;
            }

            iteracoes++;
        }

        System.out.printf("Foram cadastrados\n%d sexo Masculino\n%d sexo Feminino", quantidadePessoaSexoMasc, quantidadePessoaSexoFem);
        entradaDeDadosTeclado.close();
    }
}
