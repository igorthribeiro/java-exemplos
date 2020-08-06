package br.com.igordev.teste;

import br.com.igordev.dominio.conta.ContaCorrente;
import br.com.igordev.dominio.conta.ContaCorrenteBuilder;

public class TesteContaCorrenteBuilder {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrenteBuilder()
                .saldo(1000.00)
                .numero("1234-6")
                .limiteEspecial(5000.00)
                .build();
        System.out.println(cc);
    }

}
