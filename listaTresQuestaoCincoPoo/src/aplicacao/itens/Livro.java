package aplicacao.itens;

import aplicacao.ItemColecionavel;

public class Livro extends ItemColecionavel {
    private String editora;
    private int anoPublicacao;

    public Livro(int identificacaoUnica, String titulo, String dataAquisicao, String editora, int anoPublicacao){
        super(identificacaoUnica, titulo, dataAquisicao);
        this.editora=editora;
        this.anoPublicacao=anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
