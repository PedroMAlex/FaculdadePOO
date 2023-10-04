package aplicacao;

public class Elevador {

	public int andarAtual = 0;
	public int totalAndares= 15 ;
	public float capacidadeElevador;
	public int quantidadePessoas = 0;
	

	public void inicializar(int capacidade, float andares) {
		
	}
	public void entrar() {
		if(quantidadePessoas < capacidadeElevador ) {
			quantidadePessoas++;
		} else {
			System.out.println("O  elevador está cheio!");
		}
	}
	public void sair() {
		if(quantidadePessoas > 0) {
			quantidadePessoas --;
		} else {
			System.out.println("O elevador já está vázio!");
		}
		
	}
	public void subir() {
		if(andarAtual< totalAndares) {
			andarAtual++;
		}else {
			System.out.println("Estamos no último andar!");
		}
	}
	public void descer() {
		if (andarAtual>0) {
			andarAtual--;
		} else {
			System.out.println("Estamos no térreo.");
		}
	
	}
}