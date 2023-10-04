package visao;

import java.util.ArrayList;
import java.util.Scanner;

import aplicacao.Pessoa;

public class Principal {

	public static void main(String[] args) {
		int i;
		boolean telefoneExist;
		int idAuxi = 0;
		int op = 0;
		String stringAuxi;
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa pessoa = new Pessoa();
		Scanner teclado = new Scanner(System.in);
		
		do {
		System.out.println("----MENU----");
		System.out.println("1- Cadastrar pessoa");
		System.out.println("2- Remover pessoa");
		System.out.println("3- Buscar pessoa");
		op=teclado.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println("Digite o nome da pessoa que deseja salvar na agenda: ");
			pessoa.setNome(teclado.nextLine());
			
			teclado.nextLine();
			System.out.println("Digite o telefone da pessoa que deseja salvar na agenda: ");
			pessoa.setTelefone(teclado.nextLine());
			
			System.out.println("Digite o email da pessoa que deseja salvar na agenda");
			pessoa.setEmail(teclado.nextLine());
			
			pessoas.add(pessoa);
			
			break;
			
		case 2:
			System.out.println("Digite o telefone que deseja apagar: ");
			teclado.nextLine();
			
			stringAuxi=teclado.nextLine();
			telefoneExist= false;
			
			for(i=0;i<pessoas.size();i++) {
				
				if(stringAuxi.equals(pessoas.get(i).getTelefone())){
					telefoneExist=true;
					idAuxi=i;
				}
			}
			
			if(telefoneExist) {
				pessoas.remove(idAuxi);
			} else {
				System.out.println("O telefone não existe na agenda");
			}
			
		case 3:
			System.out.println("Digite o telefone da pessoa que deseja buscar: ");
			stringAuxi = teclado.nextLine();
			
			boolean numeroEncontrado = false;
			
			for(i=0;i<pessoas.size();i++) {
				if(stringAuxi.equals(pessoas.get(i).getTelefone())) {
					numeroEncontrado = true;
					idAuxi = i;
				}
			}
			
			if(numeroEncontrado) {
				System.out.println(pessoas.get(idAuxi).getNome());
				System.out.println(pessoas.get(idAuxi).getEmail());
			} else {
				System.out.println("Não existe esse número");
			}
		}
	}while(op != 5);
}
}
