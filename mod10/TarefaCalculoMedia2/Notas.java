public class Notas {

    public float calcularMedia(float n1, float n2, float n3, float n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }

    public void verificarSituacao(float media) {
        if (media > 7) {
            System.out.println("Aprovado! Média: " + media);
        } else if (media > 5) {
            System.out.println("Recuperação! Média: " + media);
        } else {
            System.out.println("Reprovado! Média: " + media);
        }
    }
}