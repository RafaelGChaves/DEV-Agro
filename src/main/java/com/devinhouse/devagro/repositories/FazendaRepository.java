package com.devinhouse.devagro.repositories;


import com.devinhouse.devagro.models.Fazenda;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FazendaRepository extends JpaRepository<Fazenda, Long> {

    List<Fazenda> findByEmpresaId(Long empresaId);


}
