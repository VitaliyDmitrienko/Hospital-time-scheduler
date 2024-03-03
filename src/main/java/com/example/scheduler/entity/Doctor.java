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
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

//    @GeneratedValue(generator = "uuid2")
    @GeneratedValue(strategy = GenerationType.UUID)
//    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
//    @Column(name = "uuid", columnDefinition = "serial")
//    @Column(name = "uuid", columnDefinition = "VARCHAR(255)")
    private UUID id;

    @Column(name = "family")
    private String family;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "secondname")
    private String secondName;

    @OneToMany(mappedBy="doctorID")
    private List<BookingAppointment> bookingAppointmentList = new ArrayList<>();

    @OneToMany(mappedBy = "doctorID")
    private List<TimeSheet> timeSheetList = new ArrayList<>();
}
