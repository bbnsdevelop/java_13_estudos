package br.com.poo.objetos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public void adicionarCursos(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	public String getNome() {
		return this.nome;
	} 
	public List<Curso> getCursos(){
		return this.cursos;
	}
}
