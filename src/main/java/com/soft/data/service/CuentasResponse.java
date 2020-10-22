package com.soft.data.service;

import com.soft.data.domain.CuentaDto;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
public class CuentasResponse {
    private List<CuentaDto> cuentas = new ArrayList<>();
}
