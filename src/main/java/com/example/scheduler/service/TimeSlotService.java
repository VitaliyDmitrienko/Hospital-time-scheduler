package com.example.scheduler.service;

import com.example.scheduler.component.CustomMapper;
import com.example.scheduler.dto.TimeSlotDTO;
import com.example.scheduler.exception.UserNotFoundException;
import com.example.scheduler.repository.TimeSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class TimeSlotService {
    @Autowired
    private final TimeSlotRepository timeSlotRepository;
    @Autowired
    private CustomMapper customMapper;

    @Autowired
    private TimeSlotService (TimeSlotRepository timeSlotRepository) {
        this.timeSlotRepository = timeSlotRepository;
    }

    public TimeSlotDTO getTimeSot (Long id) {
        var timeSlot = timeSlotRepository.findById(id).
                orElseThrow(() -> new UserNotFoundException("User with ID=" + id + " not found / not exist."));
        var timeSlotDTO = customMapper.map(timeSlot, TimeSlotDTO.class);
        return timeSlotDTO;
    }
}
