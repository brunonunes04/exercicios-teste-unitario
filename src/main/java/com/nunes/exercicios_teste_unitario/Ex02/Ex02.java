package com.nunes.exercicios_teste_unitario.Ex02;

public class Ex02 {
    public static String estacao(int num) {

        if (num == 1) {
            return "É verão e o tempo está quente.";
        } else if (num == 2) {
            return "É outono e o tempo está ameno.";
        } else if (num == 3) {
            return "É inverno e está frio.";
        } else if (num == 4) {
            return "É primavera e o tempo está agradável.";
        } else {
            throw new IllegalArgumentException("Número deve estar entre 1 e 4.");
        }
    }
}
