package com.gabriel.pacientes.repository;

import com.gabriel.pacientes.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository <Paciente, Integer> {
}
