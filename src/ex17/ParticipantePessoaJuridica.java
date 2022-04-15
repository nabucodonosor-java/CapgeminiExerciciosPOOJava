package ex17;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 16 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 * @implNote Subclasse de Participante
 */
public class ParticipantePessoaJuridica extends Participante {

    private String cnpj;

    public ParticipantePessoaJuridica(String nome, String telefone, String cnpj) {
        super(nome, telefone);
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Empresa: " + super.getNome() + " - Telefone: " + super.getTelefone() + " - CNPJ: " + cnpj;
    }
}
