package com.school.project.school.repositories;

import java.util.List;

import com.school.project.school.models.Alumno;
import com.school.project.school.models.Curso;

public interface CursoRepository {

    List<Curso> findAll();
    Curso findById(Integer id);
    List<Alumno> findAlumnsByCourseId(Integer id);
    
}
