package com.soft.data.service;

import com.soft.data.domain.Cuenta;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CuentaDto {
    private List<Cuenta> cuentas = new ArrayList<>();
}
