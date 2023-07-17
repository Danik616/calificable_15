package com.entregable.u15.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entregable.u15.Entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long>{

    @Query("FROM paciente WHERE dni = :dni")
    public Patient findByDni(@Param(value="dni")long dni);
    
}
