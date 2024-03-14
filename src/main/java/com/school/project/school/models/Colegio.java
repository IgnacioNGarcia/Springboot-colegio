package com.school.project.school.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Colegio {

    @Value("${colegio.nombre}")
    private String nombre;
    @Value("${colegio.direccion}")
    private String direccion;

    @Autowired
    private List<Curso> cursos;

    @Autowired
    private List<Alumno> alumnos;

    @Autowired
    private List<Profesor> profesores;

    public Colegio() {
    }
    public Colegio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Colegio(String nombre, String direccion, List<Curso> cursos, List<Alumno> alumnos,
            List<Profesor> profesores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cursos = cursos;
        this.alumnos = alumnos;
        this.profesores = profesores;
    }



    public List<Alumno> getAlumnos() {
        return alumnos;
    }



    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }



    public List<Profesor> getProfesores() {
        return profesores;
    }



    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }



    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public List<Curso> getCursos() {
        return cursos;
    }
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    
}
