package br.com.poo.objetos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	public void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	public String getNome() {
		return this.nome;
	}
	public List<Aluno> getAlunos(){
		return this.alunos;
	}

}
