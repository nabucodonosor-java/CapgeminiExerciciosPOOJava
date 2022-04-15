package ex13;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 13 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Calculadora {

    private double num1;
    private double num2;
    private int operacao;

    public Calculadora(){}

    public void somar(double num1, double num2) {
        System.out.println("OPERAÇÃO ESCOLHIDA -> SOMA");
        System.out.println(String.format("%.2f", num1) + " + " + String.format("%.2f", num2) + " = "
                + String.format("%.2f", num1 + num2));
        System.out.println("-----------------------------------");
    }

    public void subtrair(double num1, double num2) {
        System.out.println("OPERAÇÃO ESCOLHIDA -> SUBTRAÇÃO");
        System.out.println(String.format("%.2f", num1) + " - " + String.format("%.2f", num2) + " = "
                + String.format("%.2f", num1 - num2));
        System.out.println("-----------------------------------");
    }

    public void multiplicar(double num1, double num2) {
        System.out.println("OPERAÇÃO ESCOLHIDA -> MULTIPLICAÇÃO");
        System.out.println(String.format("%.2f", num1) + " x " + String.format("%.2f", num2) + " = "
                + String.format("%.2f", num1 * num2));
        System.out.println("-----------------------------------");
    }

    public void dividir(double num1, double num2) {
        System.out.println("OPERAÇÃO ESCOLHIDA -> DIVISÃO");
        System.out.println(String.format("%.2f", num1) + " / " + String.format("%.2f", num2) + " = "
                + String.format("%.2f", num1 / num2));
        System.out.println("-----------------------------------");
    }
}
