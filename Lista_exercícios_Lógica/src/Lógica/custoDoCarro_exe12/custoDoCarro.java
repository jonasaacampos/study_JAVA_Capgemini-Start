package Lógica.custoDoCarro_exe12;

import java.util.Scanner;

public class custoDoCarro {
    /*
    * O custo de um carro novo ao consumidoré a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados
    * (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual do distribuidor sobre o resultado).
    * Supondo que o percentual do distribuidor seja de 28% e os impostos 45%,
    * escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor.
mesmo;
    * */
    public static void main(String[] args) {
        Scanner entradaDedadosTeclado = new Scanner(System.in);
        double taxaTotalImpostos = 0.45;
        double taxaDistribuidor = 0.28;
        double valorCusto, valorVenda, valorImpostos, valorDistribuidor;

        System.out.print("Insira o valor de custo do veículo: R$");
        valorCusto = entradaDedadosTeclado.nextDouble();

        valorImpostos = valorCusto * taxaTotalImpostos;
        valorDistribuidor = (valorCusto + valorImpostos) * taxaDistribuidor;

        valorVenda = valorCusto + valorDistribuidor + valorImpostos;

        System.out.printf("O valor total com as taxas de distribuição e ipostos é de R$%.2f", valorVenda);


        entradaDedadosTeclado.close();


    }

}
