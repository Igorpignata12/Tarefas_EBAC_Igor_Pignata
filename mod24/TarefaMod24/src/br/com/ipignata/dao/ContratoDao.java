package br.com.ipignata.dao;

import br.com.ipignata.Contrato;

/**
 * @author Igor Pignata
 */

public class ContratoDao implements IContratoDao {
    @Override
    public void salvar() {
    throw new UnsupportedOperationException("Não funciona com o banco!");
    }

    @Override
    public Long buscar(Long cpf) {
        return null;
    }

    @Override
    public void alterar(Long cpf) {

    }


    @Override
    public void excluir(Long cpf) {

    }
}