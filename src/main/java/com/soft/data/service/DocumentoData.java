package com.soft.data.service;

import com.soft.data.domain.*;
import com.soft.data.domain.enumeration.CodigoAtributoInsumo;
import com.soft.data.domain.enumeration.CodigoAtributoSeccionSustento;
import com.soft.data.domain.enumeration.SeccionesDocumentoNormalizado;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class DocumentoData {

    public DocumentoNormalizadoEvent buildDocumento() {
        return DocumentoNormalizadoEvent.builder()
                .metadata(MetadataDto.builder()
                        .nombreSistemaOrigen("CUC")
                        .idEvento("3ae431e3-d02c-7802-9997-7e01a60f11e6")
                        .fechaEvento("18-10-2020 13:26:43.478")
                        .nombreTopico("topic-motorcuentaunica-generacion-documentonormalizado")
                        .build()
                )
                .documentosNormalizados(Collections.singletonList(buildDocumentoNormalizadoDataDto()))
                .build();
    }

    public DocumentoNormalizadoDataDto buildDocumentoNormalizadoDataDto() {
        return DocumentoNormalizadoDataDto.builder()
                .codigoDefinicionDocumentoNormalizado("")
                .codigoTributo("010101")
                .descripcionTributo("IGV - OPER INT")
                .codigoProcesoNegocio("1")
                .descripcionProcesoNegocio("Declaracion Jurada")
                .codigoSubProcesoNegocio("1")
                .descripcionTipoDocumentoScuc("Formulario (Declaraciones o Pagos)")
                .descripcionSubTipoDocumentoScuc("Formulario (Declaraciones o Pagos)")
                .estado("1")
                .estadoProceso("1")
                .estadoReproceso("0")
                .numeroVersion("1.2")
                .indicadorDiferencia(false)
                .valoresIntermedios(buildReglaIntermediaDtoMap())
                .insumos(Collections.singletonList(buildInsumoNormalizadoDto()))
                .secciones(buildSecciones())
                .build();
    }

    public InsumoNormalizadoDto buildInsumoNormalizadoDto() {
        return InsumoNormalizadoDto.builder()
                .codigo("1")
                .montoTributo("codigo tributo")
                .atributos(buildAtributos())
                .definicionesRegistroCuenta(Collections.singletonList(buildDefinicionesRegistroCuentaDto()))
                .build();
    }

    public Map<String, AtributoNormalizadoDto> buildAtributos() {
        Map<String, AtributoNormalizadoDto> map = new HashMap<>();

        map.put(CodigoAtributoInsumo.SUBTIPO_DOC.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoInsumo.SUBTIPO_DOC.valor)
                .descripcion("Documento sustento")
                .valor("1")
                .build());

        map.put(CodigoAtributoInsumo.RUC.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoInsumo.RUC.valor)
                .descripcion((CodigoAtributoInsumo.RUC.valor))
                .valor("2")
                .build());

        map.put(CodigoAtributoInsumo.DOC_SUS.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoInsumo.DOC_SUS.valor)
                .descripcion("Numero Documento sustento")
                .valor("3")
                .build());


        map.put(CodigoAtributoInsumo.PER_DOC.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoInsumo.PER_DOC.valor)
                .descripcion("Periodo del documento")
                .valor("4")
                .build());

        map.put(CodigoAtributoInsumo.COD_TRI.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoInsumo.COD_TRI.valor)
                .descripcion("codigo tributo")
                .valor("5")
                .build());

        map.put(CodigoAtributoInsumo.FEC_DOC.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoInsumo.FEC_DOC.valor)
                .descripcion("Fecha de presentacion")
                .valor("6")
                .build());

        map.put(CodigoAtributoInsumo.IMP_TRI.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoInsumo.IMP_TRI.valor)
                .descripcion("Importe de tributo")
                .valor("7")
                .build());

        return map;
    }

    public DefinicionesRegistroCuentaDto buildDefinicionesRegistroCuentaDto() {
        return DefinicionesRegistroCuentaDto.builder()
                .codigoMovimiento("")
                .tieneSuspension(false)
                .tipoAccion("registrar")
                .regla(ReglaDto.builder()
                        .codigo("1234")
                        .valor("C[100]<>null")
                        .descripcion("Condicion Casilla 100  diferente a vacia")
                        .build())
                .build();
    }

    public Map<String, ReglaIntermediaDto> buildReglaIntermediaDtoMap() {
        Map<String, ReglaIntermediaDto> map = new HashMap<>();
        map.put("140", buildReglaIntermediaDto());
        return map;
    }

    public Map<String, SeccionNormalizadoDto> buildSecciones() {
        Map<String, SeccionNormalizadoDto> map = new HashMap<>();

        map.put(SeccionesDocumentoNormalizado.DOC_SUS.valor, SeccionNormalizadoDto.builder()
                .codigo(SeccionesDocumentoNormalizado.DOC_SUS.valor)
                .descripcion("Documento Sustento")
                .atributos(buildDOCSUSMapAtributoNormalizadoDto())
                .build());

        map.put(SeccionesDocumentoNormalizado.OTR_DAT.valor, SeccionNormalizadoDto.builder()
                .codigo(SeccionesDocumentoNormalizado.OTR_DAT.valor)
                .descripcion("Otros datos especificos")
                .atributos(buildOTRDATMapAtributoNormalizadoDto())
                .build());

        return map;
    }

    public Map<String, AtributoNormalizadoDto> buildDOCSUSMapAtributoNormalizadoDto() {
        Map<String, AtributoNormalizadoDto> map = new HashMap<>();

        map.put(CodigoAtributoSeccionSustento.SUBTIPO_DOC.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.SUBTIPO_DOC.valor)
                .descripcion("RUC")
                .valor("1")
                .build());

        map.put(CodigoAtributoSeccionSustento.NUM_RUC.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.SUBTIPO_DOC.valor)
                .descripcion("RUC")
                .valor("2")
                .build());

        map.put(CodigoAtributoSeccionSustento.TIP_DJ.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.TIP_DJ.valor)
                .descripcion("Tipo de documento")
                .valor("3")
                .build());

        map.put(CodigoAtributoSeccionSustento.DOC_SUS.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.DOC_SUS.valor)
                .descripcion("Document description")
                .valor("4")
                .build());

        map.put(CodigoAtributoSeccionSustento.FEC_VEN.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.FEC_VEN.valor)
                .descripcion("Fecha de vencimiento")
                .valor("5")
                .build());

        map.put(CodigoAtributoSeccionSustento.COD_TRI.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.COD_TRI.valor)
                .descripcion("codigo trimestre")
                .valor("6")
                .build());

        map.put(CodigoAtributoSeccionSustento.FEC_DOC.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.FEC_DOC.valor)
                .descripcion("Fecha documento")
                .valor("7")
                .build());

        map.put(CodigoAtributoSeccionSustento.ORI_DJ.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.ORI_DJ.valor)
                .descripcion("origen documento")
                .valor("8")
                .build());

        map.put(CodigoAtributoSeccionSustento.COD_MON.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.COD_MON.valor)
                .descripcion("Codugo mes")
                .valor("9")
                .build());


        return map;
    }

    public Map<String, AtributoNormalizadoDto> buildOTRDATMapAtributoNormalizadoDto() {
        Map<String, AtributoNormalizadoDto> map = new HashMap<>();

        map.put(CodigoAtributoSeccionSustento.IND_DIF.valor, AtributoNormalizadoDto.builder()
                .codigo(CodigoAtributoSeccionSustento.IND_DIF.valor)
                .descripcion("Ind diferencia")
                .valor("1")
                .build());

        return map;
    }

    public ReglaIntermediaDto buildReglaIntermediaDto() {
        return ReglaIntermediaDto.builder()
                .codigo("140")
                .descripcion("1")
                .ordenProcesamiento("2")
                .esVisible(true)
                .esDiferente(false)
                .build();
    }
}
