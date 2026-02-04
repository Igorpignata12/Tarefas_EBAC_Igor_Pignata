/**
 * @author Igor Pignata
 */

public class Sedan implements ICarroDAO {

    private String modelo;

    public Sedan(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("Sedan " + modelo + " acelerando suavemente");
    }
}