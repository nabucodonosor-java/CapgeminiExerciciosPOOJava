package ex14;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 14 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Fatura {

    private String numero;
    private String descricao;
    private int qtde;
    private double precoUnitario;

    public Fatura(String numero, String descricao, int qtde, double precoUnitario) {
        this.numero = numero;
        this.descricao = descricao;
        this.qtde = qtde;
        this.precoUnitario = precoUnitario;
    }

    public double getTotalFatura() {
        double total = qtde * precoUnitario;
        if (total < 0 || this.precoUnitario < 0) {
            total = 0.0;
            this.precoUnitario = 0.0;
            return 0.0;
        } else {
            return qtde * precoUnitario;
        }
    }

    @Override
    public String toString() {
        return "Fatura nº " + numero + ", Descrição: " + descricao +    ", QTDE: " + qtde +
                " e Preço Unitário: R$" + String.format("%.2f", precoUnitario);
    }
}
