package aplicacao;

import java.util.Objects;

public class Calculadora {
    private char operador;
    private double operadorUm;
    private double operadorDois;

    public char getOperador() {
        return operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public double getOperadorUm() {
        return operadorUm;
    }

    public void setOperadorUm(double operadorUm) {
        this.operadorUm = operadorUm;
    }

    public double getOperadorDois() {
        return operadorDois;
    }

    public void setOperadorDois(double operadorDois) {
        this.operadorDois = operadorDois;
    }

    public Calculadora(){
        operador= ' ';
        operadorUm=0;
        operadorDois=0;
    }

    private double soma(){
        return operadorUm + operadorDois;
    }

    private double subtracao(){
        return operadorUm - operadorDois;
    }

    private double divisao(){
        return operadorUm / operadorDois;
    }

    private double multiplicacao(){
        return operadorUm * operadorDois;
    }

    public double calcular(char operador, double operando1, double operando2){
        this.operador = operador;
        this.operadorUm = operando1;
        this.operadorDois = operando2;

        switch (operador) {
            case '+':
                return soma();
            case '-':
                return subtracao();
            case '*':
                return multiplicacao();
            case '/':
                return divisao();
            default:
                System.out.println("Operador inválido.");
                return 0;
        }

    }

}
