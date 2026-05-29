/**
 * @author Igor Pignata
 */

public class Suv implements ICarroDAO {

    private String modelo;

    public Suv(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("SUV " + modelo + " acelerando com força");
    }
}