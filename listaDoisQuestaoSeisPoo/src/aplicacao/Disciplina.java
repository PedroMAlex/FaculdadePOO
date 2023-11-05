package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Disciplina {
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private int codigoDisciplina;
    private String nomeDisciplina;
    private int cargaHorariaDisciplina;
    private String professorDisciplina;

    public Disciplina(int codigoDisciplina){
        this.codigoDisciplina=codigoDisciplina;
    }
    public String melhorAluno(){
        int i;
        float aux=0;
        String nomeAluno=null;

        for(i=0;i<alunos.size();i++){
            if(alunos.get(i).media()>aux){
                aux=alunos.get(i).media();
                nomeAluno=alunos.get(i).getNome();
            }
        }
        return nomeAluno;
    }
    public void mediaAlunoDisciplina(){
        for(int i=0;i<alunos.size();i++){
            alunos.get(i).media();
        }
    }
    public void inserirDadosDisciplina(String nomeDisciplina, int cargaHorariaDisciplina, String professorDisciplina){
        this.nomeDisciplina=nomeDisciplina;
        this.cargaHorariaDisciplina=cargaHorariaDisciplina;
        this.professorDisciplina=professorDisciplina;
    }
    public void CadastrarAlunoDisciplina(Aluno aluno){
        alunos.add(aluno);
    }
    public Aluno consultarAluno(int matricula){
        int auxi = 0;
        for(int i=0;i<alunos.size();i++){
            if(Objects.equals(matricula, alunos.get(i).getMatricula())){
                auxi=i;
            }
        }
        return alunos.get(auxi);
    }
    public String getDados() {
        return "\nCodigo da disciplina: " + codigoDisciplina + "\nNome do professor: " + professorDisciplina + "\nTitulo: " + nomeDisciplina + "\nCarga horária: " + cargaHorariaDisciplina;
    }

    public void alterarProfessor(String professorDisciplina) {
        this.professorDisciplina = professorDisciplina;
    }
    public int getcodDisciplina() {
        return codigoDisciplina;
    }
}