package ex10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 10 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Jogador {

    private String nome;
    private String posicao;
    private LocalDate dataNascimento;
    private String nacionalidade;
    private double altura;
    private double peso;

    public Jogador() {
    }

    public Jogador(String nome, String posicao, String dataNascimento, String nacionalidade, double altura, double peso) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = LocalDate.parse(dataNascimento);
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

    // Calcula a idade exata do jogador
    public int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        int mesAtual = hoje.getMonthValue();
        int diaAtual = hoje.getDayOfMonth();
        int mesNasc = dataNascimento.getMonthValue();
        int diaNasc = dataNascimento.getDayOfMonth();
        long dif = ChronoUnit.DAYS.between(dataNascimento, hoje);
        int idade = (int) dif / 365;
        if ((mesAtual < mesNasc) || (mesAtual == mesNasc && diaAtual < diaNasc)) idade--;
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void tempoRestanteParaAposentar() {
        int idadeDesefa = 40;
        int idadeMeioCampo = 38;
        int idadeAtacante = 35;
        int idadeJogador = calcularIdade();

        switch (this.posicao) {

            case "Defensor":
                if (idadeJogador > idadeDesefa) {
                    System.out.println("Jogador APOSENTADO há " + (idadeJogador - idadeDesefa) + " anos.");
                    break;
                } else {
                    System.out.println("Faltam " + (idadeDesefa - idadeJogador) + " anos para APOSENTADORIA.");
                    break;
                }
            case "Atacante":
                if (idadeJogador > idadeAtacante) {
                    System.out.println("Jogador APOSENTADO há " + (idadeJogador - idadeAtacante) + " anos.");
                    break;
                } else {
                    System.out.println("Faltam " + (idadeAtacante - idadeJogador) + " anos para APOSENTADORIA.");
                    break;
                }
            case "Meio-Campo":
                if (idadeJogador > idadeMeioCampo) {
                    System.out.println("Jogador APOSENTADO há " + (idadeJogador - idadeMeioCampo) + " anos.");
                    break;
                } else {
                    System.out.println("Faltam " + (idadeMeioCampo - idadeJogador) + " anos para APOSENTADORIA.");
                    break;
                }
            default:
                System.out.println("Posição Inválida!");
        }

    }
}
