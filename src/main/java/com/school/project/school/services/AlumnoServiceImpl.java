package com.school.project.school.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.models.Alumno;
import com.school.project.school.repositories.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{
    @Autowired
    private AlumnoRepository repository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public List<Alumno> findAll() {
        return repository.findAll();        
    }

    @Override
    public Alumno findByDni(Integer dni) {
        return repository.findByDni(dni);
    }

    @Override
    public AlumnoDto findByDniDto(Integer dni) {
        Alumno alumno = repository.findByDni(dni);
        return modelMapper.map(alumno, AlumnoDto.class);
    }

    @Override
    public List<AlumnoDto> findAllDto() {
        List<Alumno> alumnos = repository.findAll();
        return alumnos.stream().map(a -> {
            return modelMapper.map(a, AlumnoDto.class);
        }).toList();
        
    }

}
