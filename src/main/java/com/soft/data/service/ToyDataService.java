package com.soft.data.service;

import com.soft.data.domain.AtributoUnidadControlDto;
import com.soft.data.domain.CatalogoDto;
import com.soft.data.domain.CuentaDto;
import com.soft.data.domain.UnidadControlDto;
import com.soft.data.util.Constants;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ToyDataService {

    public CuentasResponse generateData() {


        CuentaDto c = CuentaDto.builder()
                .codCuenta("CD1011")
                .nomCuenta("Cuenta de Saldos Deudores TI")
                .desCuenta("Cuenta de Saldos Deudores TI")
                .codEstadoCuenta("1")
                .codTipoCuenta(cuentaDeuda("CD10"))
                .unidadControl(createUnidad("1")).build();

        CuentaDto c1 = CuentaDto.builder()
                .codCuenta("CD1021")
                .nomCuenta("Cuenta de Sanciones TI")
                .desCuenta("Cuentade Sanciones TI")
                .codEstadoCuenta("1")
                .codTipoCuenta(cuentaDeuda("CD11"))
                .unidadControl(createUnidad("1")).build();


        CuentaDto c2 = CuentaDto.builder()
                .codCuenta("CD1031")
                .nomCuenta("Cuenta de Valores TI (OP,RM,RD,RIP)")
                .desCuenta("Cuenta de  Valores TI (OP,RM,RD,RIP)")
                .codEstadoCuenta("1")
                .codTipoCuenta(cuentaDeuda("CD12"))
                .unidadControl(createUnidad("1")).build();


        CuentaDto c3 = CuentaDto.builder()
                .codCuenta("CD1032")
                .nomCuenta("Cuenta de Valores TA (OP, RM, RD, RSIDV, RIP)")
                .desCuenta("Cuenta de  Valores TA (OP, RM, RD, RSIDV, RIP)")
                .codEstadoCuenta("1")
                .codTipoCuenta(cuentaDeuda("CD13"))
                .unidadControl(createUnidad("1")).build();


        CuentaDto c4 = CuentaDto.builder()
                .codCuenta("CD1041")
                .nomCuenta("Cuenta de Fraccionamiento")
                .desCuenta("Cuenta de  Fraccionamiento")
                .codEstadoCuenta("1")
                .codTipoCuenta(cuentaDeuda("CD14"))
                .unidadControl(createUnidad("1")).build();

        CuentaDto c5 = CuentaDto.builder()
                .codCuenta("CI3041")
                .nomCuenta("Cuenta Contrapartida Deudas TI")
                .desCuenta("Cuenta Contrapartida Deudas TI")
                .codEstadoCuenta("1")
                .codTipoCuenta(cuentaInformativa())
                .unidadControl(createUnidad("8"))
                .build();

        CuentaDto c6 = CuentaDto.builder()
                .codCuenta("CC2011")
                .nomCuenta("Cuenta de Saldos a Favor Declaraciones Mensuales")
                .desCuenta("Cuenta de Saldos a Favor Declaraciones Mensuales")
                .codEstadoCuenta("1")
                .codTipoCuenta(cuentaCredito())
                .unidadControl(createUnidad("2"))
                .build();

        CuentaDto c7 = CuentaDto.builder()
                .codCuenta("CI3045")
                .nomCuenta("Cuenta Contrapartida de Saldos a Favor, Créditos, Pagos TI")
                .desCuenta("Cuenta Contrapartida de Saldos a Favor, Créditos, Pagos TI")
                .codEstadoCuenta("1")
                .codTipoCuenta(cuentaInformativa())
                .unidadControl(createUnidad("6"))
                .build();

        CuentaDto c8 = CuentaDto.builder()
                .codCuenta("CT4050")
                .nomCuenta("Cuenta de Saldos de Sanciones Preliminares")
                .desCuenta("Cuenta de Saldos de Sanciones Preliminares")
                .codEstadoCuenta("1")
                .codTipoCuenta(cuentaTransitoria())
                .unidadControl(createUnidad("1"))
                .build();

        return CuentasResponse.builder().cuentas(Arrays.asList(c, c1, c2, c3, c4, c5, c6, c7, c8)).build();
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

    private CatalogoDto cuentaCredito() {
        return new CatalogoDto("CC20", "Cuentas de Créditos");
    }

    private CatalogoDto cuentaInformativa() {
        return new CatalogoDto("CI30", "Cuentas Informativas o de Control");
    }

    private CatalogoDto cuentaTransitoria() {
        return new CatalogoDto("CT40", "Cuentas Transitorias");
    }

    private CatalogoDto cuentaDeuda(String cod) {
        return new CatalogoDto(cod, "Cuentas de Deudas");
    }

}
