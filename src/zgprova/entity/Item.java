package zgprova.entity;

/**
 *
 * @author pedro
 */
public class Item {

    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Item(Produto produto) {
        this.produto = produto;
        this.quantidade = 1;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void incrementarQuantidade() {
        this.quantidade++;
    }

    public void decrementarQuantidade(){
        this.quantidade--;
    }
}
