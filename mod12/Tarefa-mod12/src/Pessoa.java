import java.util.Set;
import java.util.TreeSet;

public class Pessoa {
    Set<String> listaMasculino = new TreeSet<>();
    Set<String> listaFeminino = new TreeSet<>();

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
