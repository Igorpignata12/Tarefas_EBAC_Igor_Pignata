package br.com.ipignata.dao;

import br.com.ipignata.dao.generics.IGenericDAO;
import br.com.ipignata.domain.Venda;
import br.com.ipignata.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author Igor Pignata
 */

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}