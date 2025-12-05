package com.github.gabrielsilper.app_ifam_demografia.services;

import com.github.gabrielsilper.app_ifam_demografia.exceptions.CidadeNotFoundException;
import com.github.gabrielsilper.app_ifam_demografia.models.Cidade;
import com.github.gabrielsilper.app_ifam_demografia.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {
    private final CidadeRepository cidadeRepository;

    @Autowired
    public CidadeService(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    public Cidade saveCidade(Cidade cidade) {
        return this.cidadeRepository.save(cidade);
    }

    public List<Cidade> getCidades() {
        return this.cidadeRepository.findAll();
    }

    public Cidade getCidadeById(long id) throws CidadeNotFoundException {
        return this.cidadeRepository.findById(id).orElseThrow(CidadeNotFoundException::new);
    }
}

