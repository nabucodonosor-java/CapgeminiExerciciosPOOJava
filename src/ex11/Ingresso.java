package ex11;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 11 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Ingresso {

    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void imprimir() {
        System.out.println(String.format("%.2f", this.valor));
    }
}
