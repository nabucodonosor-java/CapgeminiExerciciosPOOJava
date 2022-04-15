package ex03;

public class Main {

    public static void main(String[] args) {

        BombaCombustivel bombaEtanol = new BombaCombustivel('E', 4.59, 100.0);
        BombaCombustivel bombaGasolina = new BombaCombustivel('G', 6.49, 100.0);
        BombaCombustivel bombaDiesel = new BombaCombustivel('D', 2.59, 100.0);

        bombaEtanol.abastecerPorValor(10.0);
        bombaEtanol.abastecerPorLitro(10.0);
        bombaEtanol.abastecerPorLitro(100.0);

        bombaGasolina.alterarCombustivel('E');
        bombaGasolina.alterarValorLitro(6.49);
        bombaGasolina.alterarQtdeCombustivelRestanteBomba(200.0);

        bombaGasolina.abastecerPorLitro(5.0);
    }
}
