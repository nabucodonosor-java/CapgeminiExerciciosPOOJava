package ex05;

// Subclasse de Avaliação. Classe altera valor do peso no construtor
public class Trabalho extends Avaliacao {

    public Trabalho(double nota){
        super(nota);
        super.setPeso(2.0);
    }
}
