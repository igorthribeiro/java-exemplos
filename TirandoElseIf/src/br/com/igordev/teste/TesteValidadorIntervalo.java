package br.com.igordev.teste;

import br.com.igordev.dominio.Intervalo;
import java.util.Arrays;
import java.util.List;

public class TesteValidadorIntervalo {

    static List<Integer> numeros = Arrays.asList(45, 35, 25, 15);
    static List<Intervalo> intervalos = Arrays.asList(Intervalo.values());

    public static void main(String[] args) {
        
        numeros.forEach(n -> System.out.println(
                intervalos.parallelStream()
                    .filter(i -> i.noIntervalo(n))
                    .findFirst().get())
        );
    }

}
