package com.school.project.school.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.dto.CursoDto;
import com.school.project.school.dto.ProfesorDto;
import com.school.project.school.models.Alumno;
import com.school.project.school.models.Colegio;
import com.school.project.school.models.ColegioDto;
import com.school.project.school.models.Curso;
import com.school.project.school.models.Profesor;
import com.school.project.school.repositories.ColegioRepository;

@Service
public class ColegioServiceImpl implements ColegioService{

    @Autowired
    private ColegioRepository repository;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ColegioDto getData() {
        return modelMapper.map(repository.getData(), ColegioDto.class);
    }

    @Override
    public List<AlumnoDto> showAlumnos() {
        return repository.findAlumnos().stream().map(a -> {
            return modelMapper.map(a, AlumnoDto.class);
        }).toList();
    }

    @Override
    public List<ProfesorDto> showProfesores() {
        return repository.findProfesores().stream().map(p ->{
            return modelMapper.map(p, ProfesorDto.class);
        }).toList();
    }

    @Override
    public List<CursoDto> showCursos() {
        return repository.findCursos().stream().map(c ->{
            return modelMapper.map(c, CursoDto.class);
        }).toList();
    }

}
