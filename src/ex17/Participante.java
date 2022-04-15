package ex17;

import java.util.Objects;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 16 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 * @implNote Declarei a classe como abstrata para evitar que seja instanciada
 */
public abstract class Participante {

    private String nome;
    private String telefone;

    public Participante(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return nome.equals(that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
