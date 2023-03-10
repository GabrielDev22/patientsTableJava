package com.gabriel.pacientes.service;

import com.gabriel.pacientes.model.Paciente;

import java.util.List;

public interface PacienteService {

    List<Paciente> getAllPacientes();
    Paciente getPacienteById(Integer id);
    Paciente createPaciente(Paciente paciente);
    Paciente updatePaciente(Paciente paciente);
    void deletePacienteById(Integer id);

}
