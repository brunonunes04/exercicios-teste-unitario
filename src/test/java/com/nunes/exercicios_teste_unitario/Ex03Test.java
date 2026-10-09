package com.nunes.exercicios_teste_unitario;

import com.nunes.exercicios_teste_unitario.Ex03.Pessoa;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Ex03Test {

    @Test
    void deveRetornarNomeStarWars(){

        //Arrange
        String nome = "Bruno";
        String sobrenome = "Nunes";
        String nomeSolteiraMae = "Booz";
        String cidadeNatal = "Blumenau";

        //Act
        String resultado = Pessoa.starWarsNome(nome, sobrenome, nomeSolteiraMae, cidadeNatal);

        //Assert
        assertThat(resultado).isEqualTo("NunBr BoBlu");
    }
}
