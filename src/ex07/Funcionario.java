package ex07;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 07 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Funcionario {

    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;

    public Funcionario(){}

    public Funcionario(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        if (salarioMensal < 0) {
            this.salarioMensal = 0.0;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public void imprimirSalarioAnual() {
        double salarioAnual = this.salarioMensal * 12;
        System.out.println("Salário Anual do funcionário " + primeiroNome + " " + sobrenome + " R$" +
                String.format("%.2f", salarioAnual));
    }

    public void aumentarSalarioDezProcento() {
        double salarioAcrescido = this.salarioMensal + (this.salarioMensal * 10 / 100);
        setSalarioMensal(salarioAcrescido);
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                this.primeiroNome + " " + this.sobrenome + " R$" + String.format("%.2f", this.salarioMensal);
    }
}
