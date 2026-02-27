package br.com.ipignata.dao;

import br.com.ipignata.dao.generics.GenericDAO;
import br.com.ipignata.domain.Cliente;

/**
 * @author Igor Pignata
 */

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {


    @Override
    public Class<Cliente> getTipoClasse() {
        return null;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrado) {

    }

    @Override
    public void atualizarDados(Persistente entity, Persistente entityCadastrado) {

    }
}