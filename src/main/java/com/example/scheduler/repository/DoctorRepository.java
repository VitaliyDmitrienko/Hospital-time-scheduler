package com.example.scheduler.repository;

import com.example.scheduler.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DoctorRepository extends JpaRepository <Doctor, UUID> {
//    @Transactional(readOnly = true) Depositor findById (long id);

}
