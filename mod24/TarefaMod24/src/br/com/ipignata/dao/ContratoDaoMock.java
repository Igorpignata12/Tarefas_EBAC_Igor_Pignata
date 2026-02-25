package br.com.ipignata.dao;

import br.com.ipignata.Contrato;

/**
 * @author Igor Pignata
 */

public class ContratoDaoMock implements IContratoDao{

    public boolean alterarFoiChamado = false;
    public boolean exlcuirFoiChamado = false;

    @Override
    public void salvar() {

    }

    @Override
    public Long buscar(Long cpf) {
        return null;
    }

    @Override
    public void alterar(Long cpf) {
        alterarFoiChamado = true;
    }

    @Override
    public void excluir(Long cpf) {
        exlcuirFoiChamado = true;
    }
}