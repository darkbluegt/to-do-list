package pl.pollub.ArchivedTask;

import lombok.*;
import pl.pollub.task.Task;

import java.util.Date;

@ToString
@Getter
@Setter
public class ArchivedTask extends Task {

    private final Date archivedDate;

    public ArchivedTask(int id, String content, Date addedDate, Date archivedDate) {
        super(id, content, addedDate);
        this.archivedDate = archivedDate;
    }
}
