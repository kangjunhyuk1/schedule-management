package org.example.schedule.service;

import org.example.schedule.dto.ScheduleResponseDto;

import java.util.List;

public interface ScheduleService {
    List<ScheduleResponseDto> findAll(String workerName, String modifiedDate);
}
