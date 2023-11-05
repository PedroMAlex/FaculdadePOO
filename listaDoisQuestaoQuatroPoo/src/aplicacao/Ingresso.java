package aplicacao;

public class Ingresso {
   private int codigoIngresso=0;
   private String cpfCliente;
   private String nomeFilme;
   private int numeroPoltrona;
   private int valorIngresso;

    public int getCodigoIngresso() {
        return codigoIngresso;
    }

    public void setCodigoIngresso(int codigoIngresso) {
        this.codigoIngresso = codigoIngresso;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public int getNumeroPoltrona() {
        return numeroPoltrona;
    }

    public void setNumeroPoltrona(int numeroPoltrona) {
        this.numeroPoltrona = numeroPoltrona;
    }

    public int getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(int valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}

