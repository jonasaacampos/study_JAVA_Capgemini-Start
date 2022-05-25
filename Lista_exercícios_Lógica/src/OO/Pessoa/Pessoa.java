package OO.Pessoa;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    //atibutos
    private String nome;
    private int altura;
    private LocalDate dataNascimento;

    public String imprimirDados(){
        return getNome() + "tem " + getAltura() + " de altura e nasceu em " + getDataNascimento() + "\n" +
                "Sua idade atual é de " + this.calcularIdade() + "anos.";

    }
    public int calcularIdade() {
        int idade = Period.between(this.dataNascimento, LocalDate.now()).getYears();
        return idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
