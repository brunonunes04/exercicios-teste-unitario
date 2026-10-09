package com.nunes.exercicios_teste_unitario.Ex04;

import java.util.Scanner;

public class Atleta {
    String nome;
    int idade;
    double altura;
    double peso;

    public static String metodoCategoria(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Categoria Pré-Mirim";
        } else if (idade >= 8 && idade <= 10) {
            return "Categoria Mirim";
        } else if (idade >= 11 && idade <= 13) {
            return "Categoria Infantil";
        } else if (idade >= 14 && idade <= 17) {
            return "Categoria Infanto-juvenil";
        } else if (idade >= 18 && idade <= 20) {
            return "Categoria Juvenil";
        } else if (idade >= 21) {
            return "Categoria Adulto";
        } else {
            throw new IllegalArgumentException("Idade não permitida.");
        }
    }

    public static String metodoImc(double massa, double altura) {
        double imc = massa / (altura * altura);

        if (imc < 18.5) {
            return "Magreza";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Saudável";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade Grau II (severa)";
        } else if (imc >= 40) {
            return "Obesidade Grau III (mórbida)";
        } else {
            throw new IllegalArgumentException("valor não permitido.");
        }
    }
}
