package zgprova.entity;

import java.util.HashMap;
import java.util.Map;
import zgprova.dao.ProdutoDao;

/**
 *
 * @author pedro
 */
public class Compra {

    private final Map<String, Item> itens;
    private final ProdutoDao dao;
    private Produto produto;

    public Compra() {
        dao = new ProdutoDao();
        itens = new HashMap<>();
    }

    public void add(String nomeProduto) throws Exception {
        if (!isParamValid(nomeProduto)) {
            return;
        }

        produto = dao.get(nomeProduto);

        if (produto == null) {
            throw new Exception("Produto inválido");
        }

        this.addOrIncrementItem(produto);

    }

    public void remove(String nomeProduto) throws Exception {
        if (!isParamValid(nomeProduto)) {
            return;
        }
        this.removeOrDecrementItem(nomeProduto);

    }

    public Map<String, Item> getItens() {
        return itens;
    }

    private void addOrIncrementItem(Produto produto) {
        String key = produto.getNome();
        if (itens.containsKey(key)) {
            itens.get(key).incrementarQuantidade();
        } else {
            itens.put(key, new Item(produto));
        }
    }

    private boolean isParamValid(String nomeProduto) throws Exception {
        if (nomeProduto.equals("")) {
            throw new Exception("Informe o nome do produto");
        }
        return true;
    }

    private void removeOrDecrementItem(String nome) {
        if(itens.containsKey(nome)){
            Item item = itens.get(nome);
            if(item.getQuantidade() > 1){
                item.decrementarQuantidade();
            }else{
                itens.remove(nome);
            }
        }
    }

}
