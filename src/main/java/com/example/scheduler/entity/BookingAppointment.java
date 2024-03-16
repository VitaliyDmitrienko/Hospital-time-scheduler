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
@Table(name = "bookingappointment",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "timeslotid", "patientid" }) })
public class BookingAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
//    @Column(unique=true)
    @JoinColumn(name = "timeslotid", referencedColumnName = "id", nullable = false)
    private TimeSlot timeslotID;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patientid", referencedColumnName = "id", nullable = false)
    private Patient patientID;

}