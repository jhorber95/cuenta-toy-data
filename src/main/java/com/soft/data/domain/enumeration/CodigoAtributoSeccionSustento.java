package com.soft.data.domain.enumeration;

public enum CodigoAtributoSeccionSustento {
    SUBTIPO_DOC("subtipodoc"),
    NUM_RUC("numruc"),
    TIP_DJ("tipdj"),
    DOC_SUS("docsus"),
    FEC_VEN("fecven"),
    COD_TRI("codtri"),
    FEC_DOC("fecdoc"),
    ORI_DJ("oridj"),
    COD_MON("codmon"),
    IND_DIF("inddif");



    public final String valor;

    private CodigoAtributoSeccionSustento(String valor) {
        this.valor = valor;
    }
}
