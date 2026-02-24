package br.com.ipignata.testes;

import br.com.ipignata.Pessoa;
import br.com.ipignata.PessoaService;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Igor Pignata
 */

public class TesteFiltroSexoFeminino {
    @Test
    public void testeFiltroSexoFeminino(){
        List<Pessoa> lista = new ArrayList<>();
        lista.add(new Pessoa("Igor", 'M'));
        lista.add(new Pessoa("Sara", 'F'));
        lista.add(new Pessoa("Levi", 'M'));
        lista.add(new Pessoa("Selma", 'F'));

        PessoaService service = new PessoaService();
        List<Pessoa> result = service.filtrarListaFeminina(lista);

        Assert.assertTrue(
                result.stream().allMatch(p -> p.getSexo() == 'F')
        );
    }
}