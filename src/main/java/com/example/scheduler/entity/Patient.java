package com.example.scheduler.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
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

    @Temporal(TemporalType.DATE)
    @Column(name = "birthdate")
    private LocalDate patientBirthDate;

    @OneToMany(fetch = FetchType.LAZY,mappedBy="patientID")
    private List<BookingAppointment> bookingAppointmentList = new ArrayList<>();
}
