package com.devinhouse.devagro.repositories;

import com.devinhouse.devagro.models.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
