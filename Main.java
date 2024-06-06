import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criar a lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        // Adicionar alguns produtos
        produtos.add(new Produto("Picanha Peça" , 42.5, 3));
        produtos.add(new Produto("Cerveja Heineken" , 4.5, 36));
        produtos.add(new Produto("Pão de Alho" , 11.5, 6));

        // Adicionar um produto perecível
        ProdutoPerecivel leite = new ProdutoPerecivel("Leite", 7.5, 15, new Date());
        produtos.add(leite);

        // Imprimir o tamanho da lista
        System.out.println("Tamanho da lista: " + produtos.size());

        // Recuperar um produto pelo índice
        Produto produto = produtos.get(1);
        System.out.println("Produto no índice 1: " + produto);

        // Imprimir a lista de produtos
        System.out.println("Lista de produtos:");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        // Imprimir os valores do produto perecível
        System.out.println("Produto perecível: " + leite);
    }
}

