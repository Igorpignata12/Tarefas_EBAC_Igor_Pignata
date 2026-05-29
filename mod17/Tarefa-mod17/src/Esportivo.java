/**
 * @author Igor Pignata
 */

public class Esportivo implements ICarroDAO {

    private String modelo;

    public Esportivo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("Esportivo " + modelo + " acelerando rápido");
    }
}