package pl.pollub.task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
public class Task {

    protected final int id;

    protected final String content;

    protected final Date addedDate;
}
