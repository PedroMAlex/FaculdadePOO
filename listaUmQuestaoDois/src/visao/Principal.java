package visao;

import aplicacao.Aluno;
import java.util.Scanner; 

public class Principal {
	public static Aluno[] alunos;
	public static Scanner teclado;

	public static void main(String[] args) {
		float notaUm = 0;
		float notaDois = 0;
		float notaTres = 0;
		
		
		alunos = new Aluno[3];
		for (int i=0; i<alunos.length; i++) {
			alunos[i] = new Aluno();
		}
		
		int op;
		boolean menu = true;
	
		do {
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1- Cadastrar alunos");
			System.out.println("2- Cadastrar notas dos alunos");
			System.out.println("3- Calcular médias dos alunos");
			System.out.println("4- Consultar situações dos alunos");
			System.out.println("5- Consultar dados de um aluno");
			System.out.println("6- Alterar notas do aluno");			
			System.out.println("7- Sair");
			
			teclado = new Scanner(System.in);
			op = teclado.nextInt();
		
		
			switch(op) {
			
				case 1:
					cadastrarAlunos();
					break;	
					
				case 2:	
					
					cadastrarNotas();
				
					break;
					
				case 3:
					calcularMedias();
					break;
				
				case 4:
					consultarSituacoesAlunos();
					break;
				
				case 5:
					consultarDadosAluno();
					break;
					
				case 6:
					alterarNotasAluno();
					break;
				
				default:
					break;
				}	
		} while(menu);
		
		System.out.println("Sistema finalizado com sucesso!!!");
		
	}
	
	public static void cadastrarAlunos() {
		String nome = null;
		int matricula;
		
		
		for (int i=0; i<3; i++) {
			System.out.println("Informe a matricula do aluno: ");
			teclado = new Scanner(System.in);
			matricula = teclado.nextInt();
			
			if (!buscarAluno(matricula)) {
				System.out.println("Informe o nome do aluno: ");
				teclado = new Scanner(System.in);
				nome = teclado.next();
				
				alunos[i].setNome(nome);
				alunos[i].setMatricula(matricula);
			} else {
				System.out.println("Aluno já cadastrado");
				i--;
			}
		}
	}
	
	public static void cadastrarNotas() {
		for(int i=0;i<3;i++) {
			System.out.println("Insira as três notas do aluno: " + alunos[i].getNome());
			float notaUm = teclado.nextFloat();
			float notaDois = teclado.nextFloat();
			float notaTres = teclado.nextFloat();
			
			alunos[i].setNota1(notaUm);
			alunos[i].setNota2(notaDois);
			alunos[i].setNota3(notaTres);
		}
	}
	
	public static void calcularMedias() {
		
		
		for (Aluno a: alunos) {
			float media = ((a.getNota1() * 4) + (a.getNota2() * 5) + (a.getNota3() * 6) / 15);
			
			if(media < 3) {
				a.setSituacao("Reprovado");
			} else if(media >= 7) {
				a.setSituacao("Aprovado");
			} else {
				a.setSituacao("Recuperação");
			}
		}
		
		for(int i=0; i<alunos.length; i++) {
			float media = ((alunos[i].getNota1() * 4) + (alunos[i].getNota2() * 5) + (alunos[i].getNota3() * 6) / 15);
			
			if(media < 3) {
				alunos[i].setSituacao("Reprovado");
			} else if(media >= 7) {
				alunos[i].setSituacao("Aprovado");
			} else {
				alunos[i].setSituacao("Recuperação");
			}
		}
		
		
	}
	
	public static void  consultarSituacoesAlunos() {
		
		for(int i=0; i<alunos.length; i++) {
			System.out.println("A situação do aluno " + alunos[i].getNome() + " é " + alunos[i].getSituacao());
		}
	}
	
	public static void consultarDadosAluno() {
		boolean result = false;
		int matricula;
		System.out.println("Informe a matricula para consultar os dados do aluno: ");
		teclado = new Scanner(System.in);
		matricula = teclado.nextInt();
		for (int i=0; i<alunos.length; i++) {
			if (matricula == alunos[i].getMatricula()) {
				System.out.println("Nome.....: " + alunos[i].getNome());
				System.out.println("Nota 1...: " + alunos[i].getNota1());
				System.out.println("Nota 2...: " + alunos[i].getNota2());
				System.out.println("Nota 3...: " + alunos[i].getNota3());
				System.out.println("Média....: " + alunos[i].getMedia());
				System.out.println("Situação.: " + alunos[i].getSituacao());
				result = true;
				
			} 
		}
		if (!result) {
			System.out.println("Matrícula informada não foi encontrada");
		}
	}
	
	public static void alterarNotasAluno() {
		int matricula;
		
		System.out.println("Informe a matrícula do aluno que você deseja alterar as notas");
		teclado = new Scanner(System.in);
		matricula = teclado.nextInt();
		
		if(buscarAluno(matricula)) {
			int notaAlterar;
			
			
			for (int i=0; i<alunos.length; i++) {
				if (matricula == alunos[i].getMatricula()) {
					System.out.println("Aluno: " + alunos[i].getNome());
					
					System.out.println("Informe a nota que deseja alterar (1 , 2 , 3)");
					teclado = new Scanner(System.in);
					notaAlterar = teclado.nextInt();
					if(notaAlterar == 1) {
						System.out.println("A nota Será alterada para: ");
						teclado = new Scanner(System.in);
						notaAlterar = teclado.nextInt();
						alunos[i].setNota1(notaAlterar); 
						
					}
				   if(notaAlterar == 2) {
					   System.out.println("A nota Será alterada para: ");
						teclado = new Scanner(System.in);
						notaAlterar = teclado.nextInt();
						alunos[i].setNota2(notaAlterar);
				   }
				  if(notaAlterar == 2) {
					  System.out.println("A nota Será alterada para: ");
						teclado = new Scanner(System.in);
						notaAlterar = teclado.nextInt();
						alunos[i].setNota3(notaAlterar);
				  }
				} 
			}
		}
	}
	
	
	public static boolean buscarAluno(int matricula) {
		for (int i=0; i<alunos.length; i++) {
			if (matricula == alunos[i].getMatricula()) {
				return true;
			} 
		}
		return false;
	}
}
