/**
 * @author Igor Pignata
 */

public class Main {

    public static void main(String[] args) {

        Garagem<ICarroDAO> garagem = new Garagem<>();

        garagem.adicionarCarro(new Sedan("Civic"));
        garagem.adicionarCarro(new Suv("Compass"));
        garagem.adicionarCarro(new Esportivo("Ferrari"));

        garagem.listarCarros();
    }
}