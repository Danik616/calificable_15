package com.entregable.u15.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entregable.u15.Dto.PatientDto;
import com.entregable.u15.Entity.Patient;
import com.entregable.u15.Services.PatientService;

@RestController
@RequestMapping("/api/patient")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatients(){
        return ResponseEntity.ok().body(patientService.allPatients());
    }

    @PostMapping
    public ResponseEntity<String> savePatient(@RequestBody PatientDto patientDto){
        boolean response= patientService.savePatient(patientDto);
        if(response == true){
            return ResponseEntity.accepted().body("Paciente guardado correctamente");
        }else{
            return ResponseEntity.badRequest().body("Paciente ya existente");
        }
    }
}
