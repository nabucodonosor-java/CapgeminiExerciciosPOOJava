package ex06;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 06 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Invoice {

    private String numeroItem;
    private String descricaoItem;
    private int qtdeComprada;
    private double precoUnitario;

    public Invoice(){}

    public Invoice(String numeroItem, String descricaoItem, int qtdeComprada, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        if (qtdeComprada < 0) {
            this.qtdeComprada = 0;
        } else {
            this.qtdeComprada = qtdeComprada;
        }
        if (precoUnitario < 0) {
            this.precoUnitario = 0.0;
        } else {
            this.precoUnitario = precoUnitario;
        }
    }

    public String getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(String numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQtdeComprada() {
        return qtdeComprada;
    }

    public void setQtdeComprada(int qtdeComprada) {
        this.qtdeComprada = qtdeComprada;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getInvoiceAmount() {
        return qtdeComprada * precoUnitario;
    }
}
