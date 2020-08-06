package br.com.igordev.dominio.conta;

import br.com.igordev.dominio.conta.Conta;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContaAPrazo extends Conta {

    private LocalDate dataMaturidade;

    protected ContaAPrazo(String numero, double saldo, LocalDate dataMaturidade) {
        super(numero, saldo);
        this.dataMaturidade = dataMaturidade;
    }

    public LocalDate getDataMaturidade() {
        return dataMaturidade;
    }

    @Override
    public String toString() {
        return new StringBuilder(super.toString())
                .append("\n+ {Dt. Maturidade: ")
                .append(
                        DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE")
                                .format(dataMaturidade)
                ).append("}").toString();
    }

    @Override
    public void saca(double valor) {
        if (valor > 0 && LocalDate.now().isAfter(dataMaturidade)) {
            super.saldo -= valor;
        } else {
            throw new RuntimeException("Verifique o valor do saque e a data de maturidade!");
        }
    }
}
