package br.com.kasolution.dominio;

public class ThreadSoma extends Thread {

    private long total;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < 200; i++) {
                try {
                    sleep(10);
                    total += i;
                } catch (InterruptedException e) {
                    //ignorar
                }
            }
            notify();
        }
    }

    public long getTotal() {
        return total;
    }

}
