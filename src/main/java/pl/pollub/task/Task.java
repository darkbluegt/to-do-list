package pl.pollub.task;

import lombok.Data;

import java.util.Date;

@Data
public class Task {

    private final int id;

    private final String content;

    private final Date addedDate;
}
