package com.entregable.u15.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregable.u15.Dto.DoctorDto;
import com.entregable.u15.Entity.Doctor;
import com.entregable.u15.Entity.Speciality;
import com.entregable.u15.Repository.DoctorRepository;
import com.entregable.u15.Repository.SpecialityRepository;

@Service
public class DoctorService implements IDoctorService{
    @Autowired
    public DoctorRepository doctorRepository;

    @Autowired
    public SpecialityRepository specialityRepository;

    @Override
    public List<Doctor> allDoctors(){
        return doctorRepository.findAll();
    }

    @Override
    public int saveDoctor(DoctorDto doctorDto){
        Speciality speciality=specialityRepository.findById(doctorDto.getSpeciality());
        if(speciality == null){
            return 0;
        }

        Doctor existingDoctor= doctorRepository.findByEmail(doctorDto.getEmail());
        if (existingDoctor != null){
            return 1;
        }

        Doctor doctorSaved= new Doctor(doctorDto.getName(), doctorDto.getSurname() , doctorDto.getEmail(), doctorDto.getConsultingRoom(), speciality);
        doctorRepository.save(doctorSaved);

        return 2;
    }
}
