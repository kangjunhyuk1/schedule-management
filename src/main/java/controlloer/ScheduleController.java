package controlloer;

import dto.ScheduleResponsDto;
import entity.Schedule;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.ScheduleService;


import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    private final ScheduleService scheduleService;

    private ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping
    public ResponseEntity<List<ScheduleResponsDto>> findAll(@RequestParam(value =  "workerName") String workerName, String modifiedDate) {
        return new ResponseEntity<>(scheduleService.findAll(), HttpStatus.OK);
    }
}
