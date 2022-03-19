package com.devinhouse.devagro.repositories;

import com.devinhouse.devagro.models.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByEmpresaId (Long empresaId);
}
