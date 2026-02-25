package br.com.ipignata.dao;

import br.com.ipignata.Contrato;

/**
 * @author Igor Pignata
 */

public interface IContratoDao {
   public void salvar();
   public Long buscar(Long cpf);
   public void alterar(Long cpf);
   public void excluir(Long cpf);
}