package com.nunes.exercicios_teste_unitario;

import com.nunes.exercicios_teste_unitario.Ex04.Atleta;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex04Test {

    @Test
    void deveRetornarCategoriaConformeIdade(){

        //Arrange
        int idade = 43;

        //Act
        String resultado = Atleta.metodoCategoria(idade);


        //Assert
        assertThat(resultado).isEqualTo("Categoria Adulto");
    }

    @Test
    void deveRetornarDefinicaoDeImcCorreta(){

        //Arrange
        double massa = 60.35;
        double altura = 1.81;

        //Act
        String resultado = Atleta.metodoImc(massa, altura);

        //Assert
        assertThat(resultado).isEqualTo("Magreza");
    }

}
