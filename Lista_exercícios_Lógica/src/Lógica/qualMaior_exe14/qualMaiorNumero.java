package Lógica.qualMaior_exe14;

import java.util.Scanner;

public class qualMaiorNumero {
    public static void main(String[] args) {
        Scanner entradaDedadosTeclado = new Scanner(System.in);
        int numero1, numero2, maior;

        System.out.print("Insira qualquer número: ");
        numero1 = entradaDedadosTeclado.nextInt();
        maior = numero1;
        System.out.print("Insira outro número: ");
        numero2 = entradaDedadosTeclado.nextInt();

        if(numero2 > maior){
            maior = numero2;
        }
        System.out.printf("O maior número é o %d", maior);

        entradaDedadosTeclado.close();
    }
}
