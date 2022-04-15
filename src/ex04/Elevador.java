package ex04;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 04 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Elevador {

    private int andarAtual;
    private int totalAndaresPredio;
    private int capacidadeMaximaDePessoas;
    private int totalDePessoas;

    public Elevador(){}

    // Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no
    // prédio (os elevadores sempre começam no térreo e vazio); - Optei por utiizar método construtor
    public Elevador(int totalAndaresPredio,  int capacidadeMaximaDePessoas) {
        this.andarAtual = 0;
        this.totalAndaresPredio = totalAndaresPredio;
        this.capacidadeMaximaDePessoas = capacidadeMaximaDePessoas;
        this.totalDePessoas = 0;
    }

    // Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço)
    public void acrescentarPessoa(int qtde) {
        int qtdeAtual = qtde + totalDePessoas;
        if (qtdeAtual > capacidadeMaximaDePessoas) {
            System.out.println("Capacidade Máxima Excedida! - Máximo " + capacidadeMaximaDePessoas + " pessoas");
        } else {
            totalDePessoas = totalDePessoas + qtde;
            System.out.println("Qtde de Pessoas no elevador: " + this.totalDePessoas);
        }
    }

    // Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele)
    public void removerPessoa(int qtde) {
        if (qtde > totalDePessoas) {
            System.out.println("Elevador está com " + totalDePessoas + " porém estão sendo removidos " + qtde);
        } else if (totalDePessoas == 0) {
            System.out.println("Elevador vazio!");
        } else {
            this.totalDePessoas = this.totalDePessoas - qtde;
            System.out.println("Qtde de Pessoas no elevador: " + this.totalDePessoas);
        }
    }

    // Sobe: para subir um andar (não deve subir se já estiver no último andar)
    public void subirUmAndar() {
        if (andarAtual >= totalAndaresPredio) {
            System.out.println("Elevador chegou no último andar");
        } else {
            andarAtual++;
        }
    }
    // Desce: para descer um andar (não deve descer se já estiver no térreo);
    public void descerUmAndar() {
        if (andarAtual <= 0) {
            System.out.println("Elevador chegou no térreo");
        } else {
            andarAtual--;
        }
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "Andar Atual: " + andarAtual +
                ", Total de Andares no Prédio: " + totalAndaresPredio +
                ", Capacidade Máxima de Pessoas: " + capacidadeMaximaDePessoas +
                ", Total de Pessoas no Elevador: " + totalDePessoas +
                '}';
    }
}
