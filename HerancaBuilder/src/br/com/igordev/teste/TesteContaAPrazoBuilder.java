package br.com.igordev.teste;

import br.com.igordev.dominio.Prazo;
import br.com.igordev.dominio.conta.ContaAPrazo;
import br.com.igordev.dominio.conta.ContaAPrazoBuilder;

public class TesteContaAPrazoBuilder {

    public static void main(String[] args) {
        ContaAPrazo cap = new ContaAPrazoBuilder()
                .dataMaturidade(Prazo.SEIS_MESES)
                .saldo(1000.0)
                .numero("1234-5")
                .build();
        System.out.println(cap);
    }

}
