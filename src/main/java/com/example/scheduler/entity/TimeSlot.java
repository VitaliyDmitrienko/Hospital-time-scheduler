package com.example.scheduler.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "timeslot")
public class TimeSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "doctorid", nullable = false)
    private Doctor doctorID;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime starttimeslot;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime durationtimeslot;

//    @ManyToOne
//    @JoinColumn(name = "patientid", nullable = false)
//    private Patient patientID;
}
