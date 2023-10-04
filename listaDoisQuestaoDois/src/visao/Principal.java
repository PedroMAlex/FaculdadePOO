package visao;

import java.util.ArrayList;
import java.util.Scanner;

import aplicacao.Pedido;

public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("1-Fazer pedido");
		int op = 0;
		inicio(op);
			switch(op) {
				case 1:
					do {
						inicio(op);
			}while(op==2);

		} 
	
	}
	
	private static void novoPedido(ArrayList<Pedido> pedido) {
		 for (Pedido pedidoClasse : pedido) {
		        
		        String pedidoString = pedidoClasse.toString();
		        
		        
		        System.out.println(pedidoString);
		    }
	}
	public static void inicio(int op) {
		
		do {
		ArrayList<Pedido> pedido = new ArrayList<Pedido>();
		
		Scanner teclado = new Scanner(System.in);
		op = teclado.nextInt();
		
		Pedido pedidoClasse = new Pedido();
		
		System.out.println("Digite a hora do seu pedido: ");
		pedidoClasse.setHoraCompra(teclado.nextFloat());  
		teclado.nextLine();
		System.out.println("Digite o nome do seu bairro: ");
		pedidoClasse.setBairro(teclado.nextLine());
		
		System.out.println("Digite o nome da sua rua: ");
		pedidoClasse.setNomeRua(teclado.nextLine());
		
		System.out.println("Digite o número da sua casa: ");
		pedidoClasse.setNumeroCasa(teclado.nextInt());
		
		pedido.add(pedidoClasse);
		novoPedido(pedido);
		
		System.out.println("Deseja alterar alguma informação: 1 ");
		
		}while("");
	}
	
}
