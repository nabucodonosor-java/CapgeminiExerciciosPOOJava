package ex17;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 16 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 * @implNote Subclasse de Participante
 */
public class ParticipantePessoaFisica extends Participante {

    private String cpf;

    public ParticipantePessoaFisica(String nome, String telefone, String cpf) {
        super(nome, telefone);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa: " + super.getNome() + " - Telefone: " + super.getTelefone() + " - CPF: " + cpf;
    }
}
