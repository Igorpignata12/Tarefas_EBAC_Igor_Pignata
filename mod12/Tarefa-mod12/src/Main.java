import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Parte 1
        System.out.println("--- Parte 1 ---");
        Scanner s = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.print("Digite os nomes separados por , : ");
        String resposta = s.nextLine();
        String[] nomesArray = resposta.split(",");

        for (String nome : nomesArray) {
            nomes.add(nome.trim());
        }
        Collections.sort(nomes);

        System.out.println("Nomes em ordem alfabética: " + nomes);


        //Parte 2
        System.out.println("--- Parte 2 ---");
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        char r;

        do {
            System.out.print("Digite seu nome e em seguida o sexo separado por - : ");
            String resp = scanner.nextLine();
            String[] arrayNomeSexo = resp.split("-");
            String nome = arrayNomeSexo[0].trim();
            Character sexo = arrayNomeSexo[1].trim().charAt(0);
            pessoa.verificarSexo(nome, sexo);

            System.out.print("Deseja adicionar outra pessoa? (S/N): ");
            r = scanner.next().charAt(0);
            scanner.nextLine();
        }while (r == 'S' || r == 's');
        s.close();
        scanner.close();
        System.out.println("Lista Masculina: " + pessoa.listaMasculino);
        System.out.println("Lista Feminina: " + pessoa.listaFeminino);
    }
}
