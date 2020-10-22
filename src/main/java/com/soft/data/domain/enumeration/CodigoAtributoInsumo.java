package com.soft.data.domain.enumeration;

public enum CodigoAtributoInsumo {
	RUC("NUMRUC"),
	IMPORTE_TRIBUTO("MTOTRIBUTO"),
	SUBTIPO_DOC("SUBTIPODOC"),
	DOC_SUS("DOCSUS"),
	PER_DOC("PERDOC"),
	COD_TRI("ODTRI"),
	FEC_DOC("FECDOC"),
	IMP_TRI("IMPTRI");

	public final String valor;

	private CodigoAtributoInsumo(String valor) {
		this.valor = valor;
	}
}
