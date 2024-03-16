package com.example.scheduler.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class TimeSlotDTO {
    private Long id;
    private LocalDateTime starttimeslot;
    private LocalDateTime durationtimeslot;
}
