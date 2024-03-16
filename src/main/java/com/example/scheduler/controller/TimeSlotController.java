package com.example.scheduler.controller;

import com.example.scheduler.dto.TimeSlotDTO;
import com.example.scheduler.entity.TimeSlot;
import com.example.scheduler.service.TimeSlotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TimeSlotController {

    private final TimeSlotService timeSlotService;

    public TimeSlotController(TimeSlotService timeSlotService) {
        this.timeSlotService = timeSlotService;
    }

    @GetMapping("/getTimeSlot/{time_slot_id}")
    @ResponseStatus(HttpStatus.OK)
    TimeSlotDTO restGetTimeSlotById(@PathVariable Long time_slot_id) {
        return timeSlotService.getTimeSot(time_slot_id);
    }
}
