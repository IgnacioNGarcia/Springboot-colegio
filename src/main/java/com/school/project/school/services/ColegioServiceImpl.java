package com.school.project.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.school.models.Alumno;
import com.school.project.school.models.Colegio;
import com.school.project.school.models.Curso;
import com.school.project.school.models.Profesor;
import com.school.project.school.repositories.ColegioRepository;

@Service
public class ColegioServiceImpl implements ColegioService{

    @Autowired
    private ColegioRepository repository;

    @Override
    public Colegio getData() {
        return repository.getData();
    }

    @Override
    public List<Alumno> showAlumnos() {
        return repository.showAlumnos();
    }

    @Override
    public List<Profesor> showProfesores() {
        return repository.showProfesores();
    }

    @Override
    public List<Curso> showCursos() {
        return repository.showCursos();
    }

}
