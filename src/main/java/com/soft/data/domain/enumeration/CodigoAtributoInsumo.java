package com.soft.data.domain.enumeration;

public enum CodigoAtributoInsumo {
	RUC("numruc"),
	IMPORTE_TRIBUTO("mtotributo"),
	SUBTIPO_DOC("subtipodoc"),
	DOC_SUS("docsus"),
	PER_DOC("perdoc"),
	COD_TRI("odtri"),
	FEC_DOC("fecdoc"),
	IMP_TRI("imptri");

	public final String valor;

	private CodigoAtributoInsumo(String valor) {
		this.valor = valor;
	}
}
