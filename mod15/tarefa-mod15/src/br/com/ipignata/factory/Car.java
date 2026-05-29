package br.com.ipignata.factory;

/**
 * @author Igor Pignata
 */

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println(getClass().getSimpleName());
        System.out.println("O " + fuelSource + " foi colocado no carro, e está pronto para ser usado, possui " + horsePower +" cavalos de força" );
    }
    public void clean(){
        System.out.println("O carro foi lavado, e a cor " + color.toLowerCase() + " brilha!");
    }
    public void mechanicCheck(){
        System.out.println("O carro foi checado no mecânico. Tudo está funcionando perfeitamente!");
    }
    public void fuelCar(){
        System.out.println("O tanque do carro foi enchido com " + fuelSource.toLowerCase());
    }
}