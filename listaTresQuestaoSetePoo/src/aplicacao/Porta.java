package aplicacao;

public class Porta {
    private boolean aberta;
    private String cor;
    private float dimensaoX;
    private float dimensaoY;
    private float dimensaoZ;

    public void abrir(){
        aberta=true;
    }

    public void fechar(){
        aberta=false;
    }
    public void pintar(String cor){
        this.cor=cor;
    }
    public boolean estaAberta(){
        return aberta;
    }

    public float getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(float dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public float getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(float dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public float getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(float dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
}
