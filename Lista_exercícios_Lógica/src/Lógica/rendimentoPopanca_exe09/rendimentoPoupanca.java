package Lógica.rendimentoPopanca_exe09;

import java.util.Scanner;

public class rendimentoPoupanca {
    /*
     * Faça um algoritmo que receba um valor que foi depositado e
     * exiba o valor com rendimento após um mês.
     * Considere fixo o juro da poupança em 0,07% a. m;
     * */
    public static void main(String[] args) {
        Scanner entradaDedadosTeclado = new Scanner(System.in);
        double taxaJuros = 0.007;
        double valorAplicado, valorJuros, valorCalculado;

        System.out.print("Insira o valor da sua aplicação: R$");
        valorAplicado = entradaDedadosTeclado.nextDouble();

        valorJuros = valorAplicado * taxaJuros;
        valorCalculado = valorAplicado + valorJuros;

        System.out.printf("Após 30 dias o seu reundimento será de R$%.2f", valorCalculado);


        entradaDedadosTeclado.close();
    }

}
