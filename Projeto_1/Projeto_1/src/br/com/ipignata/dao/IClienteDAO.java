package br.com.ipignata.dao;

import br.com.ipignata.domain.Cliente;

import java.util.Collection;

/**
 * @author Igor Pignata
 */

public interface IClienteDAO {

    public boolean cadastrar(Cliente cliente);

    public void excluir(Long cpf);

    public void alterar(Cliente cliente);

    public Cliente consultar(Long cpf);

    public Collection<Cliente> buscarTodos();
}