package visao;
import aplicacao.Elevador;	
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		Scanner teclado = new Scanner(System.in);
		int  op;
		op = teclado.nextInt();
		do {
			System.out.println("1- Inicializar as informações");
			System.out.println("2- Entrar");
			System.out.println("3- Sair");
			System.out.println("4 - Subir");
			System.out.println("5 - Descer");
			System.out.println("6 - Encerrar o programa");
		} while(op!= 6);
		switch(op) {
		case 1:
			System.out.println("Digite a capacidade do elevador: ");
			elevador.capacidadeElevador = teclado.nextInt();
			
			System.out.println("Digite o total de Andares: ");
			elevador.totalAndares = teclado.nextInt();
			
			elevador.inicializar(elevador.totalAndares, elevador.capacidadeElevador);
			
			break;
			
		case 2:
			elevador.entrar();
			
		case 3:
			elevador.sair();
			
		case 4:
			elevador.subir();
		
		case 5:
			elevador.descer();
		}
	}

}
