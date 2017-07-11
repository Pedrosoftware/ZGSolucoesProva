package zgprova.entity;

/**
 *
 * @author pedro
 */
public class PromocaoLeveXpagueY extends Promocao{

    public PromocaoLeveXpagueY(int idPromocao, int qtdParaCombo, 
            double precoUnitario, int qtdCobrarDoCombo) {
        super(idPromocao, qtdParaCombo, precoUnitario, qtdCobrarDoCombo);
    }

    
    
    @Override
    public double aplicar(int qtdProdutos) {
        this.definirComboEResto(qtdProdutos);
        double qtdCobrarPorCombo = this.getQtdCobrarDoCombo() * this.getPrecoUnitario();
        double precoProdRestantes = this.getTotalProdAlemDoCombo() * this.getPrecoUnitario();
        return (this.getTotalCombos() * qtdCobrarPorCombo) + precoProdRestantes;
    }
}
