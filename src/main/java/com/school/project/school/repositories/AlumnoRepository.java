package com.school.project.school.repositories;

import java.util.List;

import com.school.project.school.models.Alumno;

public interface AlumnoRepository {
    List<Alumno> findAll();
    Alumno findByDni(Integer dni);
}
