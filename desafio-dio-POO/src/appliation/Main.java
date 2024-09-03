package appliation;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso = new Curso();
		
		curso.setTitulo("curso java");
		curso.setDescriçao("descrição do curso");
		curso.setCargahoraria(8);
		
		System.out.println(curso);
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso php");
		curso1.setDescriçao("descrição do curso");
		curso1.setCargahoraria(7);
		
		System.out.println(curso1);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria spring boot");
		mentoria.setDescricao("descrição da mentoria");
		mentoria.setData(LocalDate.now());
		
		System.out.println(mentoria);
		
		Mentoria mentoria1= new Mentoria();
		mentoria1.setTitulo("mentoria spring boot");
		mentoria1.setDescricao("descrição da mentoria");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(mentoria);

	}

}
