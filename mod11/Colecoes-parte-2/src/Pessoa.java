import java.util.HashSet;
import java.util.Set;

public class Pessoa {
    Set<String> listaMasculino = new HashSet<>();
    Set<String> listaFeminino = new HashSet<>();

    public void verificarSexo(String nome, Character sexo) {
        if (sexo == 'M' || sexo == 'm') {
            listaMasculino.add(nome);
        } else if (sexo == 'F' || sexo == 'f') {
            listaFeminino.add(nome);
        } else {
            System.out.println("Sexo inválido. Por favor, digite 'M' para Masculino ou 'F' para Feminino.");
        }
    }
}
