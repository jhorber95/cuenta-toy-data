package com.soft.data.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class DocumentoNormalizadoEvent  {



    public static final String DEFAULT_MESSAGE_VERSION = "1.0.0";


    private MetadataDto metadata;

    @Builder.Default
    private List<DocumentoNormalizadoDataDto> documentosNormalizados = new ArrayList<DocumentoNormalizadoDataDto>();



}
