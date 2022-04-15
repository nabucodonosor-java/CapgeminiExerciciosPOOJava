package ex01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 01 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private double altura;

    public Pessoa(){}

    public Pessoa(String nome, LocalDate dataNascimento, double altura){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    // Método para calcular idade exata da pessoa
    public int calcularIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        int mesAtual = hoje.getMonthValue();
        int diaAtual = hoje.getDayOfMonth();
        int mesNasc = dataNascimento.getMonthValue();
        int diaNasc = dataNascimento.getDayOfMonth();
        long dif = ChronoUnit.DAYS.between(dataNascimento, hoje);
        int idade = (int) dif / 365;
        if((mesAtual < mesNasc) || (mesAtual == mesNasc && diaAtual < diaNasc)) idade--;
        return idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Data de Nascimento: " + dataNascimento + " - Altura: " + altura + "m";
    }
}
