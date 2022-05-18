package classificandoNumeros_exe17;

import java.util.Scanner;

public class classificadorNumerico {
    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        int intervaloInicial = 10;
        int intervaloFinal = 150;
        int quantidadeNumerosQueSeraoProcessados, numeroDigitadoUsuario;
        int quantidadeNumerosDentroDoIntervalo = 0;


        System.out.print("Insira o número de iterações...: ");
        quantidadeNumerosQueSeraoProcessados = entradaDeDadosTeclado.nextInt();
        int controleIteracoes = 0;

        while (controleIteracoes < quantidadeNumerosQueSeraoProcessados){
            System.out.print("Insira quqlquer número");
            numeroDigitadoUsuario = entradaDeDadosTeclado.nextInt();
            if(numeroDigitadoUsuario <= intervaloFinal && numeroDigitadoUsuario >= intervaloInicial){
                quantidadeNumerosDentroDoIntervalo++;
            }
            controleIteracoes++;
        }

        System.out.println("---Fim do programa---");
        System.out.printf("Foram digigados %d números no internavo de %d e %d", quantidadeNumerosDentroDoIntervalo, intervaloInicial, intervaloFinal);

        entradaDeDadosTeclado.close();

    }
}
