package br.com.ipignata;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Igor Pignata
 */

public class PessoaService {

    public List<Pessoa> filtrarListaFeminina(List<Pessoa> lista){
        return lista.stream()
                .filter(p -> p.getSexo() == 'F')
                .collect(Collectors.toList());
    }
}