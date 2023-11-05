package aplicacao.itens;

import aplicacao.ItemColecionavel;

public class Revista extends ItemColecionavel {

    private int anoPublicacao;
    private int volume;
    private String editora;

    public Revista(int identificacaoUnica, String titulo, String dataAquisicao, int anoPublicacao, int volume, String editora){
        super(identificacaoUnica, titulo, dataAquisicao);
        this.anoPublicacao=anoPublicacao;
        this.volume=volume;
        this.editora=editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
