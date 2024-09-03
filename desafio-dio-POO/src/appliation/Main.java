package appliation;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição do curso");
		curso1.setCargahoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("curso php");
		curso2.setDescricao("descrição do curso");
		curso2.setCargahoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria spring boot");
		mentoria.setDescricao("descrição da mentoria");
		mentoria.setData(LocalDate.now());
		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("BootCamp Java Developer");
		bootcamp.setDescricao("Descrição BootCamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos Concluídos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXP());
		
		System.out.println("----------------");
		
		Dev devJoao = new Dev();
		devJoao = new Dev();
		
		devJoao.inscreverBootcamp(bootcamp);
		
		System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
		System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
	}

}
