package repository;


import dto.ScheduleRequestDto;

import java.util.List;

public interface ScheduleRepository {
    List<ScheduleRequestDto> findAll();
}
