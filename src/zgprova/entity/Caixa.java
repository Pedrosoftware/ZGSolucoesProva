package zgprova.entity;

import java.util.Map;

/**
 *
 * @author pedro
 */
public class Caixa {

    private final Compra compra;
    private double totalDesconto;
    private double totalPreco;

    public Caixa(Compra compra) {
        this.compra = compra;
        this.totalPreco = 0;
        this.totalDesconto = 0;
    }

    public double getTotalPrice() {
        this.getPrecos();
        return totalPreco;
    }

    public double getTotalDiscount() {
        this.getPrecos();
        return totalDesconto;
    }

    private void getPrecos() {
        double totalPrecoItem;
        double totalPrecoComDescItem;
        totalPreco = 0;
        totalDesconto = 0;

        Item item;
        for (Map.Entry<String, Item> mapa : compra.getItens().entrySet()) {
            item = mapa.getValue();
            totalPrecoItem = item.getProduto().getPreco() * item.getQuantidade();
            totalPrecoComDescItem = this.getValorAPagar(item.getProduto(), item.getQuantidade());
            totalPreco += totalPrecoComDescItem;
            totalDesconto += totalPrecoItem - totalPrecoComDescItem;
        }
    }

    private double getValorAPagar(Produto produto, int quantidade) {
        double precoPromocao;
        double melhorPreco = 0;
        for (Promocao promocao : produto.getPromocoes()) {
            precoPromocao = promocao.aplicar(quantidade);
            if (melhorPreco > precoPromocao || melhorPreco == 0) {
                melhorPreco = precoPromocao;
            }
        }
        return melhorPreco;
    }
}
