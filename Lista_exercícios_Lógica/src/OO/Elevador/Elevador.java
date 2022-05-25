package OO.Elevador;

import java.util.Scanner;

public class Elevador {
    private int andarAtual = 0;
    private int andarTotalAndares, capacidadeCargaPessoas, pessoasNoElevador;

    public void inicializar() {
        Scanner entradaDeDadosTeclado = new Scanner(System.in);

        System.out.print("Insira quantos andares possui o prédio: ");
        setAndarTotalAndares(entradaDeDadosTeclado.nextInt());

        System.out.print("Capacidade máxima do elevador. [quantidade de pessoas]: ");
        setCapacidadeCargaPessoas(entradaDeDadosTeclado.nextInt());

        entradaDeDadosTeclado.close();
    }

    public String entrar(int quantidadePessoas) {
        if (quantidadePessoas < getPessoasNoElevador()) {
            setCapacidadeCargaPessoas(this.capacidadeCargaPessoas - quantidadePessoas);
            setPessoasNoElevador(this.pessoasNoElevador + quantidadePessoas);
            return "Portas fechando...";
        } else {
            return "Aguarde o próximo elevador";
        }
    }

    public void sair(int quantidadePessoas) {
        if (getPessoasNoElevador() > 0) {
            setCapacidadeCargaPessoas(this.capacidadeCargaPessoas + quantidadePessoas);
            setPessoasNoElevador(this.pessoasNoElevador - quantidadePessoas);
        }

        if (getPessoasNoElevador() < 0) {
            setPessoasNoElevador(0);
        }
    }

    public void sobe(){
        if (getAndarAtual() < getAndarTotalAndares()){
            setAndarAtual(this.andarAtual + 1);
        }
    }

    public void desce(){
        if (getAndarAtual() > 0){
            setAndarAtual(this.andarAtual -1);
        }
    }


    //


    @Override
    public String toString() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", andarTotalAndares=" + andarTotalAndares +
                ", capacidadeCargaPessoas=" + capacidadeCargaPessoas +
                ", pessoasNoElevador=" + pessoasNoElevador +
                '}';
    }

    //getter e setters
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getAndarTotalAndares() {
        return andarTotalAndares;
    }

    public void setAndarTotalAndares(int andarTotalAndares) {
        this.andarTotalAndares = andarTotalAndares;
    }

    public int getCapacidadeCargaPessoas() {
        return capacidadeCargaPessoas;
    }

    public void setCapacidadeCargaPessoas(int capacidadeCargaPessoas) {
        this.capacidadeCargaPessoas = capacidadeCargaPessoas;
    }

    public int getPessoasNoElevador() {
        return pessoasNoElevador;
    }

    public void setPessoasNoElevador(int pessoasNoElevador) {
        this.pessoasNoElevador = pessoasNoElevador;
    }
}
