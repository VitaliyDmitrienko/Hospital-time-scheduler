package com.example.scheduler.entity;

import jakarta.persistence.*;
import lombok.*;

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
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

//    @GeneratedValue(generator = "uuid2")
//    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
//    @Column(name = "uuid")
//    @Column(name = "uuid", columnDefinition = "VARCHAR(255)")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "family")
    private String family;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "secondname")
    private String secondName;

    @OneToMany(mappedBy="patientID")
    private List<BookingAppointment> bookingAppointmentList = new ArrayList<>();
}
