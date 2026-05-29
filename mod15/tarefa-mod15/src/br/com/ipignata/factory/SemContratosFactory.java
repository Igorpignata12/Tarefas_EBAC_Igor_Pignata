package br.com.ipignata.factory;

/**
 * @author Igor Pignata
 */

public class SemContratosFactory extends Factory{
    @Override
    Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new HiluxCar(204, "Diesel", "prata");
        } else {
            return null;
        }
    }
}