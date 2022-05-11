package verifiqueSeMaior10_exe13;

import java.util.Scanner;

public class maiorQue10 {
    public static void main(String[] args) {
        Scanner entradaDedadosTeclado = new Scanner(System.in);
        int numero;
        System.out.print("Insira qualquer número: ");
        numero = entradaDedadosTeclado.nextInt();
        if(numero <= 10){
            System.out.println("");
        }else {
            System.out.println("Valor digitado é maior que 10...");
        }

        entradaDedadosTeclado.close();
    }
}
