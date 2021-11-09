package com.example.demo.model;

public enum TipoCliente {

	PESSOAFISICA(1, "Pessoa Física"),
	PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	private int cod;
	private String tipo;
	
	TipoCliente(Integer cod, String tipo) {
		this.cod = cod;
		this.tipo = tipo;
	}
	
	public int getCod() {
		return cod; 
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		for(TipoCliente tipoEnum : TipoCliente.values()) {
			if(cod.equals(tipoEnum.getCod())) {
				return tipoEnum;
			}
		}
		throw new IllegalArgumentException("Id Inválido: " + cod);
	}
}
