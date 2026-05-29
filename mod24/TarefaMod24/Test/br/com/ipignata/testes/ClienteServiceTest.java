package br.com.ipignata.testes;

import br.com.ipignata.dao.ClienteDao;
import br.com.ipignata.dao.ClienteDaoMock;
import br.com.ipignata.dao.IClienteDao;
import br.com.ipignata.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Igor Pignata
 */

public class ClienteServiceTest {
    @Test
    public void salvarTest(){
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String result = service.salvar();
        Assert.assertEquals("Sucesso!", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void eperadoErroNoSalvarTest(){
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String result = service.salvar();
        Assert.assertEquals("Sucesso!", result);
    }
}