package aplicacao;

public class ItemColecionavel {
    private int identificacaoUnica;
    private String titulo;
    private String dataAquisicao;

    public ItemColecionavel(int identificacaoUnica, String titulo, String dataAquisicao){
        this.identificacaoUnica=identificacaoUnica;
        this.titulo=titulo;
        this.dataAquisicao=dataAquisicao;
    }

    public int getIdentificacaoUnica() {
        return identificacaoUnica;
    }

    public void setIdentificacaoUnica(int identificacaoUnica) {
        this.identificacaoUnica = identificacaoUnica;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }
}

