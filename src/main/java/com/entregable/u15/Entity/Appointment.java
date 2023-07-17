package com.entregable.u15.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name="cita")
@Table(name="cita")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCita;

    @ManyToOne
    @JoinColumn(name = "speciality")
    private Speciality speciality;

    @ManyToOne
    @JoinColumn(name = "doctor")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient")
    private Patient patient;

    public Appointment() {
    }

    public Appointment(Speciality speciality, Doctor doctor, Patient patient) {
        this.speciality = speciality;
        this.doctor = doctor;
        this.patient = patient;
    }

    public long getIdCita() {
        return idCita;
    }

    public void setIdCita(long idCita) {
        this.idCita = idCita;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
}
