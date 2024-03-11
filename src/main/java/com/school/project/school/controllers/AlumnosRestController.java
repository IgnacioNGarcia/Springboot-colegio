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
    public List<AlumnoDto> showAll(){
        return service.findAll().stream().map(a->{
            AlumnoDto alumnoDto = new AlumnoDto(a.getNombre(),a.getApellido(),a.getEdad());
            return alumnoDto;
        }).toList();
    }
    @GetMapping("/dni/{dni}")
    public AlumnoDto searchAlumno(@PathVariable(name = "dni") Integer dni){
        Alumno alumno = service.findByDni(dni);
        AlumnoDto alumnoDto = new AlumnoDto(alumno.getNombre(),alumno.getApellido(),alumno.getEdad());

        return alumnoDto;
    }
    
}
