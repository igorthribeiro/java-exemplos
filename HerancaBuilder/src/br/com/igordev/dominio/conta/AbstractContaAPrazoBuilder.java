package br.com.igordev.dominio.conta;

import br.com.igordev.dominio.Prazo;
import java.time.LocalDate;


public abstract class AbstractContaAPrazoBuilder<SELF extends AbstractContaBuilder<SELF, TTarget>, TTarget extends ContaAPrazo>
        extends AbstractContaBuilder<SELF, TTarget> {
    
    protected LocalDate dataMaturidade =  LocalDate.now().plusMonths(6);

    public SELF dataMaturidade(Prazo prazo) {
        this.dataMaturidade = LocalDate.now().plusMonths(prazo.getMeses());
        return self();
    }
    
    public LocalDate getDataMaturidade() {
        return dataMaturidade;
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
