package service;

import dto.ScheduleResponsDto;
import entity.Schedule;

import java.util.List;

public interface ScheduleService {
    List<ScheduleResponsDto> findAll();
}
