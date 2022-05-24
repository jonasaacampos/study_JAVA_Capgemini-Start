package Lógica.boletimMelhorado_exe16;

import java.util.Scanner;

public class boletim {

    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);
        String alunoNome = "";
        double[] notas = new double[3];
        double media = 0;
        double totalNotas = 0;
        String statusAprovacao = "";

        System.out.print("Informe o nome do aluno: ");
        alunoNome = entradaDeDadosTeclado.nextLine();

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Insira sua " + (i + 1) + "ª nota: ");
            notas[i] = entradaDeDadosTeclado.nextDouble();
        }

        for (double nota : notas) {
            totalNotas += nota;
        }

        media = totalNotas / notas.length;

        if(media >= 7){
            statusAprovacao = "Aprovado!";
        } else if (media > 5 ) {
            statusAprovacao = "Recuperação";
        }else{
            statusAprovacao = "Reprovado!";
        }

        System.out.printf("A média de notas do aluno %s é: %.2f." +
                "\nEste aluno foi %s", alunoNome, media, statusAprovacao);

        entradaDeDadosTeclado.close();
    }

}
