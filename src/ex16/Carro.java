package ex16;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 16 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class Carro {

    private String nome;
    private double capacidaMaxTanque;
    private double qtdeCombustivelTanque;
    private double consumoPorKM;
    private double distanciaPercorrida;

    public Carro(String nome) {
        this.nome = nome;
        capacidaMaxTanque = 50;
        consumoPorKM = 15;
        qtdeCombustivelTanque = 0;
        distanciaPercorrida = 0;
    }

    public void abastecer(double qtde) {
        double combustivelAtualMaisAbastecimento = this.qtdeCombustivelTanque + qtde;
        if (combustivelAtualMaisAbastecimento > this.capacidaMaxTanque) {
            double dif = combustivelAtualMaisAbastecimento - this.capacidaMaxTanque;
            System.out.println("CAPACIDADE DO TANQUE EXCEDIDA em " + String.format("%.2f", dif) + " Litro(s)");
            System.out.println("FORAM ABASTECIDOS " + String.format("%.2f", (combustivelAtualMaisAbastecimento - dif)) + " Litro(s)");
            this.qtdeCombustivelTanque = 50.0;
        } else {
            System.out.println("FORAM ABASTECIDOS " + String.format("%.2f", qtde) + " Litro(s)");
            this.qtdeCombustivelTanque = combustivelAtualMaisAbastecimento;
        }
    }

    public void mover(double km) {
        double consumoCombustivel = (km * 1) / 15;
        if (consumoCombustivel > this.qtdeCombustivelTanque) {
            System.out.println("COMBUSTÍVEL INSUFICIENTE!");
        } else {
            this.distanciaPercorrida += km;
            this.qtdeCombustivelTanque -= consumoCombustivel;
        }
    }

    @Override
    public String toString() {
        return "Carro: " + nome + ", Qtde de combustivel no tanque: " + String.format("%.2f", qtdeCombustivelTanque) +
                " litros, Quilometragem: " + distanciaPercorrida + "Km";
    }
}
