package ex15;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 15 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Funcionario {

    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public double aumentarSalarioDezPorcento() {
        double salarioAcrescido = this.salarioMensal + (this.salarioMensal * 10) / 100;
        return salarioAcrescido;
    }
}
