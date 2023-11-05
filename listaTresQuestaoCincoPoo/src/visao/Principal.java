package visao;

import aplicacao.itens.CD;
import aplicacao.itens.DVD;
import aplicacao.itens.Livro;
import aplicacao.itens.Revista;

import java.util.Scanner;

public class Principal {
    private Scanner scanner;

    public Principal() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("Sistema de Catalogação de Itens Colecionáveis");
        System.out.println("1. Cadastrar Livro");
        System.out.println("2. Cadastrar CD");
        System.out.println("3. Cadastrar DVD");
        System.out.println("4. Cadastrar Revista");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    public Livro coletarDadosLivro() {
        System.out.print("Identificação Única: ");
        int identificacaoUnica = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Data de Aquisição: ");
        String dataAquisicao = scanner.nextLine();

        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        System.out.print("Ano de Publicação: ");
        int anoPublicacao = scanner.nextInt();

        return new Livro(identificacaoUnica, titulo, dataAquisicao, editora, anoPublicacao);
    }

    public CD coletarDadosCD() {
        System.out.print("Identificação Única: ");
        int identificacaoUnica = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Data de Aquisição: ");
        String dataAquisicao = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        return new CD(identificacaoUnica, titulo, dataAquisicao, genero);
    }

    public DVD coletarDadosDVD() {
        System.out.print("Identificação Única: ");
        int identificacaoUnica = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Data de Aquisição: ");
        String dataAquisicao = scanner.nextLine();

        System.out.print("Tipo (musical, filme, dados): ");
        String tipo = scanner.nextLine();

        return new DVD(identificacaoUnica, titulo, dataAquisicao, tipo);
    }

    public Revista coletarDadosRevista() {
        System.out.print("Identificação Única: ");
        int identificacaoUnica = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Data de Aquisição: ");
        String dataAquisicao = scanner.nextLine();

        System.out.print("Ano de Publicação: ");
        int anoPublicacao = scanner.nextInt();

        System.out.print("Volume: ");
        int volume = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Editora: ");
        String editora = scanner.nextLine();

        return new Revista(identificacaoUnica, titulo, dataAquisicao, anoPublicacao, volume, editora);
    }
    public void fechar() {
        scanner.close();
    }
}

