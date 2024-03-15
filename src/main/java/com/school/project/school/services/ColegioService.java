package com.school.project.school.services;

import java.util.List;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.dto.CursoDto;
import com.school.project.school.dto.ProfesorDto;
import com.school.project.school.models.ColegioDto;

public interface ColegioService {
    ColegioDto getData();
    List<AlumnoDto> showAlumnos();
    List<ProfesorDto> showProfesores();
    List<CursoDto> showCursos();
}
