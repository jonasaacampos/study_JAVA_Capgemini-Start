package consumoMedioAutomovel_exe03;

import java.util.Scanner;

public class consumoMedio {
    /*
     * Escreva um algoritmo para determinar o consumo médio de um automóvel
     * sendo fornecida a
     * distância total percorrida
     * e o total de combustível gasto;*/

    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        int distanciaEmKm = 0;
        double litrosCombustivelGastos = 0;
        double consumoMedioCombustivel = 0;

        System.out.print("Insira a distância total percorrida: ");
        distanciaEmKm = entradaDeDadosTeclado.nextInt();

        System.out.print("Insira o total de litros de combustível consumidos: ");
        litrosCombustivelGastos = entradaDeDadosTeclado.nextDouble();

        consumoMedioCombustivel += (distanciaEmKm / litrosCombustivelGastos);
        System.out.printf("A média de consumo deste veículo é de %.2f litros/Km percorridos", consumoMedioCombustivel);

        entradaDeDadosTeclado.close();
    }
}
