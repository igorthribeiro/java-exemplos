package br.com.igordev.teste;

import br.com.igordev.dominio.Prazo;
import br.com.igordev.dominio.conta.ContaPoupancaAPrazo;
import br.com.igordev.dominio.conta.ContaPoupancaAPrazoBuilder;

public class TesteContaPoupancaAPrazoBuilder {

    public static void main(String[] args) {
        ContaPoupancaAPrazo cpap = new ContaPoupancaAPrazoBuilder()
                .depositoInicial(12_000.00)
                .dataMaturidade(Prazo.DOZE_MESES)
                .numero("1234-7")
                .saldo(7_000.00)
                .build();
        System.out.println(cpap);        
    }
}
