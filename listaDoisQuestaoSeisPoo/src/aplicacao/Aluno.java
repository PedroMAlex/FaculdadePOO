package aplicacao;

import java.util.ArrayList;

public class Aluno {
    private int matricula;
    private String nome;
    private float notaProvaUm;
    private float notaProvaDois;
    private float notaTrabalho;

    public Aluno(int matricula, String nome, float notaProvaUm, float notaProvaDois, float notaTrabalho){
        this.matricula=matricula;
        this.nome=nome;
        this.notaProvaUm=notaProvaUm;
        this.notaProvaDois=notaProvaDois;
        this.notaTrabalho=notaTrabalho;
    }

    public float media(){
        return (float) ((notaProvaUm * 2.5) + (notaProvaDois * 2.5) + (notaTrabalho * 2) / 3);
    }

    public float pontosRestantesAprovacao(){
        int i;
        if(media()<5){
            for(i=0;media()<5;i++){}
            return i;
        }else{
            return 0;
        }
    }
    public String toString(){
        return "Média: " + media() + "Pontos restantes para a aprovação: " + pontosRestantesAprovacao();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNotaProvaUm() {
        return notaProvaUm;
    }

    public void setNotaProvaUm(float notaProvaUm) {
        this.notaProvaUm = notaProvaUm;
    }

    public float getNotaProvaDois() {
        return notaProvaDois;
    }

    public void setNotaProvaDois(float notaProvaDois) {
        this.notaProvaDois = notaProvaDois;
    }

    public float getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }
}
