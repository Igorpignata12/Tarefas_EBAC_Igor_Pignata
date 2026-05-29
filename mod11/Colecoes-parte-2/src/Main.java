import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        char resp;

        do {
            System.out.print("Digite seu nome: ");
            String nome = scanner.nextLine();
            System.out.print("Digite seu sexo (M/F): ");
            Character sexo = scanner.next().charAt(0);
            pessoa.verificarSexo(nome, sexo);

            System.out.print("Deseja adicionar outra pessoa? (S/N): ");
            resp = scanner.next().charAt(0);
            scanner.nextLine();
        }while (resp == 'S' || resp == 's');
        scanner.close();
        System.out.println("Lista Masculina: " + pessoa.listaMasculino);
        System.out.println("Lista Feminina: " + pessoa.listaFeminino);
    }
}
