package br.com.ipignata;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Igor Pignata
 */

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Pessoa> listaPessoas = new ArrayList<>();


        System.out.print("Digite seu nome e em seguida o sexo separado por - e para adicionar mais pessoas separe por , : ");
        String resp = scanner.nextLine();
        String[] pessoas = resp.split(",");

        for(String p : pessoas){

            String[] arrayNomeSexo = p.trim().split("-");
            if(arrayNomeSexo.length == 2) {
                String nome = arrayNomeSexo[0].trim();
                char sexo = arrayNomeSexo[1].trim().toUpperCase().charAt(0);

                listaPessoas.add(new Pessoa(nome, sexo));
            }else {
                System.out.println("Formato inválido: " + p);
            }
        }
        scanner.close();

        System.out.println("\nLista completa de pessoas:");
        listaPessoas.forEach(System.out::println);
        System.out.println("\n***************");
        System.out.println("***************");
        System.out.println("\nLista de pessoas do sexo feminino: ");

        PessoaService service = new PessoaService();
        List<Pessoa> listaFeminina = service.filtrarListaFeminina(listaPessoas);
        listaFeminina.forEach(System.out::println);

    }
}