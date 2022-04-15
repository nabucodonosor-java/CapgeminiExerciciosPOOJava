package ex11;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 11 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class IngressoVip extends Ingresso {

    private double valorAdicional;

    public IngressoVip(double valor, double valorAdicional) {
        super(valor + valorAdicional);
        this.valorAdicional = valorAdicional;
    }
}
