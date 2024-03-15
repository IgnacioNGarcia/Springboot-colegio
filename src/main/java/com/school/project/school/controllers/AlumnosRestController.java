package com.school.project.school.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.models.Alumno;
import com.school.project.school.services.AlumnoService;

@RestController
@RequestMapping("/api/alumno")
public class AlumnosRestController {
    @Autowired
    private AlumnoService service;

    
    @GetMapping("/list")
    public List<Alumno> showAll(){
        return service.findAll();
    }
    @GetMapping("/dni/{dni}")
    public Alumno searchAlumno(@PathVariable(name = "dni") Integer dni){
        return service.findByDni(dni);
    }
    @GetMapping("/dto/list")
    public List<AlumnoDto> showAllDto(){
        return service.findAllDto();
    }
    @GetMapping("/dto/dni/{dni}")
    public AlumnoDto searchAlumnoDto(@PathVariable(name = "dni") Integer dni){
        return service.findByDniDto(dni);
    }
    
    
}
