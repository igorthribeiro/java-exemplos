package br.com.igordev.teste;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import static java.text.NumberFormat.*;

public enum EnumComAbstract {

    SOM("Adição") {
        @Override
        BigDecimal calcula(BigDecimal... vals) {
            BigDecimal total = vals[0];
            for (int i = 1; i < vals.length; i++) {
                total = total.add(vals[i]);
            }
            return total;
        }
    },
    SUB("Subtração") {
        @Override
        BigDecimal calcula(BigDecimal... vals) {
            BigDecimal total = vals[0];
            for (int i = 1; i < vals.length; i++) {
                total = total.subtract(vals[i]);
            }
            return total;
        }
    },
    MUL("Multiplicação") {
        @Override
        BigDecimal calcula(BigDecimal... vals) {
            BigDecimal total = vals[0];
            for (int i = 1; i < vals.length; i++) {
                total = total.multiply(vals[i]);
            }
            return total;
        }
    },
    DIV("Divisão") {
        @Override
        BigDecimal calcula(BigDecimal... vals) {
            BigDecimal total = vals[0];
            for (int i = 1; i < vals.length; i++) {
                total = total.divide(vals[i]);
            }
            return total;
        }
    };

    private String operacao;

    EnumComAbstract(String operacao) {
        this.operacao = operacao;
    }

    abstract BigDecimal calcula(BigDecimal... vals);

    public String getOperacao() {
        return operacao;
    }

    public static void main(String... args) {
        BigDecimal[] vals = {
            new BigDecimal(60),
            new BigDecimal(40),
            new BigDecimal(10)
        };
        List<EnumComAbstract> funcoes = Arrays.asList(EnumComAbstract.values());

        funcoes.forEach(f -> System.out.printf("%s: %s\n", f.getOperacao(),
                getNumberInstance().format(f.calcula(vals))));
    }

}//fim enum
