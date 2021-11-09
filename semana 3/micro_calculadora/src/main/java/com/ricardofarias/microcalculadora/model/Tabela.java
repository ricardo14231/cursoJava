package com.ricardofarias.microcalculadora.model;

public class Tabela {

	private String pessoa;
	private Double precoPorDia;
	private Integer dias;
	
	
	public Tabela() {
		super();
	}

	public Tabela(String pessoa, Double precoPorDia, Integer dias) {
		super();
		this.pessoa = pessoa;
		this.precoPorDia = precoPorDia;
		this.dias = dias;
	}

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}

	public Double getPrecoPorDia() {
		return precoPorDia;
	}

	public void setPrecoPorDia(Double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}
	
	public void setPrecoDoDia(Double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}
	
}
