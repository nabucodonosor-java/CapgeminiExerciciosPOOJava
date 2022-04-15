package ex16;

public class Main {

    public static void main(String[] args) {
        Carro dkv = new Carro("DKV");

        dkv.abastecer(45);

        System.out.println(dkv);

        dkv.mover(100);

        System.out.println(dkv);

        dkv.mover(100);

        System.out.println(dkv);

        dkv.mover(200);

        System.out.println(dkv);
    }
}
