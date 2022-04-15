package ex15;

public class FuncionarioTeste {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("ObiWan", "Kenobi", 1000.0);
        Funcionario f2 = new Funcionario("Mestre", "Yoda", 2000.0);

        System.out.println("O salário Mensal do funcionário " + f1.getNome() + " é de R$" +
                String.format("%.2f", f1.getSalarioMensal()));
        System.out.println("O salário Mensal do funcionário " + f1.getNome() + " acrescido 10% é de R$" +
                String.format("%.2f", f1.aumentarSalarioDezPorcento()));
        System.out.println("O salário Mensal do funcionário " + f2.getNome() + " é de R$" +
                String.format("%.2f", f2.getSalarioMensal()));
        System.out.println("O salário Mensal do funcionário " + f2.getNome() + " acrescido 10% é de R$" +
                String.format("%.2f", f2.aumentarSalarioDezPorcento()));
    }
}
