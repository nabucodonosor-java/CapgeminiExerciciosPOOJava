package ex04;

public class Main {

    public static void main(String[] args) {

        Elevador e1 = new Elevador(10, 8);

        e1.acrescentarPessoa(5);
        e1.acrescentarPessoa(5);
        e1.removerPessoa(5);
        e1.acrescentarPessoa(8);
        e1.removerPessoa(5);

        // Subir 10 andares
        for (int i = 0; i < 10; i++) {
            e1.subirUmAndar();
        }

        e1.subirUmAndar();
        e1.subirUmAndar();
        e1.acrescentarPessoa(5);

        // Descer 10 andares
        for (int i = 0; i < 10; i++) {
            e1.descerUmAndar();
        }

        e1.removerPessoa(8);
        System.out.println(e1);
    }
}
