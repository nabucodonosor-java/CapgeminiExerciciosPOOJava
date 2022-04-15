package ex12;

public class Main {

    public static void main(String[] args) {

        Pessoa obiWan = new Pessoa("ObiWan Kenobi", 89, 1.74f);
        Pessoa yoda = new Pessoa("Mestre Yoda", 980, 1.01f);
        Pessoa windu = new Pessoa("Mestre Windu", 145, 1.82f);
        Pessoa guiGonn = new Pessoa("Gui Gonn", 107, 1.92f);
        Pessoa anakin = new Pessoa("Anakin Skywalker", 69, 1.88f);
        Pessoa vader = new Pessoa("Darth Vader", 63, 1.88f);
        Pessoa sidius = new Pessoa("Lorde Sidius", 849, 1.68f);
        Pessoa maul = new Pessoa("Darth Maul", 38, 1.81f);
        Pessoa plagueis = new Pessoa("Darth Plagueis", 165, 1.54f);
        Pessoa leia = new Pessoa("Léia Organa", 63, 1.66f);

        Agenda a1 = new Agenda();


        a1.armazenarPessoa(obiWan);
        a1.armazenarPessoa(yoda);
        a1.armazenarPessoa(windu);
        a1.armazenarPessoa(guiGonn);
        a1.armazenarPessoa(anakin);
        a1.armazenarPessoa(vader);
        a1.armazenarPessoa(sidius);
        a1.armazenarPessoa(maul);
        a1.armazenarPessoa(plagueis);
        a1.armazenarPessoa(leia);
        System.out.println("LISTA ORIGINAL");
        a1.imprimir();

        a1.removerPessoa("Darth Maul");
        System.out.println("LISTA APÓS REMOÇÃO");
        a1.imprimir();

        a1.imprimirPorIndex(2);

    }
}
