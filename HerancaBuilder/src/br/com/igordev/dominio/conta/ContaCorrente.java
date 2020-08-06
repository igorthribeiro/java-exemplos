package br.com.igordev.dominio.conta;

import java.text.NumberFormat;

public class ContaCorrente extends Conta {
    
    private Double limiteEspecial;

    protected ContaCorrente(String numero, double saldo, Double limiteEspecial) {
        super(numero, saldo);
        this.limiteEspecial = limiteEspecial;
    }

    public Double getLimiteEspecial() {
        return limiteEspecial;
    }

    @Override
    public void saca(double valor) {
        if (valor > 0 && (saldo + limiteEspecial > valor)) {
            saldo -= valor;
        } else {
            throw new RuntimeException("Valor indisponível para saque!");
        }
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\n+ {Limite Especial: ")
                .append(
                        NumberFormat.getCurrencyInstance()
                                .format(limiteEspecial)
                )
                .append("}")
                .toString();
    }
}
