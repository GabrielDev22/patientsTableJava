package com.gabriel.pacientes.controller;

import com.gabriel.pacientes.model.Paciente;
import com.gabriel.pacientes.service.PacienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paciente")

public class PacienteController {
    private final PacienteService pacienteService;

    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping("/getAll")
    public List<Paciente> getAllPacientes() {
        return pacienteService.getAllPacientes();
    }

    @GetMapping("/get/{id}")
    public Paciente getPacienteById(@PathVariable Integer id) {
        return pacienteService.getPacienteById(id);
    }

    @PostMapping("/create")
    public Paciente createPaciente(@RequestBody Paciente paciente) {
       return pacienteService.createPaciente(paciente);
    }

    @PutMapping("/update")
    public Paciente updatePaciente(@RequestBody Paciente paciente) {
        return pacienteService.updatePaciente(paciente);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePacienteById(@PathVariable Integer id) {
        pacienteService.deletePacienteById(id);
    }

}
