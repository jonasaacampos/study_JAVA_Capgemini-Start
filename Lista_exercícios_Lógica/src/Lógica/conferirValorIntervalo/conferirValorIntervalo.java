package Lógica.conferirValorIntervalo;

import java.util.Scanner;

public class conferirValorIntervalo {
    public static void main(String[] args) {
        Scanner entradaDedadosTeclado = new Scanner(System.in);
        int maxRange = 200;
        int minRange = 100;
        int numeroUsuario = 0;
        String mensagem = "";

        System.out.print("Insira qualquer número: ");
        numeroUsuario = entradaDedadosTeclado.nextInt();

        if (numeroUsuario >= minRange && numeroUsuario <= maxRange) {
            mensagem = "Valor dentro do intervalo";
        } else{
            mensagem = "Valor fora do intervalo";
        }

        System.out.print(mensagem);

        entradaDedadosTeclado.close();
    }
}
