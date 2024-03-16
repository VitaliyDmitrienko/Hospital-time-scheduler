package com.example.scheduler.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
public class PatientDTO {
    private Long id;
    private String family;
    private String firstName;
    private String secondName;
    private LocalDate patientBirthDate;
}
