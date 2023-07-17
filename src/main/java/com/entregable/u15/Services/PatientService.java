package com.entregable.u15.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregable.u15.Dto.PatientDto;
import com.entregable.u15.Entity.Patient;
import com.entregable.u15.Repository.PatientRepository;

@Service
public class PatientService implements IPatientService{

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> allPatients(){
        return patientRepository.findAll();
    }

    @Override
    public boolean savePatient(PatientDto patient) {
        Patient existingPatient=patientRepository.findByDni(patient.getDni());
        if(existingPatient != null){
            return false;
        }

        Patient newPatient=new Patient(patient.getName(), patient.getSurname(), patient.getDni(), patient.getAge(), patient.getTel());
        patientRepository.save(newPatient);
        return true;
    }
}
