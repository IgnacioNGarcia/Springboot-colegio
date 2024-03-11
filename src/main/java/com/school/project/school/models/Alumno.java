package com.school.project.school.models;

import java.time.LocalDate;


public class Alumno extends Persona{
    private Integer idCurso;
    public Alumno(String nombre, String apellido, Integer dni, Integer edad, LocalDate fechaNacimiento,Integer idCurso) {
        super(nombre, apellido, dni, edad, fechaNacimiento);
        this.idCurso = idCurso;
    }
    public Integer getIdCurso() {
        return idCurso;
    }
    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    
}
