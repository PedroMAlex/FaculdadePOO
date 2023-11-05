package visao;

import aplicacao.Data;
import aplicacao.Voo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Voo voo = new Voo();
        Data data = new Data();
        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("---VOO---");
            System.out.println("1- ocupar cadeira");
            System.out.println("2- numero de vagas disponíveis");
            System.out.println("3- próxima cadeira livre");
            System.out.println("4- Veriicar se a cadeira está ocupada");

            switch (teclado.nextInt()){
                case 1:
                    System.out.println("Digite o número da cadeira que deseja ocupar: ");
                    voo.ocupar(teclado.nextInt());
                    break;
                case 2:
                    System.out.println("Número de vagas disponíveis: " + voo.numeroCadeirasLivres());
                    break;
                case 3:
                    System.out.println("Próxima cadeira livre: " + voo.proximoLivre());
                    break;
                case 4:
                    System.out.println("Digite o número da cadeira que deseja saber se está ocupada: ");
                    System.out.println(voo.cadeiraOcupada(teclado.nextInt()));
                    break;
            }

        } while(true);
    }
}