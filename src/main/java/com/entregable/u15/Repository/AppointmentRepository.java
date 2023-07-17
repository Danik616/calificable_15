package com.entregable.u15.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entregable.u15.Entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
    
    @Query("FROM cita WHERE speciality.idSpeciality=:speciality and patient.idPaciente=:idPatient")
    public Appointment getAppointmentByPatientAndId(@Param(value="idPatient")long idPatient, @Param(value="speciality")int speciality);
}
