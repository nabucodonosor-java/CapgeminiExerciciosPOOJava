package ex13;

public class MainCalc {

    public static void main(String[] args) {
        System.out.println("******************CALCULADORA******************************");
        Calculadora c1 = new Calculadora();
        c1.somar(1, 3.5);
        c1.subtrair(5, 4.8);
        c1.multiplicar(8, 9);
        c1.dividir(8, 4);
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println();
        System.out.println("******************CIENTÍFICA******************************");
        CalculadoraCientifica c2 = new CalculadoraCientifica();
        c2.somar(1, 3.5);
        c2.subtrair(5, 4.8);
        c2.multiplicar(8, 9);
        c2.dividir(8, 4);
        c2.raizQuadrada(81);
        c2.potenciacao(4, 2);

    }
}
