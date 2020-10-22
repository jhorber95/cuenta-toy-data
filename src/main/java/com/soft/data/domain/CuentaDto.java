package com.soft.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CuentaDto {
    private String nomCuenta;
    private String codCuenta;
    private String desCuenta;
    private CatalogoDto codTipoCuenta;
    private String codEstadoCuenta;
    private UnidadControlDto unidadControl;
}
