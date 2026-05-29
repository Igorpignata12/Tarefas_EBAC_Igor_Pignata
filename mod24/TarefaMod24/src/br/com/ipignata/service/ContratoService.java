package br.com.ipignata.service;

import br.com.ipignata.Contrato;
import br.com.ipignata.dao.IContratoDao;

/**
 * @author Igor Pignata
 */

public class ContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    public String salvar() {
        contratoDao.salvar();
        return "Salvo com sucesso!";
    }

    public Long buscar(){
        return 1L;
    }

    public void alterar(Long cpf){
        contratoDao.alterar(cpf);
    }

    public void excluir(Long cpf){
        contratoDao.excluir(cpf);
    }
}