package org.example.schedule.controlloer;

import org.example.schedule.dto.ScheduleResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.example.schedule.service.ScheduleService;


import java.util.List;

@RestController
@RequestMapping("/schedules")
public class ScheduleController {

    private final ScheduleService scheduleService;

    private ScheduleController(ScheduleService scheduleService) {
        this.scheduleService = scheduleService;
    }

    @GetMapping
    public ResponseEntity<List<ScheduleResponseDto>> findAll(@RequestParam(value =  "workerName", required = false) String workerName,
                                                             @RequestParam(value = "modifiedDate", required = false) String modifiedDate) {
        return new ResponseEntity<>(scheduleService.findAll(workerName, modifiedDate), HttpStatus.OK);
    }
}
