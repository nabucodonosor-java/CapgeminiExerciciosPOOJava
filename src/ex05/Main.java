package ex05;

public class Main {

    public static void main(String[] args) {

        // Cenário aluno APROVADO antes da prova final (prova2)
        Prova p1LordeSidius = new Prova(3.0);
        Prova p2LordeSidius = new Prova(0.0);
        Trabalho t1LordeSidius = new Trabalho(7.0);

        Aluno lordeSidius = new Aluno("m-01", "Lorde Sidius", p1LordeSidius, p2LordeSidius,
                t1LordeSidius);

        System.out.println("MÉDIA DO ALUNO " + lordeSidius.getNome() + " - " + String.format("%.2f", lordeSidius.calcularMediaFinalAluno()));

        System.out.println("NOTA MÍNIMA PARA ALCANÇAR MÉDIA: " + String.format("%.2f", lordeSidius.calcularNotaMinima()));

    }
}
