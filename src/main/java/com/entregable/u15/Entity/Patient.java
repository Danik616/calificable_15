package com.entregable.u15.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name="paciente")
@Table(name="paciente")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPaciente;

    private String name;
    private String surname;
    private long dni;
    private int age;
    private long tel;

    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
    
    public Patient(String name, String surname, long dni, int age, long tel) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.age = age;
        this.tel = tel;
    }

    public Patient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getTel() {
        return tel;
    }

    public void setTel(long tel) {
        this.tel = tel;
    }



    public long getIdPaciente() {
        return idPaciente;
    }



    public void setIdPaciente(long idPaciente) {
        this.idPaciente = idPaciente;
    }

    
}
