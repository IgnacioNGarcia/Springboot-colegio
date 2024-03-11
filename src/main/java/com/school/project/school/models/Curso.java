package com.school.project.school.models;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private Integer id; 
    private String nombre; 
    private List<Alumno> alumnos = new ArrayList<>(); 
    private List<Materia> materias;

    
    public Curso() {
    }

    public Curso(Integer id, String nombre, List<Materia> materias) {
        this.id = id;
        this.nombre = nombre;
        this.materias = materias;
    }

    public Curso(Integer id, String nombre,List<Alumno> alumnos, List<Materia> materias) {
        this.id = id;
        this.nombre = nombre;
        this.alumnos = alumnos;
        this.materias = materias;
    }

    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public List<Alumno> getAlumnos() {
        return alumnos;
    }


    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }


    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
