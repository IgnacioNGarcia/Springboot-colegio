package com.school.project.school.repositories;

import java.util.List;

import com.school.project.school.models.Alumno;
import com.school.project.school.models.Colegio;
import com.school.project.school.models.Curso;
import com.school.project.school.models.Profesor;

public interface ColegioRepository {
    Colegio getData();
    List<Alumno> findAlumnos();
    List<Profesor> findProfesores();
    List<Curso> findCursos();
    
}
