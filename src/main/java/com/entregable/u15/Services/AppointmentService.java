package com.entregable.u15.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entregable.u15.Dto.AppointmentDto;
import com.entregable.u15.Entity.Appointment;
import com.entregable.u15.Entity.Doctor;
import com.entregable.u15.Entity.Patient;
import com.entregable.u15.Entity.Speciality;
import com.entregable.u15.Repository.AppointmentRepository;
import com.entregable.u15.Repository.DoctorRepository;
import com.entregable.u15.Repository.PatientRepository;
import com.entregable.u15.Repository.SpecialityRepository;

@Service
public class AppointmentService implements IAppointmentService{
    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private SpecialityRepository specialityRepository;

    @Override
    public List<Appointment> allAppointments(){
        return appointmentRepository.findAll();
    }

    @Override
    public int saveAppointment(AppointmentDto appointmentDto){
        Speciality speciality= specialityRepository.findById(appointmentDto.getSpeciality());
        Patient exisPatient= patientRepository.findByDni(appointmentDto.getDni());
        if (speciality == null){
            return 0;
        }
        if(exisPatient == null){
            return 1;
        }

        Appointment exisAppointment=appointmentRepository.getAppointmentByPatientAndId(exisPatient.getIdPaciente(), speciality.getIdSpeciality());
        if(exisAppointment != null){
            return 2;
        }

        List<Doctor> doctors=doctorRepository.obtenerDoctoresPorEspecialidad(speciality.getIdSpeciality());
        if(doctors.isEmpty()){
            return 3;
        }

        Doctor doctor = doctors.get((int) (Math.random() * doctors.size()));

        Appointment appointment=new Appointment(speciality, doctor, exisPatient);
        appointmentRepository.save(appointment);

        return 4;
    }
}
