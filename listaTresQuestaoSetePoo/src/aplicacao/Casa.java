package aplicacao;

public class Casa {
    private String cor;
    private Porta portaUm;
    private Porta portaDois;
    private Porta portaTres;

    public Porta getPortaUm() {
        return portaUm;
    }

    public void setPortaUm(Porta portaUm) {
        this.portaUm = portaUm;
    }

    public Porta getPortaDois() {
        return portaDois;
    }

    public void setPortaDois(Porta portaDois) {
        this.portaDois = portaDois;
    }

    public Porta getPortaTres() {
        return portaTres;
    }

    public void setPortaTres(Porta portaTres) {
        this.portaTres = portaTres;
    }

    public void pintar(String cor){

    }

    public int quantasPortasEstaoAbertas(){
        int portas=0;
         if(getPortaUm().estaAberta()){
             portas++;
             if (getPortaDois().estaAberta()){
                 portas++;
                 if(getPortaTres().estaAberta()){
                     portas++;
                 }
             }
         }
         return portas;
    }

    public int totalDePortas(){
        return 0;

    }
}

