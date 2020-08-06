package br.com.igordev.dominio.conta;

public class ContaPoupancaAPrazoBuilder extends AbstractContaAPrazoBuilder<ContaPoupancaAPrazoBuilder, ContaPoupancaAPrazo> {
    
    private Double depositoInicial = 0.0;
    
    public ContaPoupancaAPrazoBuilder depositoInicial(Double depositoInicial) {
        this.depositoInicial = depositoInicial;
        return this;
    }

    @Override
    protected ContaPoupancaAPrazo internalBuild() {
        return new ContaPoupancaAPrazo(this.numero, this.saldo, this.dataMaturidade, this.depositoInicial);
    }


}
