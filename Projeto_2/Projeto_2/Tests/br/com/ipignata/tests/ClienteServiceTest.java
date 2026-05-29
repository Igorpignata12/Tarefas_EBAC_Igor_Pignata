package br.com.ipignata.tests;

import br.com.ipignata.exceptions.TipoChaveNaoEncontradaException;
import br.com.ipignata.tests.dao.ClienteDaoMock;
import br.com.ipignata.dao.IClienteDAO;
import br.com.ipignata.domain.Cliente;
import br.com.ipignata.services.ClienteService;
import br.com.ipignata.services.IClienteService;
import br.com.ipignata.tests.dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Igor Pignata
 */

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);

    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Rodrigo Pires");
        clienteService.alterar(cliente);

        Assert.assertEquals("Rodrigo Pires", cliente.getNome());
    }
}