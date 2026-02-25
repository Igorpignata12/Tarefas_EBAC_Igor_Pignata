package br.com.ipignata.service;

import br.com.ipignata.dao.ClienteDao;
import br.com.ipignata.dao.IClienteDao;

/**
 * @author Igor Pignata
 */

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao){
       this.clienteDao = clienteDao;
    }

    public String salvar(){
        clienteDao.salvar();
        return "Sucesso!";
    }

}