package com.soft.data.domain.enumeration;

public enum EstadoRegistro {
	ACTIVO("1"),
	INACTIVO("0");

	public final String valor;

	private EstadoRegistro(String valor) {
		this.valor = valor;
	}
}
