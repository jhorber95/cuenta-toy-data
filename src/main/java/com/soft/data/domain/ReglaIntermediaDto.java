package com.soft.data.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReglaIntermediaDto {

    private String codigo;
    private String descripcion;
    private String ordenProcesamiento;
    private boolean esVisible;
    private boolean esDiferente;

}
