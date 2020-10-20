package com.soft.data.web.rest;

import com.soft.data.service.CuentaDto;
import com.soft.data.service.ToyData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CuentaController {

    private final ToyData toyData;

    public CuentaController(ToyData toyData) {
        this.toyData = toyData;
    }

    @GetMapping("/cuentas")
    public ResponseEntity<CuentaDto> getData() {
        return ResponseEntity.ok(toyData.generateData());
    }
}
