package com.school.project.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.school.models.Alumno;
import com.school.project.school.repositories.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    @Autowired
    private AlumnoRepository repository;

    @Override
    public List<Alumno> findAll() {
        return repository.findAll();        
    }

    @Override
    public Alumno findByDni(Integer dni) {
        return repository.findByDni(dni);
    }

}
