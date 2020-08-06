package br.com.igordev.dominio;

import br.com.igordev.util.Calculadora;

public class Aluno {
    
    private static int ultimoCodigo = 0;

    private int codigo;
    private String nome;
    private double[] notas;
    private static double notaMinimaAprovacao = 7.0;

    public Aluno() {
        this.codigo = ++ultimoCodigo;
    }

    public Aluno(String nome, double...notas) {
        this();
        this.nome = nome;
        this.notas = notas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public String imprime() {
        String retorno = "Aluno: " + codigo;
        retorno += "\nNome: " + nome.toUpperCase();
        retorno += "\nNotas: ";
        for (double n : notas) {
            retorno += "[" + n + "] ";
        }
        double media = calculaMedia(notas);
        retorno += "\nMédia: " + media; 
        retorno += "\nStatus: ";
        if (ehAprovado(media)) {
            retorno += "Aprovado";
        } else {
            retorno += "Reprovado";
        }
        return retorno;
    }    

    //isolar o alunos para deixar independente da quantidade de notas
    public double calculaMedia(double[] notas) {
       return Calculadora.calculaMedia(notas);
    }

    public boolean ehAprovado(double media) {
        return (media >= notaMinimaAprovacao);
    }
}
