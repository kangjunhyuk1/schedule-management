package entity;


import lombok.Data;
import repository.ScheduleRepository;

import java.time.LocalDateTime;

@Data
public class Schedule {
    private Long id;
    private String password;
    private String title;
    private String name;
    private String color;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
