package br.com.igordev.dominio.conta;

public class ContaCorrenteBuilder extends AbstractContaBuilder<ContaCorrenteBuilder, ContaCorrente> {
    
    private Double limiteEspecial = 0.0;

    public ContaCorrenteBuilder limiteEspecial(Double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
        return this;
    }

    @Override
    protected ContaCorrente internalBuild() {
        return new ContaCorrente(this.numero, this.saldo, this.limiteEspecial);
    }   

}
