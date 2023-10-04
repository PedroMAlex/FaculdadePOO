package visao;
import aplicacao.Elevador;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Elevador e1 = new Elevador();
		Scanner	teclado = new Scanner(System.in);
		
		int op;
		do {
		
		System.out.println("0 - Inicializar informações: ");
		System.out.println("1 - Entrar do elevador");
		System.out.println("2 - Subir andar");
		System.out.println("3 - Descer andar");
		System.out.println("4 - Sair do elevador");
		System.out.println("5 - Encerrar programa");
		System.out.println("Escolha a opção");
		op = teclado.nextInt();
		
		switch (op) {
			case 0: 
				System.out.println("Informe a quantidade total de andares: ");
				e1.totalAndares = teclado.nextInt();
				
				System.out.println("Informe a capacidade do elevador: ");
				e1.capacidade = teclado.nextInt();
				
				e1.inicializar(e1.capacidade, e1.totalAndares);
	
				break;
			case 1: e1.entrar();
				break;
			case 2: e1.subir();
				break;
			case 3: e1.descer();
				break;
			case 4: e1.sair();
				break;
			case 5:  System.out.println("Fim do programa!");;
				break;
			
			default: System.out.println("Opçao inválida.");
				break;
			
			}
		} while (op!=5);
		
		
	
}
}
