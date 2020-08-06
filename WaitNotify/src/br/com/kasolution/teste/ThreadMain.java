package br.com.kasolution.teste;

import br.com.kasolution.dominio.ThreadSoma;

public class ThreadMain {

    public static void main(String[] args) {
        ThreadSoma ts = new ThreadSoma();
        ts.start();
        
        synchronized (ts) {
            try {
                System.out.println("Aguardando a soma acabar.... ");
                ts.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Total da soma: " + ts.getTotal());
        }
    }
}
