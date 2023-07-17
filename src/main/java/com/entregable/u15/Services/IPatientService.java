package com.entregable.u15.Services;

import java.util.List;

import com.entregable.u15.Dto.PatientDto;
import com.entregable.u15.Entity.Patient;

public interface IPatientService {
    
    public List<Patient> allPatients();

    public boolean savePatient(PatientDto patient);
}
