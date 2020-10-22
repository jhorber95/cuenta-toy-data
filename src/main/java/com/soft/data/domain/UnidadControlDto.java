package com.soft.data.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UnidadControlDto {
    private String codUnidadControl;
    private String desUnidadControl;
    private String codEstado;
    private String desEstado;
    private List<AtributoUnidadControlDto> lisAtributosUnidadControl;
    private String indEstadoRegistro;
    private String numLoadProcessEvent;
}
