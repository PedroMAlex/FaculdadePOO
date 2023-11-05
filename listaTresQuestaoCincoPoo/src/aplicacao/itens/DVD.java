package aplicacao.itens;

import aplicacao.ItemColecionavel;

public class DVD extends ItemColecionavel {
    private String tipo;

    public DVD(int identificacaoUnica, String titulo, String dataAquisicao, String tipo){
        super(identificacaoUnica, titulo, dataAquisicao);
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
