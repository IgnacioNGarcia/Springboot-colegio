package com.school.project.school.models;

import java.util.List;

public class Colegio {
    private String nombre;
    private String direccion;
    private List<Especialidad> especialidades;
    private List<Alumno> alumnos;
    private List<Profesor> profesores;

    public Colegio() {
    }
    
    

    public Colegio(String nombre, String direccion, List<Especialidad> especialidades, List<Alumno> alumnos,
            List<Profesor> profesores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidades = especialidades;
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
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }
    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    
}
