package aplicacao;

public class CalculadoraMelhorada extends Calculadora{
    private String memoria;

    public CalculadoraMelhorada() {
        super();
        memoria = "";
    }

    private double potencia() {
        return Math.pow(super.getOperadorUm(), super.getOperadorDois());
    }

    @Override
    public double calcular(char operador, double operando1, double operando2) {
        this.memoria = "Potência";
        return potencia();
    }

    public String verUltimaOperacao() {
        return memoria;
    }
}

