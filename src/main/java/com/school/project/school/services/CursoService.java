package com.school.project.school.services;

import java.util.List;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.dto.CursoDto;
import com.school.project.school.models.Alumno;
import com.school.project.school.models.Curso;

public interface CursoService {
    List<Curso> findAll();
    Curso findById(Integer id);
    List<Alumno> findAlumnsByCourseId(Integer id);
    List<CursoDto> findAllDto();
    CursoDto findByIdDto(Integer id);
    List<AlumnoDto> findAlumnsByCourseIdDto(Integer id);
}
