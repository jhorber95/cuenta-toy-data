package com.soft.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AtributoUnidadControlDto {
    private String codUnidadControl;
    private String desUnidadControl;
    private String codEstado;
    private String desEstado;
    private List<AtributoUnidadControlDto> lisAtributosUnidadControl;
    private String indEstadoRegistro;
    private String numLoadProcessEvent;
}
