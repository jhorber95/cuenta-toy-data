package com.soft.data.web.rest;

import com.soft.data.domain.CuentaDto;
import com.soft.data.service.CuentasResponse;
import com.soft.data.service.ToyDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CuentaController {

    private final ToyDataService toyDataService;

    public CuentaController(ToyDataService toyDataService) {
        this.toyDataService = toyDataService;
    }

    @GetMapping("/cuentas")
    public ResponseEntity<CuentasResponse> getData() {
        return ResponseEntity.ok(toyDataService.generateData());
    }
}
