package br.com.poo.teste;

import br.com.poo.objetos.Aluno;
import br.com.poo.objetos.Curso;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Bruno");
		Aluno aluno2 = new Aluno("Tacy");
		Aluno aluno3 = new Aluno("Rafael");
		
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Angular 9");
		Curso curso3 = new Curso("JavaScript");
		Curso curso4 = new Curso("Spring");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCursos(curso3);
		aluno1.adicionarCursos(curso4);
		
		exibirAlunosDoCurso(curso1);
		exibirAlunosDoCurso(curso2);
		exibirAlunosDoCurso(curso3);
		exibirAlunosDoCurso(curso4);
		System.out.println("------------------------------");
		
		exibirCursoDoAluno(aluno1);
		exibirCursoDoAluno(aluno2);
		exibirCursoDoAluno(aluno3);
	}
	
	public static void exibirAlunosDoCurso(Curso curso) {
		System.out.println("Curso ->"+curso.getNome());
		
		System.out.println("Alunos do curso são: ");
		for (Aluno aluno : curso.getAlunos()) {
			System.out.println(aluno.getNome()+" ");
		}
	}
	
	public static void exibirCursoDoAluno(Aluno aluno) {
		System.out.println("Aluno ->"+aluno.getNome());
		
		System.out.println("Cursos do aluno são: ");
		for (Curso curso : aluno.getCursos()) {
			System.out.println(curso.getNome()+" ");
		}
	}

}
