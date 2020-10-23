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
public class InsumoNormalizadoDto {

    private String codigo;
    private String descripcion;
    private String tipoRegla;
    private String ordenProcesamiento;
    private String montoTributo;
    private String montoInteresMoratorio;
    private String montoInteresCapitalizado;

    private Map<String, AtributoNormalizadoDto> atributos;
    private List<DefinicionesRegistroCuentaDto> definicionesRegistroCuenta;

}
