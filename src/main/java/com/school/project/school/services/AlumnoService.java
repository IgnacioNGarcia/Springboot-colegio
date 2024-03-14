package com.school.project.school.services;

import java.util.List;

import com.school.project.school.models.Alumno;

public interface AlumnoService {
    List<Alumno> findAll();
    Alumno findByDni(Integer dni);
}
