package com.school.project.school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.dto.CursoDto;
import com.school.project.school.dto.ProfesorDto;
import com.school.project.school.models.ColegioDto;
import com.school.project.school.services.ColegioService;

@RequestMapping("/api/colegio")
@RestController
public class ColegioRestController {

    @Autowired
    private ColegioService service;

    @GetMapping("/data")
    public ColegioDto getData(){
        return service.getData();
    }
    @GetMapping("/alumnos")
    public List<AlumnoDto> showAlumnos(){
        return service.showAlumnos();
    }
    @GetMapping("/profesores")
    public List<ProfesorDto> showProfesores(){
        return service.showProfesores();
    }
    @GetMapping("/cursos")
    public List<CursoDto> showCursos(){
        return service.showCursos();
    }

    //Hacer con DTOS. 
}
