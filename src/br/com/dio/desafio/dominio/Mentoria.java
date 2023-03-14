package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private LocalDate data;

	public Mentoria() {

	}

	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO + 20d;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}

	@Override
	public String mostraEvolucao() {
		if(getTitulo() == null ) {
			return "É necessário que se insira um título";
		}else if ( getDescricao() == null){
			return "É necessário que se insira uma descrição";
		}else {
			return "Título e Descrição inseridos com sucesso.";
		}
		
		
	}

}
