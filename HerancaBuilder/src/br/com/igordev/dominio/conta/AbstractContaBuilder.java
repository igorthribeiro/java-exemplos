package br.com.igordev.dominio.conta;

public abstract class AbstractContaBuilder<SELF extends ContaBuilder<SELF, TTarget>,
        TTarget extends Conta> implements ContaBuilder<SELF, TTarget> {
    
    protected String numero = "-- sem número --";
    protected Double saldo = 0.0;

    @Override
    public SELF numero(String numero) {
        this.numero = numero;
        return self();
    }

    @Override
    public SELF saldo(Double saldo) {
        this.saldo = saldo;
        return self();
    }

    @Override
    public TTarget build() {
        return internalBuild();
    }
    
    protected abstract TTarget internalBuild();
    
    private SELF self() {
        return (SELF) this;
    }

}
