package com.example.scheduler.repository;

import com.example.scheduler.entity.BookingAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingAppointmentRepository extends JpaRepository <BookingAppointment, BookingAppointment.BookingAppointmentId> {
}
