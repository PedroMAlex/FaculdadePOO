package aplicacao;

import java.util.ArrayList;

public class Voo extends Data {
    private int numeroVoo = 0;
    private int cadeira=0;
    private boolean cadeiraOcupada = false;
    ArrayList<Integer> cadeirasOcupadas = new ArrayList<Integer>();

    private int auxi= 100;
    private int numeroCadeira;
    float horario;

    public Voo() {
        super();
    }

    public Data getData() {
        return new Data(getDia(), getMes(), getAno());
    }

    public Voo getVoo(float horario, Data data) {
        return new Voo(horario, data);
    }

    public Voo(float horario, Data data){
        super(data.getDia(), data.getMes(), data.getAno());
        numeroVoo++;
        this.horario=horario;
    }

    public int proximoLivre(){
        return cadeirasOcupadas.size()+1;
    }

    public boolean cadeiraOcupada(int numeroCadeira ){
        for(int i=0;i<cadeirasOcupadas.size();i++){
            if(numeroCadeira==cadeirasOcupadas.get(i)){
                cadeiraOcupada=true;
            }
        }
        if(cadeiraOcupada){
            return true;
        }else{
            return false;
        }
    }
    public boolean ocupar(int numeroCadeira){
        for(int i=0;i<cadeirasOcupadas.size();i++){
            if(numeroCadeira==cadeirasOcupadas.get(i)){
                cadeiraOcupada=true;
            }
        }
        if(!cadeiraOcupada){
            cadeirasOcupadas.add(numeroCadeira);
            auxi = auxi-1;
            return !cadeiraOcupada;
        }else{
            return cadeiraOcupada;
        }
    }

    public Object clone(){
        Voo vooClone = new Voo(horario,getData());
        return vooClone;
    }

    public int numeroCadeirasLivres() {
        return auxi;

    }
}
