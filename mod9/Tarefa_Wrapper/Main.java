package Tarefa_Wrapper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        Integer num = (Integer) numero;

        System.out.println("Você digitou: " + num);

        scanner.close();
    }
}