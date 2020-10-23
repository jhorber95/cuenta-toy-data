package com.soft.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DefinicionesRegistroCuentaDto {

    private String codigoMovimiento;
    private String codigoCuentaDebitar;
    private String codigoCuentaAcreditar;
    private String codigoCuentaTransitoriaDebitar;
    private String codigoCuentaTransitoriaAcreditar;
    private boolean tieneSuspension;
    private String tipoAccion;
    private ReglaDto regla;


}
