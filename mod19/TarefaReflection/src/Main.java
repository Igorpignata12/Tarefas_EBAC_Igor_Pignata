/**
 * @author Igor Pignata
 */

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Long tabelaValueClass = main.getTabelaValue(usandoTabela.class);
        String tabelaValueName = usandoTabela.class.getAnnotation(Tabela.class).nome();
        System.out.println(tabelaValueName + " tem o valor de: " + tabelaValueClass);
    }

    public Long getTabelaValue(Class<?> clazz) {
        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = clazz.getAnnotation(Tabela.class);
            return tabela.value();
        }
        return null;
    }
}