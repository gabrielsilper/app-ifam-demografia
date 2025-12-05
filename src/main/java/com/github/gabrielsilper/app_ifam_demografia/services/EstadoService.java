package com.github.gabrielsilper.app_ifam_demografia.services;

import com.github.gabrielsilper.app_ifam_demografia.exceptions.EstadoNotFoundException;
import com.github.gabrielsilper.app_ifam_demografia.models.Estado;
import com.github.gabrielsilper.app_ifam_demografia.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService {
    private final EstadoRepository estadoRepository;

    @Autowired
    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    public Estado saveEstado(Estado estado) {
        return this.estadoRepository.save(estado);
    }

    public List<Estado> getEstados() {
        return this.estadoRepository.findAll();
    }

    public Estado getEstadoById(long id) throws EstadoNotFoundException {
        return this.estadoRepository.findById(id).orElseThrow(EstadoNotFoundException::new);
    }
}
