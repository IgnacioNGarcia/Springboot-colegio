package com.school.project.school.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.project.school.models.Alumno;
import com.school.project.school.models.Colegio;
import com.school.project.school.models.Curso;
import com.school.project.school.models.Profesor;
import com.school.project.school.services.ColegioService;

@RequestMapping("/api/colegio")
@RestController
public class ColegioRestController {

    @Autowired
    private ColegioService service;

    @GetMapping("/data")
    public Colegio getData(){
        return service.getData();
    }
    @GetMapping("/alumnos")
    public List<Alumno> showAlumnos(){
        return service.showAlumnos();
    }
    @GetMapping("/profesores")
    public List<Profesor> showProfesores(){
        return service.showProfesores();
    }
    @GetMapping("/cursos")
    public List<Curso> showCursos(){
        return service.showCursos();
    }

    //Hacer con DTOS. 
}
