package com.entregable.u15.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entregable.u15.Entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long>{
    
    @Query("FROM doctor WHERE speciality = :speciality")
    public List<Doctor> obtenerDoctoresPorEspecialidad(@Param(value="speciality")int speciality);

    @Query("FROM doctor WHERE idDoctor= :id")
    public Doctor findById(@Param(value="id")long id);

    @Query("FROM doctor WHERE email= :email")
    public Doctor findByEmail(@Param(value="email")String email);
}
