package br.com.igordev.dominio.conta;

import java.text.NumberFormat;

public abstract class Conta {

    private static int ultimoCodigo;

    private int codigo;
    private String numero;
    protected Double saldo;

    protected Conta(String numero, Double saldo) {
        this.codigo = ++ultimoCodigo;
        this.numero = numero;
        this.saldo = saldo;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new RuntimeException("O valor não pode ser negativo!");
        }
    }
    
    public abstract void saca(double valor);

    @Override
    public String toString() {
        return new StringBuilder("\n")
                .append(getClass().getSimpleName())
                .append(" {Código: ").append(codigo)
                .append(", Número: ").append(numero)
                .append(", Saldo: ").append(NumberFormat.getCurrencyInstance().format(saldo))
                .append("}")
                .toString();
    }
}
