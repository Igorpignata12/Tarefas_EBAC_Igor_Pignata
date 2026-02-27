package br.com.ipignata.domain;

import br.com.ipignata.anotacao.TipoChave;
import br.com.ipignata.dao.Persistente;

import java.math.BigDecimal;

/**
 * @author Igor Pignata
 */

public class Produto implements Persistente {

    @TipoChave("getCodigo")
    private String codigo;

    private String nome;

    private String descricao;

    private BigDecimal valor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

}