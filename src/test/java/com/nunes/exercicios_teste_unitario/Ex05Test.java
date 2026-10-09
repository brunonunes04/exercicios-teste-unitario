package com.nunes.exercicios_teste_unitario;

import com.nunes.exercicios_teste_unitario.Ex05.CalculadoraImposto;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex05Test {

    @Test
    void deveRetornarCalculoDeImpostoCorreto(){

        //Arrange
        String nome = "Bruno";
        String cpf = "12043359400";
        String uf = "SC";
        double rendaAnual = 3999;

        //Act
        String resultado = CalculadoraImposto.calculaImposto(nome, cpf, uf, rendaAnual);

        //Assert
        assertThat(resultado).isEqualTo("Bruno(de CPF: 12043359400), morador do estado de SC. Você não paga imposto.");
    }
}

