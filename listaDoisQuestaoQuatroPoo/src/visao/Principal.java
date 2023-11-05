package visao;

import aplicacao.Ingresso;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String stringAuxi;
        Ingresso ingresso = new Ingresso();
        Scanner teclado = new Scanner(System.in);
        ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();

        do {
            System.out.println("---Vendas de Ingresso---");
            System.out.println("1- Adquirir um ingresso");
            System.out.println("2- Alterar meu ingresso");
            System.out.println("3- Excluir ingresso");
            switch (teclado.nextInt()){
                case 1:
                    teclado.nextLine();
                    System.out.println("Digite seu CPF: ");
                    ingresso.setCpfCliente(teclado.nextLine());
                    System.out.println("Digite o nome do filme: ");
                    ingresso.setNomeFilme(teclado.nextLine());
                    System.out.println("Digite o número da poltrona: ");
                    ingresso.setNumeroPoltrona(teclado.nextInt());
                    System.out.println("Deseja pagar o valor da meia entrada? S-sim|N-não");
                    teclado.nextLine();
                    if(Objects.equals(teclado.nextLine(), "S")){
                        ingresso.setValorIngresso(16);
                    }else{
                        ingresso.setValorIngresso(8);
                    }
                    ingressos.add(ingresso);

                    break;
                case 2:
                    teclado.nextLine();

                    System.out.println("Digite o cpf cadastrado no ingresso: ");

                    for(int i=0;i<ingressos.size();i++){
                        if(Objects.equals(teclado.nextLine(), ingressos.get(i).getCpfCliente())){
                            System.out.println("o que você deseja alterar?");
                            System.out.println("1- Nome do filme: ");
                            System.out.println("2- número da poltrona: ");
                            System.out.println("3- Valor do ingresso: ");

                            switch (teclado.nextInt()){
                                case 1:
                                    System.out.println("Digite o nome do filme: ");
                                    ingressos.get(i).setNomeFilme(teclado.nextLine());
                                case 2:
                                    System.out.println("Digite o número da poltrona: ");
                                    ingressos.get(i).setNumeroPoltrona(teclado.nextInt());
                                case 3:
                                        System.out.println("Você quer pagar meia entrada? S-sim|N-não");
                                        if(Objects.equals(teclado.nextLine(), "S")){
                                            ingressos.get(i).setValorIngresso(16);
                                        }else {
                                            ingressos.get(i).setValorIngresso(8);
                                        }
                            }
                        }
                    }
                    break;
                case 3:
                    teclado.nextLine();
                    System.out.println("Digite o cpf cadastrado no ingresso que deseja excluir: ");
                    stringAuxi= teclado.nextLine();
                    for(int i=0;i<ingressos.size();i++){
                        if(Objects.equals(stringAuxi, ingressos.get(i).getCpfCliente())){
                            ingressos.remove(ingressos.get(i));
                        } else{
                            System.out.println("Cpf não cadastrado no sistema");
                        }
                    }
            }
        }while (true);
    }
}
