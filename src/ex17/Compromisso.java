package ex17;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 16 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 * @implNote Utilizei a coleção Set para evitar repetição na lista de participantes
 */
public class Compromisso implements Comparable<Compromisso> {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime dataHora;
    private TipoCompromisso tipoCompromisso;
    private String titulo;
    private String descricao;

    private Set<Participante> participantes = new HashSet<>();

    public Compromisso(String dataHora, TipoCompromisso tipoCompromisso, String titulo, String descricao) {
        this.dataHora = LocalDateTime.parse(dataHora);
        this.tipoCompromisso = tipoCompromisso;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void atualizarCompromisso(String dataHora, TipoCompromisso tipoCompromisso,
                                     String titulo, String descricao) {
        this.dataHora = LocalDateTime.parse(dataHora);
        this.tipoCompromisso = tipoCompromisso;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // add participante
    public void adicionarParticipante(Participante participante) {
        this.participantes.add(participante);
    }

    // Método compareTo ordenada os compromissos por Data - mais VELHA para mais NOVA
    @Override
    public int compareTo(Compromisso compromisso) {
        return this.dataHora.compareTo(compromisso.getDataHora());
    }

    @Override
    public String toString() {
        return "Compromisso: " + titulo + ", Tipo: " + String.valueOf(this.tipoCompromisso) +
                ", Data e Hora: " + dataHora.format(formatter) + "\n" +
                "Participantes: " + participantes;
    }
}
