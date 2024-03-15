package com.school.project.school.repositories;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.project.school.models.Alumno;
import com.school.project.school.models.Curso;

@Repository
public class CursoRepositoryImpl implements CursoRepository{
    
    @Autowired    
    private List<Curso> data;
    
    @Override
    public List<Curso> findAll() {
        return data;
    }

    @Override
    public Curso findById(Integer id) {
        return data.stream().filter(c-> c.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<Alumno> findAlumnsByCourseId(Integer id) {
        Curso curso = data.stream().filter(c-> c.getId().equals(id)).findFirst().orElse(null);
        return curso.getAlumnos();
    }


}
