package com.example.scheduler.dto;

import com.example.scheduler.entity.TimeSlot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingAppointmentDTO {
    private Long id;
    private Long timeslotID;
    private Long patientID;
}
