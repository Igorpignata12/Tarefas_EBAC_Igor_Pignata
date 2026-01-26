package br.com.ipignata.factory;

/**
 * @author Igor Pignata
 */

public class ContratosFactory extends Factory {
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new AstraCar(140, "gasolina", "preto");
        } else {
            return null;
        }
    }
}