package ex05;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 05 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Aluno {

    private String matricula;
    private String nome;
    private Prova provas[] = new Prova[2];
    private Trabalho trabalho;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, Prova prova01, Prova prova02, Trabalho trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.provas[0] = prova01;
        this.provas[1] = prova02;
        this.trabalho = trabalho;
    }

    public String getNome() {
        return nome;
    }

    // media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
    public double calcularMediaFinalAluno() {
        double media = ((this.provas[0].getNota() * this.provas[0].getPeso()) +
                (this.provas[1].getNota() * this.provas[1].getPeso()) +
                (trabalho.getNota() * trabalho.getPeso())) / (this.provas[0].getPeso()
                + this.provas[1].getPeso() + trabalho.getPeso());

        return media;
    }

    /*
        Considerando a média como 6 e a prova2 como sendo a PROVA FINAL o método retorna a pontuação
        necessária na prova2 para atingir a média
        Utilizei a estrutura de repetição Do While pois era necessário rodar a lógica pelo menos uma vez
     */
    public double calcularNotaMinima() {
        double notaProva01 = this.provas[0].getNota();
        double pesoProva = this.provas[0].getPeso();
        double notaTrabalho = this.trabalho.getNota();
        double pesoTrabalho = this.trabalho.getPeso();
        double notaMinima = 0.00000;
        double media = 6.00000;
        double cont = 0.00000;

        do {
            double notaMinimaTemp = (((notaProva01 * pesoProva) +
                    (cont * pesoProva) +
                    (notaTrabalho * pesoTrabalho)) / (pesoProva
                    + pesoProva + pesoTrabalho)) + 0.178571;
            cont = cont + 0.5;
            notaMinima = notaMinimaTemp;
        } while (notaMinima < media);

        return cont;
    }
}
