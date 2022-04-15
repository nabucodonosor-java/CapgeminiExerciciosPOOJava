package ex06;

public class Main {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("111", "SmarTV", 2, 1500.0);

        System.out.println(String.format("%.2f", invoice.getInvoiceAmount()));
    }
}
