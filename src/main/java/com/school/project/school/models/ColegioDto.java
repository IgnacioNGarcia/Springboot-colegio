package com.school.project.school.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.dto.CursoDto;
import com.school.project.school.dto.ProfesorDto;

public class ColegioDto {

    @Value("${colegio.nombre}")
    private String nombre;
    @Value("${colegio.direccion}")
    private String direccion;

    @Autowired
    private List<CursoDto> cursos;

    @Autowired
    private List<AlumnoDto> alumnos;

    @Autowired
    private List<ProfesorDto> profesores;

    public ColegioDto() {
    }
    public ColegioDto(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public ColegioDto(String nombre, String direccion, List<CursoDto> cursos, List<AlumnoDto> alumnos,
            List<ProfesorDto> profesores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cursos = cursos;
        this.alumnos = alumnos;
        this.profesores = profesores;
    }

    public List<AlumnoDto> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<AlumnoDto> alumnos) {
        this.alumnos = alumnos;
    }

    public List<ProfesorDto> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<ProfesorDto> profesores) {
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
    public List<CursoDto> getCursos() {
        return cursos;
    }
    public void setCursos(List<CursoDto> cursos) {
        this.cursos = cursos;
    }

    
}
