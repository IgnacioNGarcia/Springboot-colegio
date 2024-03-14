package com.school.project.school.dto;

import java.util.List;
import com.school.project.school.models.Materia;

public class CursoDto {
    private Integer id; 
    private String nombre; 
    private List<MateriaDto> materias;

    
    public CursoDto() {
    }

    public CursoDto(Integer id, String nombre, List<MateriaDto> materias) {
        this.id = id;
        this.nombre = nombre;
        this.materias = materias;
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

    public List<MateriaDto> getMaterias() {
        return materias;
    }

    public void setMaterias(List<MateriaDto> materias) {
        this.materias = materias;
    }
}
