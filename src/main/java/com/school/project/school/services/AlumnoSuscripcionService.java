package com.school.project.school.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.school.project.school.models.Alumno;
import com.school.project.school.models.Curso;

import jakarta.annotation.PostConstruct;

@Component
public class AlumnoSuscripcionService {

    @Autowired
    List<Curso> cursosColegio;
    @Autowired
    List<Alumno> alumnosColegio;
    @PostConstruct
    public void subscribeAlumnosToCourses() {
        // Implement your logic to subscribe alumnos to courses here
        for (Alumno alumno : alumnosColegio) {
            
            for (Curso curso : cursosColegio){
                if (alumno.getIdCurso().equals(curso.getId())) {
                    curso.addAlumno(alumno);
                }
            }
                
        }
    }
}
