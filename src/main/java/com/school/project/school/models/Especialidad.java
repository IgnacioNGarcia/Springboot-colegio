package com.school.project.school.models;

import java.util.List;

public class Especialidad {
    private String nombre;
    private Integer duracion;
    private List<Curso> cursos;

    public Especialidad() {
    }

    public Especialidad(String nombre, Integer duracion, List<Curso> cursos) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.cursos = cursos;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getDuracion() {
        return duracion;
    }
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    public List<Curso> getCursos() {
        return cursos;
    }
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    
}
