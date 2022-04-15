package ex02;

public class Main {

    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(111, "ObiWan Kenobi", null);
        ContaCorrente cc2 = new ContaCorrente(222, "Mestre Yoda", 50.0);

        cc1.alterarNomeCorrentista("Mestre Windu");
        cc2.alterarNomeCorrentista("Qui Gonn");

        cc2.sacar(10.0);

        cc2.depositar(10.0, cc1);

        System.out.println(cc1);
        System.out.println(cc2);
    }
}
