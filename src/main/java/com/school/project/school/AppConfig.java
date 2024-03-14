package com.school.project.school;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.school.project.school.models.Alumno;
import com.school.project.school.models.Curso;
import com.school.project.school.models.Materia;
import com.school.project.school.models.Profesor;

@Configuration
public class AppConfig {
    @Bean
    List<Materia> materiasColegio(List<Profesor> profesoresColegio){

        return Arrays.asList(
            new Materia("Calculo",2,Arrays.asList(profesoresColegio.get(0))),
            new Materia("Dibujo",1,Arrays.asList(profesoresColegio.get(3))),
            new Materia("Programacion",3,Arrays.asList(profesoresColegio.get(2),profesoresColegio.get(4))),
            new Materia("Diagramacion UML",4,Arrays.asList(profesoresColegio.get(2),profesoresColegio.get(4))),
            new Materia("Diseño frances",5,Arrays.asList(profesoresColegio.get(3)))
        );
    }
    
    @Bean
    @Autowired
    List<Curso> cursosColegio(List<Materia> materiasColegio){
        Map<String, Materia> materiasMapeadas = materiasColegio.stream().collect(Collectors.toMap(Materia::getNombre, materia -> materia));

        return Arrays.asList(
            new Curso(1,"Ingenieria Software",Arrays.asList(materiasMapeadas.get("Calculo"),materiasMapeadas.get("Programacion"))),
            new Curso(2,"Diseño",Arrays.asList(materiasMapeadas.get("Diseño frances"),materiasMapeadas.get("Dibujo")))
        );
    }

    @Bean
    @Autowired
    List<Alumno> alumnosColegio(List<Curso> cursosColegio){     
        Map<String,Curso> cursosMapeados = cursosColegio.stream().collect(Collectors.toMap(Curso::getNombre, curso -> curso));   
        
        List<Alumno> alumnos = Arrays.asList(
            new Alumno("Ignacio", "Garcia", 41047964,25, LocalDate.of(1998, 3,18),1),
            new Alumno("Micaela", "Ducau", 412351,22, LocalDate.of(2000, 3,25),2),
            new Alumno("Alejo", "Steinmeyer", 1231412,25, LocalDate.of(1997, 12,29),1)
        );

        return alumnos;
    }

    @Bean
    List<Profesor> profesoresColegio(){
        return Arrays.asList(
            new Profesor("Benjamin", "Richards", 11231, 30, LocalDate.of(1980,2,21), 500D),
            new Profesor("Judith", "Gaudino", 1123411, 40, LocalDate.of(1970,5,1), 700D),
            new Profesor("Gregorio", "Roque", 214231, 36, LocalDate.of(1985,1,30), 600D),
            new Profesor("Fleur", "Delacleur", 214231, 26, LocalDate.of(1998,3,14), 670D),
            new Profesor("Leandro", "Pinkas", 66666666, 46, LocalDate.of(1930,3,10), 300D)
        );
    }

    @Bean
    ModelMapper getModelMapper(){
        return new ModelMapper();
    }

    
    
}
