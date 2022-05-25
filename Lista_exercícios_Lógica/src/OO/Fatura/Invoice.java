package OO.Fatura;

public class Invoice {

    private int produtoCodigo;
    private String produtoDescricao;
    private float produtoPrecoUnitario;
    private int produtoQuantidade;


    public Invoice(int produtoCodigo, String produtoDescricao, int produtoQuantidade, float produtoPrecoUnitario) {
        this.setProdutoCodigo(produtoCodigo);
        this.setProdutoDescricao(produtoDescricao);
        this.setProdutoQuantidade(produtoQuantidade);
        this.setProdutoPrecoUnitario(produtoPrecoUnitario);
    }

    public int getProdutoCodigo() {
        return produtoCodigo;
    }

    public void setProdutoCodigo(int produtoCodigo) {
        this.produtoCodigo = produtoCodigo;
    }

    public String getProdutoDescricao() {
        return produtoDescricao;
    }

    public void setProdutoDescricao(String produtoDescricao) {
        this.produtoDescricao = produtoDescricao;
    }

    public float getProdutoPrecoUnitario() {
        return produtoPrecoUnitario;
    }

    public void setProdutoPrecoUnitario(float produtoPrecoUnitario) {
        if (produtoPrecoUnitario < 0) {
            this.produtoPrecoUnitario = 0;
        } else {
            this.produtoPrecoUnitario = produtoPrecoUnitario;
        }
    }

    public int getProdutoQuantidade() {
        return produtoQuantidade;
    }

    public void setProdutoQuantidade(int produtoQuantidade) {
        if (produtoQuantidade < 0) {
            this.produtoQuantidade = 0;
        } else {
            this.produtoQuantidade = produtoQuantidade;
        }
    }

    public double getInvoiceAmount(){
        return produtoQuantidade * produtoPrecoUnitario;
    }
}
