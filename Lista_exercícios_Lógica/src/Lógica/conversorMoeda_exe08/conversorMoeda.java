package Lógica.conversorMoeda_exe08;

import java.util.Scanner;

public class conversorMoeda {

    /*
     * Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor
     * lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar
     * e também aquantidade de dólares disponíveis com ousuário;
     * */

    public static void main(String[] args) {
        Scanner entradaDedadosTeclado = new Scanner(System.in);
        double valorCotacaoDolar, valorEmReais, valorEmDolar;

        System.out.print("Insira a cotação do US$ atual: ");
        valorCotacaoDolar = entradaDedadosTeclado.nextDouble();

        System.out.print("Insira o valor para conversão: ");
        valorEmReais = entradaDedadosTeclado.nextDouble();

        valorEmDolar = valorEmReais / valorCotacaoDolar;

        System.out.printf("Nesta taxa de câmbio, R$%.2f equilavem a USD$%.2f", valorEmReais, valorEmDolar);

        entradaDedadosTeclado.close();
    }
}
