import java.util.Date;

public class ProdutoPerecivel extends Produto {
    private Date dataValidade;

    // Construtor
    public ProdutoPerecivel(String nome, double preco, int quantidade, Date dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    // Getter e Setter para dataValidade
    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método toString() para incluir dataValidade
    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", quantidade=" + getQuantidade() +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
