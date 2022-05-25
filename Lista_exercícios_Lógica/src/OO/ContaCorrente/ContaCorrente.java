package OO.ContaCorrente;

public class ContaCorrente {
    private int contaNumero;
    private float contaSaldo = 0;
    private String contaNomeCorrentista;

    public ContaCorrente(int contaNumero, float contaSaldo, String contaNomeCorrentista) {
        this.contaNumero = contaNumero;
        this.contaSaldo = contaSaldo;
        this.contaNomeCorrentista = contaNomeCorrentista;
    }

    public ContaCorrente(int contaNumero,  String contaNomeCorrentista) {
        this.contaNumero = contaNumero;
        this.contaNomeCorrentista = contaNomeCorrentista;
    }




    public void alterarNome(String correntista){
        this.contaNomeCorrentista = correntista;
    }

    public float depositar(float valorDeposito){
        this.setContaSaldo(this.contaSaldo + valorDeposito);
        return this.getContaSaldo();
    }

    public float sacar(float valorSaque){
        this.setContaSaldo(this.contaSaldo - valorSaque);
        return this.getContaSaldo();
    }

    public int getContaNumero() {
        return contaNumero;
    }

    public void setContaNumero(int contaNumero) {
        this.contaNumero = contaNumero;
    }

    public float getContaSaldo() {
        return contaSaldo;
    }

    public void setContaSaldo(float contaSaldo) {
        this.contaSaldo = contaSaldo;
    }

    public String getContaNomeCorrentista() {
        return contaNomeCorrentista;
    }

    public void setContaNomeCorrentista(String contaNomeCorrentista) {
        this.contaNomeCorrentista = contaNomeCorrentista;
    }
}
