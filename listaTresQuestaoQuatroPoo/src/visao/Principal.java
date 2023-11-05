package visao;

import aplicacao.Fornecedor;
import aplicacao.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", "Rua A", "123-456-7890");
        Fornecedor fornecedor = new Fornecedor("Fornecedor A", "Rua B", "987-654-3210", 5000.0f, 2000.0f);

        // Testando os métodos de Pessoa
        System.out.println("Nome da Pessoa: " + pessoa.getNome());
        System.out.println("Endereço da Pessoa: " + pessoa.getEndereco());
        System.out.println("Telefone da Pessoa: " + pessoa.getTelefone());

        // Testando os métodos de Fornecedor
        System.out.println("Nome do Fornecedor: " + fornecedor.getNome());
        System.out.println("Endereço do Fornecedor: " + fornecedor.getEndereco());
        System.out.println("Telefone do Fornecedor: " + fornecedor.getTelefone());
        System.out.println("Valor de Crédito do Fornecedor: " + fornecedor.getValorCredito());
        System.out.println("Valor da Dívida do Fornecedor: " + fornecedor.getValorDivida());
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());
    }
}