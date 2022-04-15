package ex14;

public class FaturaTeste {

    public static void main(String[] args) {
        Fatura f1 = new Fatura("001", "SMARTV", 2, 1500.0);

        System.out.println("A " + f1 + " tem um valor total de R$" + f1.getTotalFatura());
    }
}
