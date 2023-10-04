package aplicacao;

public class Elevador {

	private int andarAtual;
	private int pessoas;
	public int capacidade;
	public int totalAndares;
	
	public void inicializar(int capacidade, int totalAndares) {
		andarAtual = 0;
		pessoas = 0;
	}
	
	public void entrar() {
		if (pessoas<capacidade) {
			pessoas++;
		} else {
			System.out.println("O elevador está cheio.");
		}
		
	}
	
	public void sair() {
		if (pessoas>=1) {
			pessoas--;
		} else {
			System.out.println("Não há ngm no elevador.");
		}
	}
	
	public void subir() {
		if (andarAtual<totalAndares) {
			andarAtual++;
		} else {
			System.out.println("Estamos no último andar.");
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
