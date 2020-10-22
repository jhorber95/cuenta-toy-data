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
    private String codAtributoUnidadControl;
    private String desAtributoUnidadControl;
    private String desValAtributoUnidadControl;
    private String codTipoDatoAtributoUnidadControl;
    private String numOrdenAtributoUnidadControl;
}
