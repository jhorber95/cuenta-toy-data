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


        CuentaDto c = CuentaDto.builder()
                .codCuenta("CD1011")
                .nomCuenta("Cuenta de Saldos Deudores TI")
                .desCuenta("Cuenta de Saldos Deudores TI")
                .codEstadoCuenta("1")
                .codTipoCuenta(createCatalogo("CD10"))
                .unidadControl(createUnidad("1")).build();

        CuentaDto c1 = CuentaDto.builder()
                .codCuenta("CD1021")
                .nomCuenta("Cuenta de Sanciones TI")
                .desCuenta("Cuentade Sanciones TI")
                .codEstadoCuenta("1")
                .codTipoCuenta(createCatalogo("CD11"))
                .unidadControl(createUnidad("1")).build();


        CuentaDto c2 = CuentaDto.builder()
                .codCuenta("CD1031")
                .nomCuenta("Cuenta de Valores TI (OP,RM,RD,RIP)")
                .desCuenta("Cuenta de  Valores TI (OP,RM,RD,RIP)")
                .codEstadoCuenta("1")
                .codTipoCuenta(createCatalogo("CD12"))
                .unidadControl(createUnidad("1")).build();


        CuentaDto c3 = CuentaDto.builder()
                .codCuenta("CD1032")
                .nomCuenta("Cuenta de Valores TA (OP, RM, RD, RSIDV, RIP)")
                .desCuenta("Cuenta de  Valores TA (OP, RM, RD, RSIDV, RIP)")
                .codEstadoCuenta("1")
                .codTipoCuenta(createCatalogo("CD13"))
                .unidadControl(createUnidad("1")).build();


        CuentaDto c4 = CuentaDto.builder()
                .codCuenta("CD1041")
                .nomCuenta("Cuenta de Fraccionamiento")
                .desCuenta("Cuenta de  Fraccionamiento")
                .codEstadoCuenta("1")
                .codTipoCuenta(createCatalogo("CD14"))
                .unidadControl(createUnidad("1")).build();


        List<CuentaDto> cuentaDtos = new ArrayList<>();
        cuentaDtos.add(c);
        cuentaDtos.add(c1);
        cuentaDtos.add(c2);
        cuentaDtos.add(c3);

        cuentaDtos.add(c4);


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
