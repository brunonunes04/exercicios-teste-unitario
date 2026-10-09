package com.nunes.exercicios_teste_unitario;

import com.nunes.exercicios_teste_unitario.Ex01.Ex01;
import com.nunes.exercicios_teste_unitario.Ex02.Ex02;
import com.nunes.exercicios_teste_unitario.Ex03.Pessoa;
import com.nunes.exercicios_teste_unitario.Ex04.Atleta;
import com.nunes.exercicios_teste_unitario.Ex05.CalculadoraImposto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex01Test {

    @Test
    void deveRetornarTipoDoNumeroInserido() {

        double num = 1;

        boolean resultado = Ex01.parImpar(num);

        assertThat(resultado).isEqualTo(false);
    }
}
