package com.gabriel.pacientes.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Paciente")
public class Paciente {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer money;

}
