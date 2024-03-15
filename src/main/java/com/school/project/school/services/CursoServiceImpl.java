package com.school.project.school.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.dto.CursoDto;
import com.school.project.school.models.Alumno;
import com.school.project.school.models.Curso;

import com.school.project.school.repositories.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository repository;

    @Autowired 
    private ModelMapper modelMapper;

    @Override
    public List<Curso> findAll() {

        return repository.findAll();
    }

    @Override
    public Curso findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public List<Alumno> findAlumnsByCourseId(Integer id) {
        return repository.findAlumnsByCourseId(id);
    }

    @Override
     public List<CursoDto> findAllDto() {
        List<Curso> cursos = repository.findAll();
        return cursos.stream().map(c -> {
            return modelMapper.map(c, CursoDto.class);
        }).toList();
    }

    @Override
    public CursoDto findByIdDto(Integer id) {
        Curso curso = repository.findById(id);
        return modelMapper.map(curso, CursoDto.class);
     }

    @Override
    public List<AlumnoDto> findAlumnsByCourseIdDto(Integer id) {
        List<Alumno> alumnos = repository.findAlumnsByCourseId(id);
        return alumnos.stream().map(a -> {
            return modelMapper.map(a, AlumnoDto.class);
        }).toList();
    }

}
