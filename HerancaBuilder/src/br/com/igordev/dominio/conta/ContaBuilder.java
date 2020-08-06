/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.igordev.dominio.conta;

import br.com.igordev.dominio.conta.Conta;

/**
 *
 * @author igordev
 */
public interface ContaBuilder<SELF extends ContaBuilder<SELF, TTarget>,
        TTarget extends Conta> {
    
    SELF numero(String numero);
    SELF saldo(Double saldo);
    TTarget build();
    
}
