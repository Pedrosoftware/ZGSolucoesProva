package zgprova.dao;

import java.util.HashMap;
import java.util.Map;
import zgprova.entity.Produto;

/**
 *
 * @author pedro
 */
public class ProdutoDao {

    private final Map<String, Produto> produtos;
    
    public ProdutoDao(){
               
        PromocaoDao promoDao = new PromocaoDao();
        
        Produto a = new Produto(1, "A", 50);
        a.addPromocao(promoDao.get(1));
        a.addPromocao(promoDao.get(4));
        Produto b = new Produto(2, "B", 30);
        b.addPromocao(promoDao.get(2));
        Produto c = new Produto(3, "C", 20);
        c.addPromocao(promoDao.get(3));
        Produto d = new Produto(4, "D", 15);
                
        produtos = new HashMap<>();
        produtos.put("A", a);
        produtos.put("B", b);
        produtos.put("C", c);
        produtos.put("D", d);
    }
    
    public Produto get(String nome){
        return produtos.get(nome);
    }
    
}
