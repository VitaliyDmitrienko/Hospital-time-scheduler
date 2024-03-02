package com.example.sheduler.repository;

import com.example.sheduler.entity.BookingAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingAppointmentRepository extends JpaRepository <BookingAppointment,Long> {
}
