package com.nunes.exercicios_teste_unitario.Ex03;

public class Pessoa {
    String nome;
    String sobrenome;
    String nomeSolteiraMae;
    String cidadeNatal;

    public Pessoa(String nome, String sobrenome, String nomeSolteiraMae, String cidadeNatal) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeSolteiraMae = nomeSolteiraMae;
        this.cidadeNatal = cidadeNatal;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    public String getNomeSolteiraMae() {
        return nomeSolteiraMae;
    }

    public void setNomeSolteiraMae(String nomeSolteiraMae) {
        this.nomeSolteiraMae = nomeSolteiraMae;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static String starWarsNome(String nome, String sobrenome,
                                      String nomeSolteiraMae, String cidadeNatal) {

        String primeiroNome = sobrenome.substring(0, 3)
                + nome.substring(0, 2);

        String sobrenomeSw = nomeSolteiraMae.substring(0, 2)
                + cidadeNatal.substring(0, 3);

        return primeiroNome + " " + sobrenomeSw;
    }
    public static void main(String[] args) {
        System.out.println(Pessoa.starWarsNome("Bruno", "Nunes", "Booz", "Blumenau"));
    }
}

