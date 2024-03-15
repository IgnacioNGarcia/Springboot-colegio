package com.school.project.school.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.project.school.models.Alumno;
import com.school.project.school.models.Colegio;
import com.school.project.school.models.Curso;
import com.school.project.school.models.Profesor;
@Repository
public class ColegioRepositoryImpl implements ColegioRepository{
    @Autowired
    private Colegio colegio = new Colegio();
    
    @Override
    public Colegio getData() {
        return colegio;
    }

    @Override
    public List<Alumno> findAlumnos() {
        return colegio.getAlumnos();
    }

    @Override
    public List<Profesor> findProfesores() {
        return colegio.getProfesores();
    }

    @Override
    public List<Curso> findCursos() {
        return colegio.getCursos();
    }
    

}
