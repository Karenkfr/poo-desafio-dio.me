package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
Curso curso1 = new Curso();
		
		curso1.setTitulo("curso Java");
		curso1.setDescricao("descrição curso Java");
		System.out.println(curso1.mostraEvolucao());
		curso1.setCargaHoraria(8);
		System.out.println(curso1.mostraEvolucao());
		
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("curso Js");
		curso2.setDescricao("descrição curso Js");
		curso2.setCargaHoraria(4);
		
		
	
		
		Mentoria mentoria = new Mentoria();
		System.out.println(mentoria.mostraEvolucao());
		mentoria.setTitulo("mentoria Java");
		System.out.println(mentoria.mostraEvolucao());
		mentoria.setDescricao("descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		System.out.println(mentoria.mostraEvolucao());
		
//		System.out.println(curso1);
//		System.out.println(mentoria);
//		System.out.println(curso1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		System.out.println(bootcamp.mostraEvolucao());

		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Camila" + devCamila.getConteudosInscritos());
		System.out.println("Conteúdos concluídos Camila" + devCamila.getConteudosConcluidos());
		System.out.println("XP:" + devCamila.calcularXp());
		
		System.out.println("-------------------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos João" + devJoao.getConteudosInscritos());
		System.out.println("XP:" + devJoao.calcularXp());
		System.out.println(devJoao.mostraEvolucao());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("XP:" + devJoao.calcularXp());
		System.out.println(devJoao.mostraEvolucao());
		
		System.out.println("-");
		System.out.println("Conteúdos inscritos João" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos João" + devJoao.getConteudosConcluidos());
		System.out.println("XP:" + devJoao.calcularXp());
		

	}

}
