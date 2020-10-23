package com.soft.data.domain;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MetadataDto {
    private String nombreSistemaOrigen;
    private String idEvento;
    private String fechaEvento;
    private String nombreTopico;
}
