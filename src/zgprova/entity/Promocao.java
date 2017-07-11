package zgprova.entity;

/**
 *
 * @author pedro
 */
public abstract class Promocao {

    private int idPromocao;
    private int qtdParaCombo;
    private final double precoUnitario;
    private int totalCombos;
    private int totalProdAlemDoCombo;
    private int qtdCobrarDoCombo;
    private double precoDoCombo;

    public Promocao(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public Promocao(int idPromocao, int qtdParaCombo, double precoUnitario, double precoDoCombo) {
        this.idPromocao = idPromocao;
        this.qtdParaCombo = qtdParaCombo;
        this.precoDoCombo = precoDoCombo;
        this.precoUnitario = precoUnitario;
    }

    public Promocao(int idPromocao, int qtdParaCombo, double precoUnitario, int qtdCobrarDoCombo) {
        this.idPromocao = idPromocao;
        this.qtdParaCombo = qtdParaCombo;
        this.precoUnitario = precoUnitario;
        this.qtdCobrarDoCombo = qtdCobrarDoCombo;
    }

    public abstract double aplicar(int qtdProdutos);

    protected void definirComboEResto(int qtdProdutos) {
        this.definirTotalCombos(qtdProdutos);
        this.definirTotalProdAlemDoCombo(qtdProdutos);
    }

    private void definirTotalCombos(int qtdProdutos) {
        this.totalCombos = 0;
        if (qtdProdutos >= this.getQtdToCombo() && this.getQtdToCombo() > 0) {
            this.totalCombos = qtdProdutos / this.getQtdToCombo();
        }
    }

    private void definirTotalProdAlemDoCombo(int qtdProdutos) {
        this.totalProdAlemDoCombo = 
                qtdProdutos - (this.getQtdToCombo() * this.totalCombos);
    }

    protected final int getQtdToCombo() {
        return qtdParaCombo;
    }

    protected final double getPrecoDoCombo() {
        return precoDoCombo;
    }

    protected final double getPrecoUnitario() {
        return precoUnitario;
    }

    protected int getTotalCombos() {
        return totalCombos;
    }

    protected int getTotalProdAlemDoCombo() {
        return totalProdAlemDoCombo;
    }

    public int getQtdCobrarDoCombo() {
        return qtdCobrarDoCombo;
    }

    public int getIdPromocao() {
        return idPromocao;
    }
}
