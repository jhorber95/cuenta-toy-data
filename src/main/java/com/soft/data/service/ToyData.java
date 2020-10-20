package com.soft.data.service;

import com.soft.data.domain.Cuenta;
import com.soft.data.domain.UnidadControl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ToyData {

    public CuentaDto generateData() {

        List<UnidadControl> list1 = Arrays.asList(getRuc(), getCodTributo(), getPerDocumento());
        Cuenta cuenta1 = new Cuenta("CD1011", "CD10", list1);

        List<UnidadControl> list2 = Arrays.asList(getRuc(), getEjercicio());
        Cuenta cuenta2 = new Cuenta("CI3041", "CI30", list2);

        List<UnidadControl> list3 = Arrays.asList(getRuc(), getCodTributo());
        Cuenta cuenta3 = new Cuenta("CC2011", "CC20", list3);

        List<UnidadControl> list4 = Arrays.asList(getRuc(), getCodTributo(),  getPerDocumento());
        Cuenta cuenta4 = new Cuenta("CD1011", "CD10", list4);

        List<UnidadControl> list5 = Arrays.asList(getRuc(), getCodTributo(),  getPerDocumento());
        Cuenta cuenta5 = new Cuenta("CD1011", "CI30", list5);

        List<UnidadControl> list6 = Arrays.asList(getRuc(), getCodTributo());
        Cuenta cuenta6 = new Cuenta("CC2012", "CC20", list6);

        List<Cuenta> cuentas = new ArrayList<>();
        cuentas.add(cuenta1);
        cuentas.add(cuenta2);
        cuentas.add(cuenta3);
        cuentas.add(cuenta4);
        cuentas.add(cuenta5);
        cuentas.add(cuenta6);

        CuentaDto data = new CuentaDto();
        data.setCuentas(cuentas);

        return data;
    }

    public UnidadControl getRuc( ){
        return new UnidadControl("numRuc", "RUC", "1");
    }

    public UnidadControl getCodTributo() {
        return new UnidadControl("codTriburo", "codTriburo", "2");
    }

    public UnidadControl getPerDocumento() {
        return new UnidadControl("PerDocumento", "PerDocumento", "3");
    }

    public UnidadControl getEjercicio() {
        return new UnidadControl("ejercicio", "ejercicio", "2");
    }
}
