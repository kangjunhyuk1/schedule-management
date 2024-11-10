package org.example.schedule.service;


import org.example.schedule.dto.ScheduleResponseDto;
import org.springframework.stereotype.Service;
import org.example.schedule.repository.ScheduleRepository;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl (ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<ScheduleResponseDto> findAll(String workerName, String modifiedDate) {
        return scheduleRepository.findAll();
    }
}
