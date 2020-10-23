package com.soft.data.domain.enumeration;

public enum SeccionesDocumentoNormalizado {
    DOC_SUS("docsus"),
    OTR_DAT("otrdat");

    public final String valor;

    private SeccionesDocumentoNormalizado(String valor) {
        this.valor = valor;
    }
}
