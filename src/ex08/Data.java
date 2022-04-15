package ex08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


/**
 * @author Franco Sobrinho
 * @apiNote Exercício 08 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Data {

    private LocalDate localDate;

    // Construtor gera automaticmante data padrão
    public Data() {
        this.localDate = LocalDate.parse("0001-01-01");
    }

    /* Construtor tenta converter String para LocalDate e caso tenha erro de conversão de data
    é setado a data padrão e msg Data Inválida é impressa no console
    */
    public Data(String localDate) {
        try {
            this.localDate = LocalDate.parse(localDate);
        } catch (RuntimeException e) {
            this.localDate = LocalDate.parse("0001-01-01");
            System.out.println("Data Inválida");
        }
    }

    // Construtor que recebe por parâmetro uma data clonada
    public Data(LocalDate localDate) {
        this.localDate = localDate;
    }

    public void compararDataComDataAtual() {
        LocalDate hoje = LocalDate.now();
        long dif = ChronoUnit.DAYS.between(this.localDate, hoje);
        if (dif == 0) {
            System.out.println("Data do objeto é HOJE");
        } else if (dif > 0) {
            System.out.println("Data do objeto é " + dif + " dias anterior a HOJE");
        } else {
            System.out.println("Data do objeto é " + (dif * -1L) + " dias posterior a HOJE");
        }
    }

    public String getDia() {
        String diaAtual = String.valueOf(this.localDate.getDayOfMonth());
        return diaAtual;
    }

    public String getMes() {
        String mesAtual = String.valueOf(this.localDate.getMonthValue());
        return mesAtual;
    }

    public String getMesExtenso() {
        String mesAtualPorExtenso = String.valueOf(this.localDate.getMonth());
        return mesAtualPorExtenso;
    }

    public String getAno() {
        String anoAtual = String.valueOf(this.localDate.getYear());
        return anoAtual;
    }

    public boolean isBissexto() {
        // Método da classe LocalDate - Retorna TRUE caso ano seja bissexto, caso contrário FALSE
        if (this.localDate.isLeapYear()) {
            return true;
        } else {
            return false;
        }
    }

    public Data clonarData() {
        Data dataClonada = new Data(localDate);
        return dataClonada;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = this.localDate.format(formatter);
        return dataFormatada;
    }
}
