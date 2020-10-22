package com.soft.data.service;

import com.soft.data.domain.CatalogoDto;
import com.soft.data.domain.CuentaDto;
import com.soft.data.domain.UnidadControlDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ToyDataService {

    public List<CuentaDto> generateData() {


        CuentaDto c = new CuentaDto();
        c.setCodCuenta("CD1011");
        c.setNomCuenta("Cuenta de Saldos Deudores TI");
        c.setDesCuenta("Cuenta de Saldos Deudores TI");
        c.setCodEstadoCuenta("1");
        c.setCodTipoCuenta(createCatalogo("CD10"));

        CuentaDto c1 = new CuentaDto();
        c1.setCodCuenta("CD1021");
        c1.setNomCuenta("Cuenta de Sanciones TI");
        c1.setDesCuenta("Cuentade Sanciones TI");
        c1.setCodEstadoCuenta("1");
        c1.setCodTipoCuenta(createCatalogo("CD11"));


        CuentaDto c2 = new CuentaDto();
        c2.setCodCuenta("CD1031");
        c2.setNomCuenta("Cuenta de Valores TI (OP,RM,RD,RIP)");
        c2.setDesCuenta("Cuenta de  Valores TI (OP,RM,RD,RIP)");
        c2.setCodEstadoCuenta("1");
        c.setCodTipoCuenta(createCatalogo("CD12"));


        CuentaDto c3 = new CuentaDto();
        c3.setCodCuenta("CD1032");
        c3.setNomCuenta("Cuenta de Valores TA (OP, RM, RD, RSIDV, RIP)");
        c3.setDesCuenta("Cuenta de  Valores TA (OP, RM, RD, RSIDV, RIP)");
        c3.setCodEstadoCuenta("1");
        c.setCodTipoCuenta(createCatalogo("CD13"));


        CuentaDto c4 = new CuentaDto();
        c4.setCodCuenta("CD1041");
        c4.setNomCuenta("Cuenta de Fraccionamiento");
        c4.setDesCuenta("Cuenta de  Fraccionamiento");
        c4.setCodEstadoCuenta("1");
        c.setCodTipoCuenta(createCatalogo("CD14"));






        List<CuentaDto> cuentaDtos = new ArrayList<>();
        cuentaDtos.add(c);
        cuentaDtos.add(c1);
        cuentaDtos.add(c2);
        cuentaDtos.add(c3);


        CuentasResponse data = new CuentasResponse();
        data.setCuentaDtos(cuentaDtos);

        return cuentaDtos;
    }

    private CatalogoDto createCatalogo(String cod) {
       return new CatalogoDto(cod, cod);
    }
}
