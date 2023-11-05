package visao;

import aplicacao.Pedido;

import java.io.Console;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Principal {
    public static void main(String[] args) {
        float floatAuxi;
        String stringAuxi;
        int intAuxi;
        Pedido pedido = new Pedido();
        ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
        Scanner teclado = new Scanner(System.in);
        int op;

        do {
            System.out.println("---Botijão do PP---");
            System.out.println("1- Efetuar pedido");
            System.out.println("2 - confirmar Entrega");
            System.out.println("3- Visualizar pedidos confirmados");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Efetuando pedido...");
                    System.out.println("Informe seu nome: ");
                    pedido.setNomeDoCliente(teclado.nextLine());
                    System.out.println("Informe a hora da compra: ");
                    floatAuxi = teclado.nextFloat();
                    pedido.setHoraCompraPedido(floatAuxi);
                    teclado.nextLine();
                    System.out.println("Informe o endereço: ");
                    stringAuxi = teclado.nextLine();
                    ;
                    pedido.setEnderecoPedido(stringAuxi);
                    System.out.println("Confirmar as informações abaixo: ");
                    System.out.println("Horário do pedido:" + pedido.getHoraCompraPedido());
                    System.out.println("Endereço de entrega: " + pedido.getEnderecoPedido());
                    System.out.println("S-sim| N- não ");
                    stringAuxi = teclado.nextLine();
                    if (Objects.equals(stringAuxi, "S")) {   //teste
                        System.out.println("Informe a quatidade de botijões que deseja comprar: ");
                        intAuxi = teclado.nextInt();
                        valorPedido(intAuxi);
                        horaEntrega(pedido.getHoraCompraPedido());
                        teclado.nextLine();
                        System.out.println("Informe o número do seu cartão: ");
                        stringAuxi = teclado.nextLine();
                        pedido.setNumeroCartao(stringAuxi);
                        pedido.setStatusPedido(true);
                        pedidos.add(pedido);
                        System.out.println("O código do seu pedido é: " + pedido.gerarCodigoPedido());
                    }

                break;

                case 2:
                    System.out.println("Buscar pedido pelo código: ");
                    intAuxi = teclado.nextInt();

                    for(int i =0;i<pedidos.size();i++){
                        if(intAuxi== pedidos.get(i).getCodigoPedido()){
                            pedidos.get(i).setEntregue(true);
                        } else{
                            System.out.println("Pedido não localizado");
                        }
                    }
                 break;

                case 3:
                    for(int i=0;i<pedidos.size();i++){
                        System.out.println(pedidos.get(i).getNomeDoCliente());
                        System.out.println(pedidos.get(i).getHoraCompraPedido());
                        System.out.println(pedidos.get(i).getEnderecoPedido());
                        System.out.println(pedidos.get(i).getCodigoPedido());
                        System.out.println(pedidos.get(i).isStatusPedido());
                        System.out.println(pedidos.get(i).isEntregue());
                    }
            }
        } while (true);
    }
    public static int valorPedido(int quantidadeBotijaoes){
        return 60 * quantidadeBotijaoes;
    }

    public static float horaEntrega(float horaPedido){
        return horaPedido + 6;
    }
}



