package ex11;

public class Main {

    public static void main(String[] args) {
        Ingresso i1 = new Ingresso(50.0);
        Ingresso iVip1 = new IngressoVip(50.0, 10.0);

        System.out.println("Ingresso");
        i1.imprimir();
        System.out.println("Ingresso VIP");
        iVip1.imprimir();

    }
}
