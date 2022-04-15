package ex01;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Vito Andelini", LocalDate.parse("1971-04-12"), 1.74);

        System.out.println(pessoa);
        System.out.println("Idade de " + pessoa.getNome() + " é " + pessoa.calcularIdade(pessoa.getDataNascimento()));

    }
}
