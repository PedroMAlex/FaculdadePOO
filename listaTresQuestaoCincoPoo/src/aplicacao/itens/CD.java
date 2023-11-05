package aplicacao.itens;

import aplicacao.ItemColecionavel;

public class CD extends ItemColecionavel {
    private String genero;

    public CD(int identificacaoUnica, String titulo, String dataAquisicao, String genero){
        super(identificacaoUnica, titulo, dataAquisicao);
        this.genero=genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
