package com.github.gabrielsilper.app_ifam_demografia.controllers;

import com.github.gabrielsilper.app_ifam_demografia.dtos.creations.EstadoCreationDto;
import com.github.gabrielsilper.app_ifam_demografia.exceptions.EstadoNotFoundException;
import com.github.gabrielsilper.app_ifam_demografia.models.Estado;
import com.github.gabrielsilper.app_ifam_demografia.services.EstadoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estados")
public class EstadoController {
    private final EstadoService estadoService;

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Estado saveEstado(@RequestBody EstadoCreationDto estadoDto) {
        return this.estadoService.saveEstado(estadoDto.toEntity());
    }

    @GetMapping()
    public List<Estado> getEstados() {
        return this.estadoService.getEstados();
    }

    @GetMapping("/{id}")
    public Estado getEstadoById(@PathVariable long id) throws EstadoNotFoundException {
        return this.estadoService.getEstadoById(id);
    }
}
