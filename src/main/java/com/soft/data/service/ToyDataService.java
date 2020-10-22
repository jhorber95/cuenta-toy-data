package com.soft.data.service;

import com.soft.data.domain.AtributoUnidadControlDto;
import com.soft.data.domain.CatalogoDto;
import com.soft.data.domain.CuentaDto;
import com.soft.data.domain.UnidadControlDto;
import com.soft.data.util.Constants;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ToyDataService {

    public CuentasResponse generateData() {


        CuentaDto c = new CuentaDto();
        c.setCodCuenta("CD1011");
        c.setNomCuenta("Cuenta de Saldos Deudores TI");
        c.setDesCuenta("Cuenta de Saldos Deudores TI");
        c.setCodEstadoCuenta("1");
        c.setCodTipoCuenta(createCatalogo("CD10"));
        c.setUnidadControl(createUnidad("1"));

        CuentaDto c1 = new CuentaDto();
        c1.setCodCuenta("CD1021");
        c1.setNomCuenta("Cuenta de Sanciones TI");
        c1.setDesCuenta("Cuentade Sanciones TI");
        c1.setCodEstadoCuenta("1");
        c1.setCodTipoCuenta(createCatalogo("CD11"));
        c1.setUnidadControl(createUnidad("1"));


        CuentaDto c2 = new CuentaDto();
        c2.setCodCuenta("CD1031");
        c2.setNomCuenta("Cuenta de Valores TI (OP,RM,RD,RIP)");
        c2.setDesCuenta("Cuenta de  Valores TI (OP,RM,RD,RIP)");
        c2.setCodEstadoCuenta("1");
        c2.setCodTipoCuenta(createCatalogo("CD12"));
        c2.setUnidadControl(createUnidad("1"));


        CuentaDto c3 = new CuentaDto();
        c3.setCodCuenta("CD1032");
        c3.setNomCuenta("Cuenta de Valores TA (OP, RM, RD, RSIDV, RIP)");
        c3.setDesCuenta("Cuenta de  Valores TA (OP, RM, RD, RSIDV, RIP)");
        c3.setCodEstadoCuenta("1");
        c3.setCodTipoCuenta(createCatalogo("CD13"));
        c3.setUnidadControl(createUnidad("1"));


        CuentaDto c4 = new CuentaDto();
        c4.setCodCuenta("CD1041");
        c4.setNomCuenta("Cuenta de Fraccionamiento");
        c4.setDesCuenta("Cuenta de  Fraccionamiento");
        c4.setCodEstadoCuenta("1");
        c4.setCodTipoCuenta(createCatalogo("CD14"));
        c4.setUnidadControl(createUnidad("1"));


        List<CuentaDto> cuentaDtos = new ArrayList<>();
        cuentaDtos.add(c);
        cuentaDtos.add(c1);
        cuentaDtos.add(c2);
        cuentaDtos.add(c3);


        CuentasResponse data = new CuentasResponse();
        data.setCuentas(cuentaDtos);

        return data;
    }

    private CatalogoDto createCatalogo(String cod) {
        return new CatalogoDto(cod, cod);
    }

    private UnidadControlDto createUnidad(String cod) {
        UnidadControlDto dto = new UnidadControlDto();
        dto.setCodUnidadControl(cod);
        switch (cod) {
            case "1":
                dto.setDesUnidadControl("RUC/".concat(Constants.DES_UNI_CONT_1));
                dto.setLisAtributosUnidadControl(Arrays.asList(getNumRuc("1"), getCodTributo("2"), getPerDocumento("3")));
                break;
            case "2":
                dto.setDesUnidadControl("RUC/".concat(Constants.DES_UNI_CONT_2));
                dto.setLisAtributosUnidadControl(Arrays.asList(getNumRuc("1"), getCodTributo("2"), getPerDocumento("3"), getNumValor("4")));
                break;
            case "3":
                dto.setDesUnidadControl("RUC/".concat(Constants.DES_UNI_CONT_3));
                dto.setLisAtributosUnidadControl(Arrays.asList(getNumRuc("1"), getCodTributo("2")));
                break;
            case "4":
                dto.setDesUnidadControl("RUC/".concat(Constants.DES_UNI_CONT_4));
                dto.setLisAtributosUnidadControl(Arrays.asList(getNumRuc("1"), getCodTributo("2"), getEjercicio("3")));
                break;
            case "5":
                dto.setDesUnidadControl("RUC/".concat(Constants.DES_UNI_CONT_5));
                break;
            case "6":
                dto.setDesUnidadControl("RUC/".concat(Constants.DES_UNI_CONT_6));
                break;
            case "7":
                dto.setDesUnidadControl("RUC/".concat(Constants.DES_UNI_CONT_7));
                dto.setLisAtributosUnidadControl(Arrays.asList(getNumRuc("1"), getCodTributo("2"), getEjercicio("3")));
                break;
            case "8":
                dto.setDesUnidadControl("RUC/".concat(Constants.DES_UNI_CONT_8));
                dto.setLisAtributosUnidadControl(Arrays.asList(getNumRuc("1"), getEjercicio("2")));
                break;

        }


        dto.setCodEstado("1");
        dto.setIndEstadoRegistro("1");
        dto.setNumLoadProcessEvent("99991231");
        return dto;
    }

    private AtributoUnidadControlDto getNumRuc(String orden) {
        return new AtributoUnidadControlDto("numRuc", "RUC", "", "str", orden);
    }

    private AtributoUnidadControlDto getCodTributo(String orden) {
        return new AtributoUnidadControlDto("codTributo", "codTributo", "", "str", orden);
    }

    private AtributoUnidadControlDto getPerDocumento(String orden) {
        return new AtributoUnidadControlDto("perDocumento", "perDocumento", "", "str", orden);
    }

    private AtributoUnidadControlDto getNumValor(String orden) {
        return new AtributoUnidadControlDto("numValor", "numValor", "", "str", orden);
    }

    private AtributoUnidadControlDto getEjercicio(String orden) {
        return new AtributoUnidadControlDto("ejercicio", "ejercicio", "", "str", orden);
    }

}
