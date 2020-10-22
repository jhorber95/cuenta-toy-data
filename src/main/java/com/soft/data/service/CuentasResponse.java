package com.soft.data.service;

import com.soft.data.domain.CuentaDto;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CuentasResponse {
    private List<CuentaDto> cuentaDtos = new ArrayList<>();
}
