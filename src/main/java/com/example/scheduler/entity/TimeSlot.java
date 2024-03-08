package com.example.scheduler.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Transient;

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
    private LocalDateTime startTimeSlot;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime durationTimeSlot;

    @ManyToOne
    @JoinColumn(name = "patientid", nullable = false)
    private Patient patientID;
}
