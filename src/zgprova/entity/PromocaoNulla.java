package zgprova.entity;

/**
 *
 * @author pedro
 */
public class PromocaoNulla extends Promocao{

    public PromocaoNulla(double precoUnitario) {
        super(precoUnitario);
    }

    @Override
    public double aplicar(int qtdProdutos) {
        return qtdProdutos * this.getPrecoUnitario();
    }
    
}
