package br.com.ipignata;

/**
 * @author Igor Pignata
 */

public class Pessoa {
    private String nome;
    private char sexo;

    public Pessoa (String nome, char sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}