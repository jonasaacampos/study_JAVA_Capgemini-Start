package Lógica.valorPrestacoes_exe10;

import java.util.Scanner;

public class valorPrestacoes {
    /*
    * A Loja Mamão com Açúcar está vendendo seus produtos em
    * 5(cinco)prestações sem juros. Faça um algoritmo que
    * receba um valor de uma compra e mostre o valor das prestações
    * */
    public static void main(String[] args) {
        Scanner entradaDedadosTeclado = new Scanner(System.in);
        int quantidadeParcelas = 5;
        double valorTotalCompra = 0;
        double valorParcelas = 0;

        System.out.print("Insira o total da compra: R$");
        valorTotalCompra = entradaDedadosTeclado.nextDouble();

        valorParcelas = valorTotalCompra / quantidadeParcelas;

        System.out.printf("O valor da sua prestação será de R$%.2f", valorParcelas);

        entradaDedadosTeclado.close();
    }
}


