package com.school.project.school.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
                
        
            // // Assign alumnos to specific courses based on your criteria
            // if (alumno.getName().equals("Ignacio")) {
            //     alumno.setCourses(Arrays.asList(cursosColegio.get(0))); // Subscribe Ignacio to "Ingenieria Software"
            // } else if (alumno.getName().equals("Micaela")) {
            //     alumno.setCourses(Arrays.asList(cursosColegio.get(1))); // Subscribe Micaela to "Diseño"
            // } else {
            //     // Handle other alumnos as needed
            // }
        }
    }
}
