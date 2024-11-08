package repository;

import dto.ScheduleRequestDto;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class jdbcTemplateScheduleRepository implements ScheduleRepository{

    private final JdbcTemplate jdbcTemplate;

    public jdbcTemplateScheduleRepository (DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<ScheduleRequestDto> findAll() {
        // 천제 조회하는 쿼리 정의
        return
    }
}
