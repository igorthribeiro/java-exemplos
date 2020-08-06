package br.com.igordev.teste;

import br.com.igordev.dominio.conta.Conta;
import br.com.igordev.dominio.conta.ContaAPrazoBuilder;
import br.com.igordev.dominio.conta.ContaCorrenteBuilder;
import br.com.igordev.dominio.conta.ContaPoupancaAPrazoBuilder;
import java.util.ArrayList;
import java.util.List;

public class TesteGeralContas {

    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        
        contas.add(new ContaCorrenteBuilder().build());
        contas.add(new ContaAPrazoBuilder().build());
        contas.add(new ContaPoupancaAPrazoBuilder().build());
        
        contas.forEach(System.out::println);
    }

}
