package org.example.schedule.repository;


import org.example.schedule.dto.ScheduleResponseDto;

import java.util.List;

public interface ScheduleRepository {
    List<ScheduleResponseDto> findAll(String workerName, String modifiedDate);
}
