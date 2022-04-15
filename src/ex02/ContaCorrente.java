package ex02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Franco Sobrinho
 * @apiNote Exercício 02 - Lógica de Programação com Java - ProgramaStart da Capgemini
 * @since 2022
 */
public class ContaCorrente {

    private int numeroConta;
    private String nomeCorrentista;
    private Double saldo;

    public ContaCorrente(){}

    public ContaCorrente(int numeroConta, String nomeCorrentista, Double saldo){
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        if (saldo == null) {
            this.saldo = 0.0;
        } else {
            this.saldo = saldo;
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void alterarNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public void sacar(double valor) {
        if (valor < 1) {
            System.out.println("Saque deve ser maior que 0");
        } else {
            if (valor > this.saldo) {
                System.out.println("SALDO INSUFICIENTE");
            } else {
                this.saldo -= valor;
            }
        }
    }

    public void depositar(double valor, ContaCorrente contaDestino) {
        if (valor < 1) {
            System.out.println("Depósito deve ser maior que 0");
        } else {
            if (valor > this.saldo) {
                System.out.println("SALDO INSUFICIENTE");
            } else {
                this.saldo -= valor;
                contaDestino.setSaldo(contaDestino.getSaldo() + valor);
            }
        }
    }

    @Override
    public String toString() {
        return "Correntista: " + nomeCorrentista + " - Número da Conta: " + numeroConta + " - Saldo: R$" + String.format("%.2f", saldo);
    }
}
