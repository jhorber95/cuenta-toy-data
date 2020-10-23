package com.soft.data.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReglaDto {
    private String codigo;
    private String valor;
    private DocumentoNormalizadoDataDto.TipoRegla tipo;
    private String descripcion;
}