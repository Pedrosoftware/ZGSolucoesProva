package zgprova.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro
 */
public class Produto {

    private int id;
    private String nome;
    private double preco;
    private final List<Promocao> promocoes;


    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        promocoes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Promocao> getPromocoes() {
        if(promocoes.isEmpty()){
            promocoes.add(new PromocaoNulla(this.getPreco()));
        }
        return promocoes;
    }

    public void addPromocao(Promocao promocao) {
        this.promocoes.add(promocao);
    }
    
}
