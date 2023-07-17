package com.entregable.u15.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entregable.u15.Dto.AppointmentDto;
import com.entregable.u15.Entity.Appointment;
import com.entregable.u15.Services.AppointmentService;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {
    
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping
    public ResponseEntity<List<Appointment>> getAllAppointments(){
        return ResponseEntity.ok().body(appointmentService.allAppointments());
    }

    @PostMapping
    public ResponseEntity<String> saveAppointment(@RequestBody AppointmentDto appointmentDto){
        int response= appointmentService.saveAppointment(appointmentDto);

            if(response == 0){
                return ResponseEntity.badRequest().body("Especialidad no existente");
            }else if(response == 1){
                return ResponseEntity.badRequest().body("Paciente no registrado");
            }else if(response == 2){
                return  ResponseEntity.badRequest().body("El paciente ya tiene una cita registrada");
            }else if(response ==3){
                return  ResponseEntity.badRequest().body("No hay doctor para esa especialidad actualmente");
            } else{
                return ResponseEntity.ok().body("Cita guardada correctamente");
            }
    }
}
