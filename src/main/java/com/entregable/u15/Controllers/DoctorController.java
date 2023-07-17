package com.entregable.u15.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entregable.u15.Dto.DoctorDto;
import com.entregable.u15.Entity.Doctor;
import com.entregable.u15.Services.DoctorService;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    public final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping
    public ResponseEntity<List<Doctor>> getAllDoctors(){
        return ResponseEntity.ok().body(doctorService.allDoctors());
    } 

    @PostMapping
    public ResponseEntity<String> saveDoctor(@RequestBody DoctorDto doctorDto){
        int response = doctorService.saveDoctor(doctorDto);
        if(response == 0){
            return ResponseEntity.badRequest().body("Especialidad no encontrada");
        }else if(response == 1){
            return ResponseEntity.badRequest().body("Correo ya registrado");
        }else{
            return ResponseEntity.accepted().body("Doctor guardado correctamente");
        }
        
    }
}
