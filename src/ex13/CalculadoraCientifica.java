package ex13;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 13 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica(){
        super();
    }

    public void raizQuadrada(double num) {
        double res = Math.sqrt(num);
        System.out.println("OPERAÇÃO ESCOLHIDA -> RAIZ QUADRADA");
        System.out.println("Raiz quadrada de " + String.format("%.2f", num) + " = " + String.format("%.2f", res));
        System.out.println("-----------------------------------");
    }

    public void potenciacao(double num, int potencia) {
        double res = Math.pow(potencia, num);
        System.out.println("OPERAÇÃO ESCOLHIDA -> POTENCIAÇÃO");
        System.out.println(String.format("%.2f", num) + " elevado a " + potencia + " = " + String.format("%.2f", res));
        System.out.println("-----------------------------------");
    }
}
