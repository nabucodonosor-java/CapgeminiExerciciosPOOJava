package ex05;

// Subclasse de Avaliação. Classe altera valor do peso no construtor
public class Prova extends Avaliacao {

    public Prova(double nota){
        super(nota);
        super.setPeso(2.5);
    }
}
