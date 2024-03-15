package com.school.project.school.repositories;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.school.project.school.models.Alumno;

@Repository
public class AlumnoRepositoryImpl implements AlumnoRepository{

    @Autowired
    private List<Alumno> data; 


    @Override
    public List<Alumno> findAll() {
        return data;
    }

    @Override
    public Alumno findByDni(Integer dni) {
        return data.stream().filter(a -> a.getDni().equals(dni)).findFirst().orElse(null);
    }

}
