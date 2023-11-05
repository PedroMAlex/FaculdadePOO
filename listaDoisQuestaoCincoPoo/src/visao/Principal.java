package visao;

import aplicacao.Pessoa;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String stringAuxi;
        int intAuxi;
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Pessoa pessoa = new Pessoa();
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("---AGENDA---");
            System.out.println("1- Cadastrar pessoa");
            System.out.println("2- remover pessoa");
            System.out.println("3- buscar pessoa");
            intAuxi= teclado.nextInt();
            switch (intAuxi){
                case 1:
                    System.out.println("Informe o nome da pessoa  que deseja cadastrar: ");
                    stringAuxi= teclado.nextLine();
                    pessoa.setNome(stringAuxi);
                    teclado.nextLine();
                    System.out.println("Informe o email da pessoa  que deseja cadastrar: ");
                    stringAuxi= teclado.nextLine();
                    pessoa.setEmail(stringAuxi);
                    System.out.println("Informe o telefone da pessoa  que deseja cadastrar: ");
                    stringAuxi= teclado.nextLine();
                    pessoa.setTelefone(stringAuxi);

                    pessoas.add(pessoa);
                    break;

                case 2:
                    teclado.nextLine();
                    System.out.println("Informe o nome da pessoa que deseja excluir dos contatos: ");
                    stringAuxi=teclado.nextLine();
                    for(int i=0;i<pessoas.size();i++){
                        if(Objects.equals(stringAuxi,pessoas.get(i).getNome())){
                            pessoas.remove(pessoas.get(i));
                            System.out.println("Excluido com sucesso!");
                        }else{
                            System.out.println("Nome não encontrado");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Como deseja buscar uma pessoa: ");
                    System.out.println("1-Nome|2-telefone|3-email");
                    intAuxi=teclado.nextInt();
                    switch (intAuxi){
                        case 1:
                            teclado.nextLine();
                            System.out.println("Digite o nome da pessoa que deseja buscar: ");
                            stringAuxi = teclado.nextLine();
                            for(int i=0;i<pessoas.size();i++){
                                if(Objects.equals(stringAuxi, pessoas.get(i).getNome())){
                                    System.out.println("Telefone: " + pessoas.get(i).getTelefone());
                                    System.out.println("Email: " + pessoas.get(i).getEmail());
                                }else {
                                    System.out.println("Não existe uma pessoa com esse nome no sistema");
                                }
                            }
                            break;
                        case 2:
                            teclado.nextLine();
                            System.out.println("Digite o telefone da pessoa que deseja buscar: ");
                            stringAuxi = teclado.nextLine();
                            for(int i=0;i<pessoas.size();i++){
                                if(Objects.equals(stringAuxi, pessoas.get(i).getTelefone())){
                                    System.out.println("Nome: " + pessoas.get(i).getNome());
                                    System.out.println("Email: " + pessoas.get(i).getEmail());
                                }else {
                                    System.out.println("Não existe pessoa com esse telefone no sistema");
                                }
                            }
                            break;
                        case 3:
                            teclado.nextLine();
                            System.out.println("Digite o email da pessoa que deseja buscar: ");
                            stringAuxi = teclado.nextLine();
                            for(int i=0;i<pessoas.size();i++){
                                if(Objects.equals(stringAuxi, pessoas.get(i).getEmail())){
                                    System.out.println("Telefone: " + pessoas.get(i).getTelefone());
                                    System.out.println("Nome: " + pessoas.get(i).getNome());
                                }else {
                                    System.out.println("Não existe pessoa com esse email no sistema");
                                }
                            }
                    }
            }
        }while(true);
    }
}
