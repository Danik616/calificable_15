package com.entregable.u15.Services;

import java.util.List;

import com.entregable.u15.Dto.AppointmentDto;
import com.entregable.u15.Entity.Appointment;

public interface IAppointmentService {

    public List<Appointment> allAppointments();

    public int saveAppointment(AppointmentDto appointmentDto);
}
