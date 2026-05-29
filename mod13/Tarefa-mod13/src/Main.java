public class Main {
    public static void main (String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Empresa X");
        pj.setTelefone("1234-5678");
        pj.setCnpj("12.345.678/0001-99");
        imprimir(pj);

        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Igor Pignata");
        pf.setTelefone("9876-5432");
        pf.setCpf("123.456.789-00");
        imprimir(pf);
    }
    public static void imprimir(Pessoa pessoa) {
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());

        if (pessoa instanceof PessoaJuridica) {
            PessoaJuridica pj = (PessoaJuridica) pessoa;
            System.out.println("CNPJ: " + pj.getCnpj());
        } else if (pessoa instanceof PessoaFisica) {
            PessoaFisica pf = (PessoaFisica) pessoa;
            System.out.println("CPF: " + pf.getCpf());
        }
    }
}

