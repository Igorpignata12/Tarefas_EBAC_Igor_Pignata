package br.com.ipignata.dao;

import br.com.ipignata.dao.generics.GenericDAO;
import br.com.ipignata.domain.Venda;
import br.com.ipignata.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Igor Pignata
 */

public class VendaDAO extends GenericDAO<Venda, String> implements IVendaDAO {


    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Class<Venda> getTipoClasse() {
        return null;
    }

    @Override
    public void atualizarDados(Venda entity, Venda entityCadastrado) {

    }

    @Override
    public void atualizarDados(Persistente entity, Persistente entityCadastrado) {

    }
}