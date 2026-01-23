package br.com.ipignata;

import br.com.ipignata.dao.ClienteMapDAO;
import br.com.ipignata.dao.ClienteSetDAO;
import br.com.ipignata.dao.IClienteDAO;
import br.com.ipignata.domain.Cliente;

import javax.swing.*;

/**
 * @author Igor Pignata
 */

public class Program {

    private static IClienteDAO iClienteDAO;

    public static void main(String[] args) {

        iClienteDAO = new ClienteMapDAO();
        menu();
    }

    private static boolean isOpcaoCadastro(String opcao) {
        return  (opcao.equals("1"));
    }
    private static boolean isOpcaoConsulta(String opcao) {
        return opcao.equals("2");
    }
    private static boolean isOpcaoExclusao(String opcao) {
        return opcao.equals("3");
    }
    private static boolean isOpcaoAlteracao(String opcao) {
        return opcao.equals("4");
    }
    private static boolean isOpcaoListagem(String opcao) {
        return opcao.equals("5");
    }
    private static boolean isOpcaoSair(String opcao) {
        return (opcao.equals("6"));
    }

    private static boolean isOpcaoValida(String opcao) {
        if (opcao.equals("1") || opcao.equals("2") || opcao.equals("3") || opcao.equals("4") || opcao.equals("5")) {
            return true;
        }
        return false;
    }


    private static void cadastrar(String dados) {
        String[] dadosCliente = dados.split(",",-1);

        // Trata campos vazios
        for (int i = 0; i < dadosCliente.length; i++) {
            if (dadosCliente[i] == null || dadosCliente[i].trim().isEmpty()) {
                dadosCliente[i] = null;
            }
        }
        Cliente cliente = new Cliente(
                dadosCliente[0],
                dadosCliente[1],
                dadosCliente[2],
                dadosCliente[3],
                dadosCliente[4],
                dadosCliente[5],
                dadosCliente[6]
        );

        Boolean cadastrado = iClienteDAO.cadastrar(cliente);
        if (cadastrado) {
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente já cadastrado!", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static void listarTodos() {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : iClienteDAO.buscarTodos()) {
            sb.append(cliente.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Lista de Clientes", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void alterar(String dados) {
        String [] dadosCliente = dados.split(",",-1);
        Cliente cliente = new Cliente(
                dadosCliente[0],
                dadosCliente[1],
                dadosCliente[2],
                dadosCliente[3],
                dadosCliente[4],
                dadosCliente[5],
                dadosCliente[6]
        );
        iClienteDAO.alterar(cliente);
        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!", "Alteração", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void consultar(String dados) {
        Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Consulta", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado!", "Consulta", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    private static void excluir(String dados) {
        iClienteDAO.excluir(Long.parseLong(dados));
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!", "Exclusão", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Programa finalizado!", "Projeto 1 Pop-up", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private static void menu() {

        String opcao = JOptionPane.showInputDialog(
                null,
                "1 - Cadastrar | 2 - Consultar | 3 - Excluir | " +
                        "4 - Alterar | 5 - Listar | 6 - Sair",
                "Projeto 1 Pop-up",
                JOptionPane.INFORMATION_MESSAGE
        );

        if (opcao == null || isOpcaoSair(opcao)) {
            sair();
        }

        while (!isOpcaoValida(opcao)) {
            opcao = JOptionPane.showInputDialog(
                    null,
                    "Opção inválida! Digite novamente:\n" +
                            "1 - Cadastrar | 2 - Consultar | 3 - Excluir | " +
                            "4 - Alterar | 5 - Listar | 6 - Sair",
                    "Projeto 1 Pop-up",
                    JOptionPane.INFORMATION_MESSAGE
            );

            if (opcao == null || isOpcaoSair(opcao)) {
                sair();
            }
        }

        if (isOpcaoCadastro(opcao)) {
            String dados = JOptionPane.showInputDialog(
                    null,
                    "Digite os dados do cliente separados por vírgula\n" +
                            "(nome, cpf, telefone, endereço, número, cidade, estado):",
                    "Cadastro",
                    JOptionPane.INFORMATION_MESSAGE
            );

            if (dados != null) {
                cadastrar(dados);
            }

        } else if (isOpcaoConsulta(opcao)) {
            String dados = JOptionPane.showInputDialog(
                    null,
                    "Digite o cpf do cliente: ",
                    "Consulta",
                    JOptionPane.INFORMATION_MESSAGE
            );

            if (dados != null) {
                consultar(dados);
            }

        } else if (isOpcaoExclusao(opcao)) {
            String dados = JOptionPane.showInputDialog(
                    null,
                    "Digite o cpf do cliente: ",
                    "Exclusão",
                    JOptionPane.INFORMATION_MESSAGE
            );

            if (dados != null) {
                excluir(dados);
            }

        } else if (isOpcaoAlteracao(opcao)) {
            String dados = JOptionPane.showInputDialog(
                    null,
                    "\"Digite os dados do cliente separados por vírgula\\n\" +\n" +
                            "\"(nome, cpf, telefone, endereço, número, cidade, estado):\" ",
                    "Alteração",
                    JOptionPane.INFORMATION_MESSAGE
            );

            if (dados != null) {
                alterar(dados);
            }

        } else if (isOpcaoListagem(opcao)) {
            listarTodos();
        }
        menu();
    }
}
