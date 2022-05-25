package OO.BombaCombustivel;

public class BombaCombustivel {
    private String combustivelTipo;
    private float precoPorLitro;
    private float quantidadeLitros;

    public BombaCombustivel(String combustivelTipo, float precoPorLitro, float quantidadeLitros) {
        this.combustivelTipo = combustivelTipo;
        this.precoPorLitro = precoPorLitro;
        this.quantidadeLitros = quantidadeLitros;
    }

    public String abastecerPorValor (float valor){
        float litrosPorValor = valor / getPrecoPorLitro();
        setQuantidadeLitros(this.quantidadeLitros -litrosPorValor);
        return "Foram abastecidos " + litrosPorValor + " litros.";
    }

    public String abastecerPorLitro (float litros){
        float valorParaPagamento = litros * getPrecoPorLitro();
        setQuantidadeLitros(this.quantidadeLitros - litros);
        return "Seu abastecimento totalizou em R$ " + valorParaPagamento;
    }

    public void alterarValor(float novoValor){
        setPrecoPorLitro(novoValor);
    }

    public void alterarCombustivel(String tipoCombustivel){
        setCombustivelTipo(tipoCombustivel);
    }

    public void alterarQuantidadeCombustivel(float quantidadeLitrosAdicionadosNaBomba){
        setQuantidadeLitros(this.quantidadeLitros + quantidadeLitrosAdicionadosNaBomba);
    }

    public String statusBomba (){
        String  informacoesBomba= "" + this.toString();
        return informacoesBomba;
    }

    @Override
    public String toString() {
        return "BombaCombustivel{" +
                "combustivelTipo='" + combustivelTipo + '\'' +
                ", precoPorLitro=" + precoPorLitro +
                ", quantidadeLitros=" + quantidadeLitros +
                '}';
    }

    public String getCombustivelTipo() {
        return combustivelTipo;
    }

    public void setCombustivelTipo(String combustivelTipo) {
        this.combustivelTipo = combustivelTipo;
    }

    public float getPrecoPorLitro() {
        return precoPorLitro;
    }

    public void setPrecoPorLitro(float precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }

    public float getQuantidadeLitros() {
        return quantidadeLitros;
    }

    public void setQuantidadeLitros(float quantidadeLitros) {
        this.quantidadeLitros = quantidadeLitros;
    }
}
