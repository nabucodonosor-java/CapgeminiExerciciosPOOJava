package ex10;

public class Main {

    public static void main(String[] args) {
        System.out.println("**********************ADRIANO IMPERADOR**********************");
        Jogador j1 = new Jogador("Adriano", "Atacante", "1970-04-15",
                "Brasileira", 1.88, 94.0);

        System.out.println("O jogador " + j1.getNome() + " tem " + j1.calcularIdade() + " anos");
        j1.tempoRestanteParaAposentar();
        System.out.println("**************************************************************");

        System.out.println("************************PAOLO MALDINI*************************");
        Jogador j2 = new Jogador("Paolo Maldini", "Defensor", "1968-06-26",
                "Italiana", 1.86, 90.0);
        System.out.println("O jogador " + j2.getNome() + " tem " + j2.calcularIdade() + " anos");
        j2.tempoRestanteParaAposentar();
        System.out.println("**************************************************************");

        System.out.println("*****************************ZICO*****************************");
        Jogador j3 = new Jogador("Zico", "Meio-Campo", "1953-03-03",
                "Brasileira", 1.72, 75.0);

        System.out.println("O jogador " + j3.getNome() + " tem " + j3.calcularIdade() + " anos");
        j3.tempoRestanteParaAposentar();
        System.out.println("**************************************************************");

        System.out.println("***********************BRUNO HENRIQUE*************************");
        Jogador j4 = new Jogador("Brunho Henrique", "Atacante", "1990-12-30",
                "Brasileira", 1.84, 80.0);

        System.out.println("O jogador " + j4.getNome() + " tem " + j4.calcularIdade() + " anos");
        j4.tempoRestanteParaAposentar();
        System.out.println("**************************************************************");

        System.out.println("************************DAVID LUIZ****************************");
        Jogador j5 = new Jogador("David Luiz", "Defensor", "1993-05-30",
                "Brasileira", 1.89, 87.0);

        System.out.println("O jogador " + j5.getNome() + " tem " + j5.calcularIdade() + " anos");
        j5.tempoRestanteParaAposentar();
        System.out.println("**************************************************************");
        System.out.println("************************ARRASCAETA****************************");
        Jogador j6 = new Jogador("De Arrascaeta", "Meio-Campo", "1996-08-07",
                "Uruguaia", 1.75, 72.0);

        System.out.println("O jogador " + j6.getNome() + " tem " + j6.calcularIdade() + " anos");
        j6.tempoRestanteParaAposentar();
        System.out.println("**************************************************************");
    }
}
