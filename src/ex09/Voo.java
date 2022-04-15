package ex09;

import java.time.LocalDate;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 09 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Voo {

    private String numero;
    private LocalDate localDate;
    private String assentos[][] = new String[10][10];
    private int capacidadeMaxima;

    public Voo(){}

    // Construtor para instanciar o objeto Voo. Os assentos utilizei vetor bidimensional
    public Voo(String numero, String localDate) {
        this.capacidadeMaxima = 100;
        this.numero = numero;
        try {
            this.localDate = LocalDate.parse(localDate);
        } catch (RuntimeException e) {
            System.out.println("Data Inválida");
        }
    }
    // Recupera o primeiro assento disponível
    public void proximoAssentoLivre() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (assentos[i][j] == null) {
                    System.out.println("Próximo assento livre - FILA: " + (i + 1) + " - POLTRONA: " + (j + 1));
                    break;
                }
                break;
            }
            break;
        }
    }
    // Retorna TRUE caso assento disponível, caso constrário FALSE
    public boolean verificarDisponibilidadeAssento(int fila, int poltrona) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (assentos[fila - 1][poltrona - 1] == null) {
                    System.out.println("ASSENTO DISPONÍVEL");
                    return true;
                }
            }
        }
        System.out.println("ASSENTO INDISPONÍVEL");
        return false;
    }
    //
    public void ocuparAssento(int fila, int poltrona) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (assentos[fila - 1][poltrona - 1] == null) {
                    assentos[fila - 1][poltrona - 1] = "X";
                }
            }
        }
    }

    public int getQtdeAssentosDisponiveis() {
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (assentos[i][j] == null) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public void layout() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + assentos[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String getVoo() {
        return numero;
    }
}
