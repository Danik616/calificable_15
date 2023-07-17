package com.entregable.u15.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entregable.u15.Entity.Speciality;

public interface SpecialityRepository extends JpaRepository<Speciality, Integer>{
    
    @Query("FROM specialistgi WHERE idSpeciality = :id")
    public Speciality findById(@Param(value ="id")int id);
}
