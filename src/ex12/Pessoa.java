package ex12;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 12 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Pessoa {

    private String nome;
    private int idade;
    private float altura;

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade + " anos, altura: " + String.format("%.2f", altura) + "m";
    }
}
