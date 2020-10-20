package com.soft.data.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Cuenta {
    private String codigoCuenta;
    private String codigoTipoCuenta;
    private List<UnidadControl> listaUnidadControl;
}
