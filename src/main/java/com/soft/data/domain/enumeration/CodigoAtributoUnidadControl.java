package com.soft.data.domain.enumeration;

public enum CodigoAtributoUnidadControl  {
	RUC("numRuc"),		
	TRIBUTO("codTributo"),
	PERIODO("perDocumento"),
	EJERCICIO("ejericio"),
	DOCUMENTO("numDocumento"),
	LINEA("numLinea"),
	VALOR("numValor");

	public final String valor;

	private CodigoAtributoUnidadControl(String valor) {
		this.valor = valor;
	}
}
