package br.com.igordev.dominio;

public enum Intervalo {
    
    A(10, 19, "Intervalo A"),
    B(20, 29, "Intervalo B"),
    C(30, 39, "Intervalo C"),
    D(40, 49, "Intervalo D");
    
    private int min;
    private int max;
    private String mensagem;

    Intervalo(int min, int max, String mensagem) {
        this.min = min;
        this.max = max;
        this.mensagem = mensagem;
    }
    
    public boolean noIntervalo(Integer valor) {
        return valor >= min && valor <= max;
    }

    @Override
    public String toString() {
        return mensagem;
    }
}
