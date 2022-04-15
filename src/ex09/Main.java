package ex09;

public class Main {

    public static void main(String[] args) {
        Voo v1 = new Voo("1734", "2022-04-10");
        System.out.println("Qtde de Assentos disponíveis: " + v1.getQtdeAssentosDisponiveis());
        v1.proximoAssentoLivre();

        v1.ocuparAssento(2,5);
        v1.layout();
        v1.verificarDisponibilidadeAssento(2,5);
        System.out.println("Qtde de Assentos disponíveis: " + v1.getQtdeAssentosDisponiveis());
        System.out.println("Número do vôo: " + v1.getVoo());
    }
}
