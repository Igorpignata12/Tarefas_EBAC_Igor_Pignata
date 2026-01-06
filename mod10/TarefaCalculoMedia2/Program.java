import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        float n1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota: ");
        float n2 = scanner.nextFloat();

        System.out.print("Digite a terceira nota: ");
        float n3 = scanner.nextFloat();

        System.out.print("Digite a quarta nota: ");
        float n4 = scanner.nextFloat();

        Notas aluno = new Notas(); // cria objeto da outra classe

        float media = aluno.calcularMedia(n1, n2, n3, n4);

        aluno.verificarSituacao(media);

        scanner.close();

    }
}