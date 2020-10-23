package com.soft.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentoNormalizadoDataDto {

    private String numeroOrden;
    private String codigoDefinicionDocumentoNormalizado;
    private String codigoTributo;
    private String descripcionTributo;
    private String codigoProcesoNegocio;
    private String descripcionProcesoNegocio;
    private String codigoSubProcesoNegocio;
    private String descripcionSubProcesoNegocio;
    private String tipoDocumentoScuc;
    private String descripcionTipoDocumentoScuc;
    private String subTipoDocumentoScuc;
    private String descripcionSubTipoDocumentoScuc;
    private String numeroDocumentoSustento;
    private String estado;
    private String estadoProceso;
    private String estadoReproceso;
    private String numeroVersion;
    private String ruc;
    private String codigoMoneda;
    private String descripcionMoneda;
    private String periodoDocumento;
    private boolean indicadorDiferencia;

    private Map<String, ReglaIntermediaDto> valoresIntermedios;

    private List<InsumoNormalizadoDto> insumos;
    private Map<String, SeccionNormalizadoDto> secciones;


    public enum TipoRegla {
        ATTR,
        FORM,
        CONST,
        FUNC;
    }

}
