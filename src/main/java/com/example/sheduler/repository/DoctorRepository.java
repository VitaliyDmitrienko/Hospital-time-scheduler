package com.example.sheduler.repository;

import com.example.sheduler.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends JpaRepository <Doctor, Long> {
//    @Transactional(readOnly = true) Depositor findById (long id);

}
