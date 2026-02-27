package br.com.ipignata.dao;

import br.com.ipignata.dao.generics.GenericDAO;
import br.com.ipignata.domain.Produto;

/**
 * @author Igor Pignata
 */

public class ProdutoDAO extends GenericDAO<Produto, String> implements IProdutoDAO {


    @Override
    public Class<Produto> getTipoClasse() {
        return null;
    }

    @Override
    public void atualizarDados(Produto entity, Produto entityCadastrado) {

    }

    @Override
    public void atualizarDados(Persistente entity, Persistente entityCadastrado) {

    }
}