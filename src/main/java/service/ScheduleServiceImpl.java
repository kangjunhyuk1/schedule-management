package service;


import dto.ScheduleResponsDto;
import entity.Schedule;
import org.springframework.stereotype.Service;
import repository.ScheduleRepository;

import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService{

    private final ScheduleRepository scheduleRepository;

    public ScheduleServiceImpl (ScheduleRepository scheduleRepository) {
        this.scheduleRepository = scheduleRepository;
    }

    @Override
    public List<ScheduleResponsDto> findAll() {
        return scheduleRepository.findAll();
    }
}
