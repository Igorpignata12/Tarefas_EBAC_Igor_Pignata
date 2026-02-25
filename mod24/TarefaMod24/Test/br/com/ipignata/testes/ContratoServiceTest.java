package br.com.ipignata.testes;

import br.com.ipignata.dao.ContratoDao;
import br.com.ipignata.dao.ContratoDaoMock;
import br.com.ipignata.dao.IContratoDao;
import br.com.ipignata.service.ContratoService;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author Igor Pignata
 */

public class ContratoServiceTest {
    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        String result = service.salvar();
        Assert.assertEquals("Salvo com sucesso!", result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        String result = service.salvar();
        Assert.assertEquals("Salvo com sucesso!", result);
    }

    @Test
    public void buscarTest(){
        IContratoDao dao = new ContratoDao();
        ContratoService service = new ContratoService(dao);
        Long result = service.buscar();
        Assert.assertEquals(Long.valueOf(1), result);
    }

    @Test
    public void alterarTest(){
        ContratoDaoMock dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        service.alterar(1l);
        Assert.assertTrue(dao.alterarFoiChamado);
    }

    @Test
    public void excluirTest(){
        ContratoDaoMock dao = new ContratoDaoMock();
        ContratoService service = new ContratoService(dao);
        service.excluir(1l);
        Assert.assertTrue(dao.exlcuirFoiChamado);
    }



}