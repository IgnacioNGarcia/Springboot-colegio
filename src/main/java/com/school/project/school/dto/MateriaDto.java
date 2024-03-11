package com.school.project.school.dto;

import java.util.List;

public class MateriaDto {
    private String nombre;
    private Integer id; 
    private List<ProfesorDto> profesores;

    
    public MateriaDto() {
    }

    public MateriaDto(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public MateriaDto(String nombre, Integer id, List<ProfesorDto> profesores) {
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
    public List<ProfesorDto> getProfesores() {
        return profesores;
    }
    public void setProfesores(List<ProfesorDto> profesores) {
        this.profesores = profesores;
    }

    
}
