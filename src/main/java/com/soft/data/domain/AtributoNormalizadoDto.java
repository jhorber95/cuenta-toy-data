package com.soft.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AtributoNormalizadoDto {

    private String codigo;
    private String descripcion;
    private String valor;
    private String tipoDato;

}
