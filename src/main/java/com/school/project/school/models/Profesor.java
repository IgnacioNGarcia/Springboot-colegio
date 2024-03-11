package com.school.project.school.models;

import java.time.LocalDate;

public class Profesor extends Persona{
    private Double sueldo;

    public Profesor(String nombre, String apellido, Integer dni, Integer edad, LocalDate fechaNacimiento,
             Double sueldo) {
        super(nombre, apellido, dni, edad, fechaNacimiento);
        this.sueldo = sueldo;
    }

    



    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    
}
