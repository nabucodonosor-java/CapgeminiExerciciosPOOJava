package ex05;

// Superclasse de Prova e Trabalho. Esta classe é abstrata para evitar que seja instanciada.
public abstract class Avaliacao {

    private double nota;
    private double peso;

    public Avaliacao(double nota) {
        this.nota = nota;
        this.peso = peso;
    }

    public double getNota() {
        return nota;
    }

    public double getPeso() {
        return peso;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
