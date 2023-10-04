package visao;

import java.util.Scanner;

import aplicacao.Robo;

public class Principal {

	public static void main(String[] args) {
        Robo R1 = new Robo(0, 0, 1);
        char[][] sala = new char[20][40];
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 40; j++) {
                    sala[i][j] = ' ';
                }
            }
            sala[R1.linha][R1.coluna] = '1';
            
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 40; j++) {
                    System.out.print(sala[i][j]);
                }
                System.out.println();
            }
            
            R1.mostrarPosicaoAtual();
            
            System.out.println("Escolha uma ação (1 - Andar para Frente, 2 - Andar para Trás, 3 - Andar para Direita, 4 - Andar para Esquerda): ");
            int escolha = scanner.nextInt();
            
            switch (escolha) {
                case 1:
                    R1.andarFrente();
                    break;
                case 2:
                    R1.andarTras();
                    break;
                case 3:
                    R1.andarDireita();
                    break;
                case 4:
                    R1.andarEsquerda();
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }
    }
}