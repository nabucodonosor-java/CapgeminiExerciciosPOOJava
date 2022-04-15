package ex08;

public class Main {

    public static void main(String[] args) {

        Data dt1 = new Data();

        Data dt2 = new Data("2020-04-20");

        Data dt3 = dt2.clonarData();

        System.out.println(dt1);
        System.out.println(dt2);

        dt2.compararDataComDataAtual();

        System.out.println("Dia da data " + dt2 + " -> " + dt2.getDia());
        System.out.println("Número do mês da data " + dt2 + " -> " + dt2.getMes());
        System.out.println("Nome por extenso do mês da data " + dt2 + " -> " + dt2.getMesExtenso());
        System.out.println("Número do ano da data " + dt2 + " -> " + dt2.getAno());
        System.out.println("O ano " + dt2.getAno() + " é bissexto? -> " + (dt2.isBissexto() ? "VERDADEIRO" : "FALSO"));
        System.out.println("CLONDE da data " + dt2 + " -> " + dt3);
    }
}
