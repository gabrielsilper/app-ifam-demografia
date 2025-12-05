package com.github.gabrielsilper.app_ifam_demografia.dtos.creations;

import com.github.gabrielsilper.app_ifam_demografia.models.Estado;

public record EstadoCreationDto(String nome, String ibge, String sigla) {

    public Estado toEntity() {
        return new Estado(null, this.nome, this.ibge, this.sigla);
    }
}
