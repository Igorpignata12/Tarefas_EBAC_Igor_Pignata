/**
 * @author Igor Pignata
 */

import java.util.ArrayList;
import java.util.List;

public class Garagem<T extends ICarroDAO> {

    private List<T> carros = new ArrayList<>();

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void listarCarros() {
        for (T carro : carros) {
            carro.acelerar();
        }
    }
}