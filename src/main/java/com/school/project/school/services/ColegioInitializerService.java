package com.school.project.school.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.school.project.school.models.Alumno;

public class ColegioInitializerService {
    @Autowired
    private List<Alumno> alumnos;
}
