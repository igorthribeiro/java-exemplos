package br.com.igordev.teste;

import br.com.igordev.dominio.SomaSalario;
import java.text.NumberFormat;

public class TesteSomaSalario {

    public static void main(String[] args) {
        System.out.println("Soma dos salários: " + NumberFormat.getCurrencyInstance().format(SomaSalario.chamaProcedure()));
    }

}
