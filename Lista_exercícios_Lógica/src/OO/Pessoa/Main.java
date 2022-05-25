package OO.Pessoa;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.print("Insira o nome da pessoa: ");
        p.setNome(entradaDeDadosTeclado.nextLine());

//        System.out.print("Insira a altura: ");
//        p.setAltura(entradaDeDadosTeclado.nextInt());

        System.out.print("Insira da data de nascimento [YYYY-MM-DD]: ");
        p.setDataNascimento(LocalDate.parse(entradaDeDadosTeclado.nextLine()));


        System.out.println(p.imprimirDados());


        entradaDeDadosTeclado.close();
    }
}
