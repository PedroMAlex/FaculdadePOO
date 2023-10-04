package aplicacao;

import java.util.Scanner;

public class Robo {
    public int linha;
    public int coluna;
    private int passo;
    
    public Robo(int linha, int coluna, int passo) {
        this.linha = linha;
        this.coluna = coluna;
        this.passo = passo;
    }
    
    public void andarFrente() {
        linha += passo; // Corrigido para mover para a frente
        if (linha >= 20) {
            linha = 19;
        }
    }
    
    public void andarTras() {
        linha -= passo;
        if (linha < 0) {
            linha = 0;
        }
    }
    
    public void andarDireita() {
        coluna += passo;
        if (coluna >= 40) {
            coluna = 39;
        }
    }
    
    public void andarEsquerda() {
        coluna -= passo;
        if (coluna < 0) {
            coluna = 0;
        }
    }
    
    public void mostrarPosicaoAtual() {
        System.out.println("Posição atual do robô: Linha " + linha + ", Coluna " + coluna);
    }
}