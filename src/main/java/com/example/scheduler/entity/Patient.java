package com.example.scheduler.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
//@EqualsAndHashCode
@NoArgsConstructor
//@Builder
//@AllArgsConstructor
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "family")
    private String family;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "secondname")
    private String secondName;

    @Column(name = "birthdate")
    private LocalDateTime patientBirthDate;

    @OneToMany(mappedBy="patientID")
    private List<BookingAppointment> bookingAppointmentList = new ArrayList<>();
}
