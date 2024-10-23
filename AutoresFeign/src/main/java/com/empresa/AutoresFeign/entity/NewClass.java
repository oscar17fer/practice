package com.empresa.AutoresFeign.entity;

import jakarta.persistence.Entity;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewClass {

    private Long IDunico;
    private String nombre_completo;
    private LocalDate fecha_nacimiento;

}
