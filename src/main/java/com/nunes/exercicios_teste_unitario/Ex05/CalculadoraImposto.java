package com.nunes.exercicios_teste_unitario.Ex05;

public class CalculadoraImposto {
    String nome;
    String cpf;
    String uf;
    double rendaAnual;


    public static String calculaImposto (String nome, String cpf, String uf, double rendaAnual){
        if(rendaAnual > 0 && rendaAnual <= 4000){
            return nome + "(de CPF: " + cpf + "), morador do estado de " + uf + ". Você não paga imposto.";
        }else if(rendaAnual >= 4001 && rendaAnual <= 9000){
            return nome + "(de CPF: " + cpf + "), morador do estado de " + uf + ". Você paga 5,8% de alíquota sob sua renda anual: R$" + (rendaAnual * 0.058);
        }else if(rendaAnual >= 9001 && rendaAnual <= 25000) {
            return nome + "(de CPF: " + cpf + "), morador do estado de " + uf + ". Você paga 15% de alíquota sob sua renda anual: R$" + (rendaAnual * 0.15);
        }else if(rendaAnual >= 25001 && rendaAnual <= 30000) {
            return nome + "(de CPF: " + cpf + "), morador do estado de " + uf + ". Você paga 27,5% de alíquota sob sua renda anual: R$" + (rendaAnual * 0.275);
        }else if(rendaAnual > 35000) {
            return nome + "(de CPF: " + cpf + "), morador do estado de " + uf + ". Você paga 30% de alíquota sob sua renda anual: R$" + (rendaAnual * 0.30);
        }else{
            throw new IllegalArgumentException("Valor inserido não aceito");
        }
    }
}
