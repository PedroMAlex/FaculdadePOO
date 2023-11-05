package visao;

import aplicacao.Casa;
import aplicacao.Edificio;
import aplicacao.Porta;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        String stringAuxi;
        Float floatAuxi;
        Porta porta = new Porta();
        ArrayList<Porta> portas = new ArrayList<>();
        Casa casa = new Casa();
        Edificio edificio = new Edificio();

        Scanner teclado = new Scanner(System.in);

        do{
            System.out.println("-----");
            System.out.println("1-Porta");
            System.out.println("2-Casa");
            System.out.println("2-Edificio");

            switch (teclado.nextInt()){
                case 1:
                System.out.println("---Porta---");
                System.out.println("-----------");
                System.out.println("1---Abrir---");
                System.out.println("2---Fechar---");
                System.out.println("3---Pintar---");
                System.out.println("4---Alterar Dimensão X---");
                System.out.println("5---Alterar Dimensão Y---");
                System.out.println("6---Alterar Dimensão Z---");
                System.out.println("7---A porta está aberta?---");

                switch (teclado.nextInt()){
                    case 1:
                        porta.abrir();
                        break;
                    case 2:
                        porta.fechar();
                        break;
                    case 3:
                        System.out.println("Informe a cor que deseja pintar a porta: ");
                        stringAuxi = teclado.nextLine();
                        porta.pintar(stringAuxi);
                        break;
                    case 4:
                        System.out.println("Informe a nova dimensão x: ");
                        floatAuxi =  teclado.nextFloat();
                        porta.setDimensaoX(floatAuxi);
                        break;
                    case 5:
                        System.out.println("Informe a nova dimensão y: ");
                        floatAuxi = teclado.nextFloat();
                        porta.setDimensaoY(floatAuxi);
                        break;
                    case 6:
                        System.out.println("Informe a nova dimensão z: ");
                        floatAuxi = teclado.nextFloat();
                        porta.setDimensaoZ(floatAuxi);
                        break;
                    case 7:
                        System.out.println(porta.estaAberta());
                }
                case 2:
                    System.out.println("---Casa---");
                    System.out.println("1---Pintar casa---");
                    System.out.println("2---Adcionar três portas na casa---");
                    System.out.println("3---Abrir a primeira porta---");
                    System.out.println("4---Abrir a segunda porta---");
                    System.out.println("5---Abrir a terceira porta---");
                    System.out.println("6---Quantas portas estão abertas? ---");

                    switch (teclado.nextInt()){
                        case 1:
                            teclado.nextLine();
                            System.out.println("Informe a cor que deseja pintar a casa: ");
                            stringAuxi = teclado.nextLine();
                            casa.pintar(stringAuxi);
                            break;
                        case 2:
                            casa.setPortaUm(new Porta());
                            casa.setPortaDois(new Porta());
                            casa.setPortaTres(new Porta());
                            break;
                        case 3:
                            casa.getPortaUm().abrir();
                            break;
                        case 4:
                            casa.getPortaDois().abrir();
                            break;
                        case 5:
                            casa.getPortaTres().abrir();
                            break;
                        case 6:
                            System.out.println(casa.quantasPortasEstaoAbertas());
                    }

                case 3:
                    System.out.println("---Edificio---");
                    System.out.println("1---Pintar---");
                    System.out.println("2---Criar seis portas---");
                    System.out.println("3---Abrir a primeira porta---");
                    System.out.println("4---Abrir a segunda porta---");
                    System.out.println("5---Abrir a terceira porta---");
                    System.out.println("6---Abrir a quarta porta---");
                    System.out.println("7---Abrir a quinta porta---");
                    System.out.println("8---Abrir a sexta porta---");
                    System.out.println("9---Quantas portas estão abertas---");
                    System.out.println("10---Total de portas---");

                    switch (teclado.nextInt()){
                        case 1:
                            System.out.println("Informe a cor que deseja pintar o edificio: ");
                            stringAuxi = teclado.nextLine();
                            edificio.pintar(stringAuxi);
                            break;
                        case 2:
                            edificio.adicionarPorta(new Porta());
                            edificio.adicionarPorta(new Porta());
                            edificio.adicionarPorta(new Porta());
                            edificio.adicionarPorta(new Porta());
                            edificio.adicionarPorta(new Porta());
                            edificio.adicionarPorta(new Porta());
                    }
            }


        }while(true);
    }
}
