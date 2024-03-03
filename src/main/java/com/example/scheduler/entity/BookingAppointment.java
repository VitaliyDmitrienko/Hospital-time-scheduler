package com.example.scheduler.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
//@EqualsAndHashCode
@NoArgsConstructor
//@Builder
//@AllArgsConstructor
@Table(name = "bookingappointment")
public class BookingAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctorid", nullable = false)
    private Doctor doctorID;

    @ManyToOne
    @JoinColumn(name = "patientid", nullable = false)
    private Patient patientID;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "timeslot")
    private LocalDateTime timeSlot;




}
