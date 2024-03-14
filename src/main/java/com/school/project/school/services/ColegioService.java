package com.school.project.school.services;

import java.util.List;

import com.school.project.school.models.Alumno;
import com.school.project.school.models.Colegio;
import com.school.project.school.models.Curso;
import com.school.project.school.models.Profesor;

public interface ColegioService {
    Colegio getData();
    List<Alumno> showAlumnos();
    List<Profesor> showProfesores();
    List<Curso> showCursos();
}
