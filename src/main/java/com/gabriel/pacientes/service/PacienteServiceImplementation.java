package com.gabriel.pacientes.service;

import com.gabriel.pacientes.model.Paciente;
import com.gabriel.pacientes.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImplementation implements PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteServiceImplementation(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public List<Paciente> getAllPacientes() {
        List<Paciente> allPacients = pacienteRepository.findAll();
        return allPacients;
    }

    @Override
    public Paciente getPacienteById(Integer id) {
        Paciente particularPaciente = pacienteRepository.getReferenceById(id);
        return particularPaciente;
    }

    @Override
    public Paciente createPaciente(Paciente paciente) {
        Paciente createdPaciente = pacienteRepository.save(paciente);
        return createdPaciente;
    }

    @Override
    public Paciente updatePaciente(Paciente paciente) {
        Paciente updatedPaciente = pacienteRepository.save(paciente);
        return updatedPaciente;
    }

    @Override
    public void deletePacienteById(Integer id) {
        pacienteRepository.deleteById(id);
    }
}
