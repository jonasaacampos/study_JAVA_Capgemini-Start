package calculoComissaoVendedor_exe04;

import java.util.Scanner;

public class comissaoVendedor {
    /*
     * Escreva um algoritmo que leia
     * o nome de um vendedor,
     * o seu salário fixo e
     * o total de vendas efetuadas por ele no mês (em dinheiro).
     *
     * Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
     * informar o seu nome, o salário fixo e salário no final do mês;
     * */
    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        String vendedorNome = "";
        double vendedorTotalVendidoMes = 0;
        double vendedorSalario = 0;
        double vendedorComissaoTaxa = 0.15;
        double vendedorComissaoCalculada = 0;

        System.out.print("Informe o nome do vendedor: ");
        vendedorNome = entradaDeDadosTeclado.nextLine();

        System.out.print("Informe o salário fixo R$: ");
        vendedorSalario = entradaDeDadosTeclado.nextDouble();

        System.out.print("Informe o total vendido R$: ");
        vendedorTotalVendidoMes = entradaDeDadosTeclado.nextDouble();

        vendedorComissaoCalculada = vendedorTotalVendidoMes * vendedorComissaoTaxa;
        double vendedorSalarioFinal = vendedorSalario + vendedorComissaoCalculada;

        System.out.println("Para o mês corrente foram calculados os valores para o vendedor " + vendedorNome);
        System.out.printf("Salario Base: R$ %.2f\n", vendedorSalario);
        System.out.printf("Salário final (Salario + comissão): R$ %.2f", vendedorSalarioFinal);
    }
}
