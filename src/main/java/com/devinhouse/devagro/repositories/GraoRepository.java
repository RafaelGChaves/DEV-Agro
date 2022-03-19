package com.devinhouse.devagro.repositories;

import com.devinhouse.devagro.models.Grao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GraoRepository extends JpaRepository<Grao, Long> {

    List<Grao> findByEmpresaId (Long id);
}
