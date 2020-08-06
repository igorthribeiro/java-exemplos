package br.com.igordev.util;

public class Calculadora {
    
    //exemplos de sobrecarga
    public static double calculaMedia(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4)/4;
    }
    
    public static double calculaMedia(double n1, double n2, double n3, double n4, double n5) {
        return (n1 + n2 + n3 + n4 + n5)/5;
    }
    
    public static double calculaMedia (double...notas) {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma/notas.length;
    }
    
    public static int calculaMedia(int[] notas) {
        int soma = 0;
        for (int n : notas) {
            soma += n;
        }
        return soma/notas.length;
    }
    
    public static String calculaMedia(String[] notas) {
        int soma = 0;
        for (String s : notas) {
            double n = Double.parseDouble(s);
            soma += n;
        }
        return String.valueOf(soma/notas.length);
    }
    

}
