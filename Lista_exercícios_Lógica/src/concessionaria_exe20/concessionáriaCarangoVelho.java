package concessionaria_exe20;

import java.util.Scanner;

public class concessionáriaCarangoVelho {
/*
* A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”.
Informar total de carros com ano até 2000 e total geral;
* */
    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        int executarPrograma = 1;
        int carroAno;
        double carroPreco;
        double descontoAteAno2000 = 0.12;
        double descontoAposAno2000 = 0.07;
        double carroAtualDesconto, carroAtualValor;
        double totalVendidosValor = 0;
        int totalVendidosCarrosAntigos = 0;


        do {
            System.out.print("Insira o valor do veículo: R$ ");
            carroPreco = entradaDeDadosTeclado.nextDouble();
            System.out.print("Qual o ano de fabricação? ");
            carroAno = entradaDeDadosTeclado.nextInt();

            if (carroAno < 2000){
                carroAtualDesconto = descontoAteAno2000;
                totalVendidosCarrosAntigos++;
            }else {
                carroAtualDesconto = descontoAposAno2000;
            }

            carroAtualValor = carroPreco - (carroPreco * carroAtualDesconto);
            totalVendidosValor+= carroAtualValor;

            System.out.printf("Bela aquisição!" +
                    "\nUma preciosidade de %.2f" +
                    "\ncom um desconto ele sai por APENAS %.2f !!!", carroPreco, carroAtualValor);

            System.out.println("");
            System.out.println("Deseja continuar comprando? Digite\n0 - sair\n1 - continuar");
            executarPrograma = entradaDeDadosTeclado.nextInt();
            System.out.println();

        }while (executarPrograma == 1);

        System.out.printf("No total foram gastos R$%.2f com carros seminovos" +
                "\nForam adiquiridos %d carros com fabricação até o ano 2000", totalVendidosValor, totalVendidosCarrosAntigos);

        entradaDeDadosTeclado.close();
    }
}
