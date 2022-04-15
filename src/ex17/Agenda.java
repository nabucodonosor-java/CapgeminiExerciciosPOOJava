package ex17;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 16 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Agenda {

    List<Compromisso> compromissos = new ArrayList<>();

    public void adicionarCompromisso(Compromisso compromisso) {
        this.compromissos.add(compromisso);
    }

    public void removerCompromissoPorIndice(int index) {
        if (this.compromissos.isEmpty()) {
            System.out.println("AGENDA VAZIA");
        } else {
            this.compromissos.remove(index);
        }
    }

    public void listarCompromissoPorParticipante(Participante participante) {

        for (int i = 0; i < this.compromissos.size(); i++) {
            if (this.compromissos.get(i).getParticipantes().contains(participante)) {
                System.out.println(this.compromissos.get(i));
            }
        }
    }

    public void listarCompromissoPorData(String dataHora) {
        LocalDateTime dataTemp = LocalDateTime.parse(dataHora);
        for (Compromisso c : this.compromissos) {
            if (c.getDataHora().isEqual(dataTemp)) {
                System.out.println(c);
            }
        }
    }

    public void imprimirTodaAgenda() {

        for (Compromisso c : this.compromissos) {
            System.out.println(c);
        }
    }
}
