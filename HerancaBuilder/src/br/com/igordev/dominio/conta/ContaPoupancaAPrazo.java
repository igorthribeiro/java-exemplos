package br.com.igordev.dominio.conta;

import java.text.NumberFormat;
import java.time.LocalDate;

public class ContaPoupancaAPrazo extends ContaAPrazo {
    
    private Double depositoInicial;
    
    protected ContaPoupancaAPrazo(String numero, double saldo, LocalDate dataMaturidade, Double depositoInicial) {
        super(numero, saldo, dataMaturidade);
        this.depositoInicial = depositoInicial;
    }
    
    public Double getDepositoInicial() {
        return depositoInicial;
    }
    
    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\n+ {Depósito inicial: ")
                .append(
                        NumberFormat.getCurrencyInstance()
                                .format(depositoInicial)
                )
                .append("}")
                .toString();
    }
    
}
