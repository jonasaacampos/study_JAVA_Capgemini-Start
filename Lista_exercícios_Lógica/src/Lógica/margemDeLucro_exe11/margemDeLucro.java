package Lógica.margemDeLucro_exe11;

import java.util.Scanner;

public class margemDeLucro {
    /*
     * Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
     * Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
     * */
    public static void main(String[] args) {
        Scanner entradaDedadosTeclado = new Scanner(System.in);
        double precoCusto, precoVenda, margemTaxa, margemValor;

        System.out.print("Insira o valor de custo R$ ");
        precoCusto = entradaDedadosTeclado.nextDouble();
        System.out.print("Insira sua taxa de lucro (em %): ");
        margemTaxa = entradaDedadosTeclado.nextDouble();

        margemValor = precoCusto * (margemTaxa / 100);
        precoVenda = precoCusto + margemValor;

        System.out.printf("Seu preco de venda será R$%.2f", precoVenda);


        entradaDedadosTeclado.close();
    }
}
