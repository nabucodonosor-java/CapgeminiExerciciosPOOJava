package ex12;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 12 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Agenda {

    private Pessoa contatos[] = new Pessoa[10];

    public void armazenarPessoa(Pessoa pessoa) {
        for (int i = 0; i < 10; i++) {
            if (contatos[i] == null) {
                contatos[i] = pessoa;
                break;
            }
            if (contatos[9] != null) {
                System.out.println("AGENDA CHEIA!");
                break;
            }
        }
    }

    public void removerPessoa(String nomePessoa) {

        int index = buscarPessoa(nomePessoa);
        int lastIndex = contatos.length - 1;

        if (contemPessoa(nomePessoa)) {
            this.contatos[buscarPessoa(nomePessoa)] = null;
        } else {
            System.out.println("Pessoa não encontrada!");
        }

        while (index < lastIndex) {
            contatos[index] = contatos[index + 1];
            index++;
        }
        contatos[lastIndex] = null;

    }
    // informa em que posição da agenda está a pessoa
    public Integer buscarPessoa(String nomePessoa) {
        for (int i = 0; i < 10; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nomePessoa)) {
                return i;
            }
        }
        return null;
    }
    // Imprimir toda agenda
    public void imprimir() {
        for (int i = 0; i < 10; i++) {
            System.out.println(contatos[i]);
        }
    }

    // Imprimir pessoa pelo índice agenda
    public void imprimirPorIndex(int i) {
        if (i > contatos.length) {
            System.out.println("Posição inválida");
        } else {
            System.out.println(contatos[i]);
        }
    }

    // Método privado retorna TRUE caso nomePessoa esteja na lista
    private boolean contemPessoa(String nomePessoa) {
        for (int i = 0; i < 10; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nomePessoa)) {
                return true;
            }
        }
        return false;
    }
}
