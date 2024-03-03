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
public class TimeSlot {
    @Transient
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime startSlot;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime durationSlot;
}
