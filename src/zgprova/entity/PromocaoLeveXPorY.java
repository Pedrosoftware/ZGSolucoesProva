package zgprova.entity;

/**
 *
 * @author pedro
 */
public class PromocaoLeveXPorY extends Promocao{

    public PromocaoLeveXPorY(int idPromocao, int qtdParaCombo, double precoUnitario, 
            double precoDoCombo) {
        super(idPromocao, qtdParaCombo, precoUnitario, precoDoCombo);
    }

    @Override
    public double aplicar(int qtdProdutos) {
        this.definirComboEResto(qtdProdutos);
        double precoTotalCombo = this.getTotalCombos() * this.getPrecoDoCombo();
        double precoProdRestantes = this.getTotalProdAlemDoCombo() * this.getPrecoUnitario(); 
        return precoTotalCombo + precoProdRestantes;
    }
}
