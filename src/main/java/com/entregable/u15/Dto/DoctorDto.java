package com.entregable.u15.Dto;

public class DoctorDto {
    private String name;
    private String surname;
    private int speciality;
    private String email;
    private String consultingRoom;
    
    public DoctorDto(String name, String surname, int speciality, String email, String consultingRoom) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.email = email;
        this.consultingRoom = consultingRoom;
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

    public int getSpeciality() {
        return speciality;
    }

    public void setSpeciality(int speciality) {
        this.speciality = speciality;
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
