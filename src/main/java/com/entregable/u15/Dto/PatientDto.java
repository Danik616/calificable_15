package com.entregable.u15.Dto;

public class PatientDto {
    private String name;
    private String surname;
    private long dni;
    private int age;
    private long tel;
    
    public PatientDto(String name, String surname, long dni, int age, long tel) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.age = age;
        this.tel = tel;
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

    
}
