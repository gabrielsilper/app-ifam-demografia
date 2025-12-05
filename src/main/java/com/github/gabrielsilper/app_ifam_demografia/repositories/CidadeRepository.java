package com.github.gabrielsilper.app_ifam_demografia.repositories;

import com.github.gabrielsilper.app_ifam_demografia.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
