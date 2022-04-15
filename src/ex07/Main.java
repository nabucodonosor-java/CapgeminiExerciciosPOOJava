package ex07;

public class Main {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Sonny", "Corleone", 10000.0);
        Funcionario f2 = new Funcionario("Michael", "Corleone", 15000.0);

        System.out.println("*********Salários Anuais*********");
        f1.imprimirSalarioAnual();
        f2.imprimirSalarioAnual();

        f1.aumentarSalarioDezProcento();
        f2.aumentarSalarioDezProcento();
        System.out.println();
        System.out.println("*********Salários Anuais Após Aumento de 10%*********");
        f1.imprimirSalarioAnual();
        f2.imprimirSalarioAnual();
        System.out.println();
        System.out.println("*********Impressão dos Funcionários*********");
        System.out.println(f1);
        System.out.println(f2);
    }
}
