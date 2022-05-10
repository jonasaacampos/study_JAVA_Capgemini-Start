package conversorTemperatura_exe07;

import java.util.Scanner;

public class conversorTemperatura_exe07 {
    /*
     * Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
     * Afórmula de conversão é:  F=(9*C+160) / 5
     * */
    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        double temperaturaF;
        double temperaturaC;

        System.out.print("Insira a temperatura em °C: ");
        temperaturaC = entradaDeDadosTeclado.nextDouble();

        temperaturaF = (9 * temperaturaC + 160) / 5;

        System.out.printf("A temperatura %.2fC equile a %.2fF.", temperaturaC, temperaturaF);
    }
}
