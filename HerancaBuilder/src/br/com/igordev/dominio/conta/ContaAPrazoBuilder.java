package br.com.igordev.dominio.conta;

public class ContaAPrazoBuilder extends AbstractContaAPrazoBuilder<ContaAPrazoBuilder, ContaAPrazo> {

    @Override
    protected ContaAPrazo internalBuild() {
        return new ContaAPrazo(this.numero, this.saldo, this.dataMaturidade);
    }

}
