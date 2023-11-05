package visao;

import aplicacao.Calculadora;
import aplicacao.CalculadoraMelhorada;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        CalculadoraMelhorada calculadoraMelhorada = new CalculadoraMelhorada();

        System.out.println("Calculadora Simples e Calculadora Melhorada");
        System.out.print("Digite o operador (+, -, *, /, ^): ");
        char operador = scanner.next().charAt(0);
        System.out.print("Digite o primeiro operando: ");
        double operando1 = scanner.nextDouble();
        System.out.print("Digite o segundo operando: ");
        double operando2 = scanner.nextDouble();

        double resultado1 = calculadora.calcular(operador, operando1, operando2);
        double resultado2 = calculadoraMelhorada.calcular(operador, operando1, operando2);

        System.out.println("Resultado da Calculadora: " + resultado1);
        System.out.println("Última operação da Calculadora Melhorada: " + calculadoraMelhorada.verUltimaOperacao());
        System.out.println("Resultado da Calculadora Melhorada: " + resultado2);

        scanner.close();
    }
}

