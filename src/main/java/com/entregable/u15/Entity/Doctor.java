package com.entregable.u15.Entity;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity(name="doctor")
@Table(name="doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDoctor;
    private String name;
    private String surname;
    private String email;
    private String consultingRoom;

    @ManyToOne
    @JoinColumn(name = "speciality")
    private Speciality speciality;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;
    
    public Doctor() {
    }

    public Doctor(String name, String surname, String email, String consultingRoom, Speciality speciality) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.consultingRoom = consultingRoom;
        this.speciality = speciality;
    }

    public long getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(long idDoctor) {
        this.idDoctor = idDoctor;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConsultingRoom() {
        return consultingRoom;
    }

    public void setConsultingRoom(String consultingRoom) {
        this.consultingRoom = consultingRoom;
    }
  
}
