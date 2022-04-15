package ex03;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 03 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class BombaCombustivel {

    private char tipoCombustivel;
    private double valorPorLitro;
    private double qtdeCombustivel;

    public BombaCombustivel(){}

    public BombaCombustivel(char tipoCombustivel, double valorPorLitro, double qtdeCombustivel){
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.qtdeCombustivel = qtdeCombustivel;
    }
    // altera o valor do litro do combustível.
    public void alterarValorLitro(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }
    // altera o tipo do combustível
    public void alterarCombustivel(char tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    //altera a quantidade de combustível restante na bomba.
    public void alterarQtdeCombustivelRestanteBomba(double qtdeCombustivel) {
        this.qtdeCombustivel = qtdeCombustivel;
    }

    /* método onde é informado o valor a ser abastecido e mostra a quantidade de litros
                    que foi colocada no veículo
                */
    public void abastecerPorValor(double valor){
        double litros = valor / this.valorPorLitro;
        if (litros > this.qtdeCombustivel) {
            System.out.println("Saldo de combustível na bomba insuficiente!");
            System.out.println("Qtde combustível na bomba: " + String.format("%.2f", this.qtdeCombustivel) + "L" + " X "
            + "Qtde litros do abastecimento: " + String.format("%.2f", litros) + "L");
        } else {
            this.qtdeCombustivel -= litros;
            imprimir(valor, litros);
        }
    }

    // método onde é informado a quantidade em litros de combustível e mostra valor a ser pago pelo cliente
    public void abastecerPorLitro(double litros) {
        double valor = litros * this.valorPorLitro;
        if (litros > this.qtdeCombustivel || litros <= 0.0) {
            System.out.println("Saldo de combustível na bomba insuficiente!");
            System.out.println("Qtde combustível na bomba: " + String.format("%.2f", this.qtdeCombustivel) + "L" + " X "
                    + "Qtde litros do abastecimento: " + String.format("%.2f", litros) + "L");
        } else {
            this.qtdeCombustivel -= litros;
            imprimir(valor, litros);
        }
    }

    private void imprimir(double valor, double litros) {
        char opcao = this.tipoCombustivel;
        switch (opcao) {
            case 'E':
                System.out.println("Tipo de Combustível: ETANOL");
                break;
            case 'G':
                System.out.println("Tipo de Combustível: GASOLINA");
                break;
            case 'D':
                System.out.println("Tipo de Combustível: DIESEL");
                break;
            default:
                System.out.println("Tipo de Combustível não identificado!");
        }

        System.out.println("Valor do abastecimento: R$" + String.format("%.2f", valor));
        System.out.println("Total de litros abastecidos: " + String.format("%.2f", litros) + "L");
        System.out.println("Total de litros restante na bomba: " + String.format("%.2f", this.qtdeCombustivel) + "L");
        System.out.println();
        System.out.println();
    }
}
