package com.arquitect.arq.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="conductores")
public class Conductor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nombre;
    String apellido;
    String run;
    String enViaje;
    int edad;
    String aniosEmpleo; //anios_empleo
    int amonestaciones;
    String localidad;

    public Conductor(){

    }

    public Conductor(int id,String nombre, String apellido, String run, String enViaje, int edad, String aniosEmpleado, int amonestaciones, String localidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.enViaje = enViaje;
        this.edad = edad;
        this.aniosEmpleo = aniosEmpleado;
        this.amonestaciones = amonestaciones;
        this.localidad = localidad;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getEnViaje() {
        return enViaje;
    }

    public void setEnViaje(String enViaje) {
        this.enViaje = enViaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAniosEmpleo() {
        return aniosEmpleo;
    }

    public void setAniosEmpleo(String aniosEmpleo) {
        this.aniosEmpleo = aniosEmpleo;
    }

    public int getAmonestaciones() {
        return amonestaciones;
    }

    public void setAmonestaciones(int amonestaciones) {
        this.amonestaciones = amonestaciones;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }



}


