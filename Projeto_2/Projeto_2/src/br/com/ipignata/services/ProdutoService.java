package br.com.ipignata.services;

import br.com.ipignata.dao.IProdutoDAO;
import br.com.ipignata.domain.Produto;
import br.com.ipignata.services.generics.GenericService;

/**
 * @author Igor Pignata
 */

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}