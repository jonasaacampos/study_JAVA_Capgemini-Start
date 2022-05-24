package OO.Pessoa;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    //atibutos
    private String nome;
    private Double altura;
    private LocalDate dataNascimento;
    String fichaCompleta;

    public String imprimirDados(){
        return getNome() + "tem " + getAltura() + " e nasceu em " + getDataNascimento() + "\n" +
                "Sua idade atual é de " + this.calcularIdade();

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

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
