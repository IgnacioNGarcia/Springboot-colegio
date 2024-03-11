package com.school.project.school.models;

import java.util.List;

public class Materia {
    private String nombre;
    private Integer id; 
    private List<Profesor> profesores;

    
    public Materia() {
    }

    public Materia(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Materia(String nombre, Integer id, List<Profesor> profesores) {
        this.nombre = nombre;
        this.id = id;
        this.profesores = profesores;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public List<Profesor> getProfesores() {
        return profesores;
    }
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    
}
