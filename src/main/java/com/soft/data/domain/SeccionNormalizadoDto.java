package com.soft.data.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class SeccionNormalizadoDto extends SeccionDto {

    private Map<String, AtributoNormalizadoDto> atributos;

    @Builder
    public SeccionNormalizadoDto(String codigo, String descripcion, Map<String, AtributoNormalizadoDto> atributos) {
        super(codigo, descripcion);
        this.atributos = atributos;
    }


}
