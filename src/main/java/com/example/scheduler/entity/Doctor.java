package com.example.scheduler.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "family")
    private String family;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "secondname")
    private String secondName;

//    @OneToMany(mappedBy="doctorID")
//    private List<BookingAppointment> bookingAppointmentList = new ArrayList<>();

    @OneToMany(mappedBy = "doctorID")
    private List<TimeSlot> timeSlotList = new ArrayList<>();
}
