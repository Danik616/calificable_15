package com.entregable.u15.Services;

import java.util.List;

import com.entregable.u15.Dto.DoctorDto;
import com.entregable.u15.Entity.Doctor;

public interface IDoctorService {
    
    public List<Doctor> allDoctors();

    public int saveDoctor(DoctorDto doctorDto);
}
