package com.school.project.school.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.dto.CursoDto;
import com.school.project.school.dto.MateriaDto;
import com.school.project.school.dto.ProfesorDto;
import com.school.project.school.models.Curso;
import com.school.project.school.models.Materia;
import com.school.project.school.models.Profesor;
import com.school.project.school.services.CursoService;

@RestController
@RequestMapping("/api/cursos")
public class CursosRestController {

    @Autowired
    private CursoService service;

    @GetMapping("/list")
    public List<CursoDto> showAll(){
        return service.findAllDto();
    }

    @GetMapping("/{id}")
    public CursoDto findById(@PathVariable(name= "id")Integer id){
        return service.findByIdDto(id);
    }
    @GetMapping("/alumnos/{id}")
    public List<AlumnoDto> findCourseAlumns(@PathVariable(name= "id")Integer id){
        
        return service.findAlumnsByCourseIdDto(id);
    }


    @GetMapping("/sindto/{id}")
    public Curso findById2(@PathVariable(name= "id")Integer id){
        

        return service.findById(id);
    }
}
