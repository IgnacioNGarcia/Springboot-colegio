package com.school.project.school.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.project.school.dto.AlumnoDto;
import com.school.project.school.dto.CursoDto;
import com.school.project.school.dto.MateriaDto;
import com.school.project.school.dto.ProfesorDto;
import com.school.project.school.models.Alumno;
import com.school.project.school.models.Curso;
import com.school.project.school.models.Materia;
import com.school.project.school.models.Profesor;
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

    // @Override
    // public List<CursoDto> findAllDto() {

    //     List<Curso> cursos = repository.findAll();
    //     List<CursoDto> cursosDtos = new ArrayList<>();

    //     for (Curso curso : cursos) {
    //         CursoDto cursoDto = new CursoDto();
    //         cursoDto.setId(curso.getId());
    //         cursoDto.setNombre(curso.getNombre());
    //         List<MateriaDto> materiasDto = new ArrayList<>();

    //         for (Materia materia : curso.getMaterias()) {
    //             MateriaDto materiaDto = new MateriaDto();
    //             materiaDto.setId(materia.getId());
    //             materiaDto.setNombre(materia.getNombre());
    //             List<ProfesorDto> profesoresDto = new ArrayList<>();

    //             for (Profesor profesor : materia.getProfesores()) {
    //                 ProfesorDto profesorDto = new ProfesorDto();
    //                 profesorDto.setNombre(profesor.getNombre());
    //                 profesorDto.setApellido(profesor.getApellido());
    //                 profesorDto.setEdad(profesor.getEdad());

    //                 profesoresDto.add(profesorDto);
    //             }
    //             materiaDto.setProfesores(profesoresDto);

    //             // Agrega materiaDto a materiasDto
    //             materiasDto.add(materiaDto);
    //         }
    //         cursoDto.setMaterias(materiasDto);
    //         cursosDtos.add(cursoDto);
    //     }
    //     return cursosDtos;
    // }
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




    private List<CursoDto> convertirACursosDto(List<Curso> cursos) {
        List<CursoDto> cursosDtos = new ArrayList<>();
        for (Curso curso : cursos) {
            CursoDto cursoDto = convertirACursoDto(curso);
            cursosDtos.add(cursoDto);
        }
        return cursosDtos;
    }

    private CursoDto convertirACursoDto(Curso curso) {
        CursoDto cursoDto = new CursoDto();
        cursoDto.setId(curso.getId());
        cursoDto.setNombre(curso.getNombre());
        cursoDto.setMaterias(convertirAMateriasDto(curso.getMaterias()));
        return cursoDto;
    }

    private List<MateriaDto> convertirAMateriasDto(List<Materia> materias) {
        List<MateriaDto> materiasDto = new ArrayList<>();
        for (Materia materia : materias) {
            MateriaDto materiaDto = convertirAMateriaDto(materia);
            materiasDto.add(materiaDto);
        }
        return materiasDto;
    }

    private MateriaDto convertirAMateriaDto(Materia materia) {
        MateriaDto materiaDto = new MateriaDto();
        materiaDto.setId(materia.getId());
        materiaDto.setNombre(materia.getNombre());
        materiaDto.setProfesores(convertirAProfesoresDto(materia.getProfesores()));
        return materiaDto;
    }

    private List<ProfesorDto> convertirAProfesoresDto(List<Profesor> profesores) {
        List<ProfesorDto> profesoresDto = new ArrayList<>();
        for (Profesor profesor : profesores) {
            ProfesorDto profesorDto = convertirAProfesorDto(profesor);
            profesoresDto.add(profesorDto);
        }
        return profesoresDto;
    }

    private ProfesorDto convertirAProfesorDto(Profesor profesor) {
        ProfesorDto profesorDto = new ProfesorDto();
        profesorDto.setNombre(profesor.getNombre());
        profesorDto.setApellido(profesor.getApellido());
        profesorDto.setEdad(profesor.getEdad());
        return profesorDto;
    }
    private AlumnoDto convertirAAlumnoDto(Alumno alumno){
        AlumnoDto alumnoDto = new AlumnoDto();
        alumnoDto.setNombre(alumno.getNombre());
        alumnoDto.setApellido(alumno.getApellido());
        alumnoDto.setEdad(alumno.getEdad());
        return alumnoDto;        
    }

    private List<AlumnoDto> convertirAAlumnosDto(List<Alumno> alumnos) {
        List<AlumnoDto> alumnoDtos = new ArrayList<>();
        for (Alumno alumno : alumnos) {
            AlumnoDto alumnoDto = convertirAAlumnoDto(alumno);
            alumnoDtos.add(alumnoDto);
        }
        return alumnoDtos;
    }
    
}
