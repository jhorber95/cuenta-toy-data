package com.soft.data.domain.enumeration;

public enum CodigoAtributoSeccionSustento {
    SUBTIPO_DOC("SUBTIPODOC"),
    NUM_RUC("NUMRUC"),
    TIP_DJ("TIPDJ"),
    DOC_SUS("DOCSUS"),
    FEC_VEN("FECVEN"),
    COD_TRI("CODTRI"),
    FEC_DOC("FECDOC"),
    ORI_DJ("ORIDJ"),
    COD_MON("CODMON");


    public final String valor;

    private CodigoAtributoSeccionSustento(String valor) {
        this.valor = valor;
    }
}
