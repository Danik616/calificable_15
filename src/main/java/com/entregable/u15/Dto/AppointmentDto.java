package com.entregable.u15.Dto;

public class AppointmentDto {
    private int speciality;
    private long dni;
    
    public AppointmentDto() {
    }

    public AppointmentDto(int speciality, long dni) {
        this.speciality = speciality;
        this.dni = dni;
    }

    public int getSpeciality() {
        return speciality;
    }

    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    
}
