package com.nunes.exercicios_teste_unitario;

import com.nunes.exercicios_teste_unitario.Ex01.Ex01;
import com.nunes.exercicios_teste_unitario.Ex02.Ex02;
import com.nunes.exercicios_teste_unitario.Ex03.Pessoa;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ExerciciosTest {

    @Test
    void deveRetornarTipoDoNumeroInserido(){

        double num = 1;

        boolean resultado = Ex01.parImpar(num);

        assertThat(resultado).isEqualTo(false);
    }

    @Test
    void deveRetornarEstacao(){

        String resultado = Ex02.estacao(1);

        assertThat(resultado).isEqualTo("É verão e o tempo está quente.");
    }

    @Test
    void deveRetornarNomeStarWars(){
        String resultado = Pessoa.starWarsNome("Bruno", "Nunes", "Booz", "Blumenau");

        assertThat(resultado).isEqualTo("NunBr BoBlu");
    }
}
