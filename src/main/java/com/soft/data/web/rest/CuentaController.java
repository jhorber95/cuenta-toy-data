package com.soft.data.web.rest;

import com.soft.data.domain.CuentaDto;
import com.soft.data.domain.DocumentoNormalizadoEvent;
import com.soft.data.service.CuentasResponse;
import com.soft.data.service.DocumentoData;
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
    private final DocumentoData documentoData;

    public CuentaController(ToyDataService toyDataService, DocumentoData documentoData) {
        this.toyDataService = toyDataService;
        this.documentoData = documentoData;
    }

    @GetMapping("/cuentas")
    public ResponseEntity<List<CuentaDto>> getData() {
        return ResponseEntity.ok(toyDataService.generateData());
    }

    @GetMapping("/documentos")
    public ResponseEntity<DocumentoNormalizadoEvent> getDocumento() {
        return ResponseEntity.ok(documentoData.buildDocumento());
    }
}
