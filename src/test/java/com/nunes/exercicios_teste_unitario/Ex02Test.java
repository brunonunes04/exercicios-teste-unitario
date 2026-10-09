package com.nunes.exercicios_teste_unitario;

import com.nunes.exercicios_teste_unitario.Ex02.Ex02;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex02Test {

    @Test
    void deveRetornarEstacao(){

        //Arrange
        int estacao = 1;

        //Act
        String resultado = Ex02.estacao(estacao);

        //Assert
        assertThat(resultado).isEqualTo("É verão e o tempo está quente.");
    }
}
