package org.example.schedule.entity;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Schedule {

    // id, 비밀번호, 스케줄, 일정, 작성자 이름, 색깔,
    private Long id;
    private String password;
    private String task;
    private String workerName;
    private String titleColor;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
