package pl.pollub.ArchivedTask;

import org.springframework.stereotype.Component;
import pl.pollub.task.NewTask;
import pl.pollub.task.Task;
import pl.pollub.task.TaskNotFoundException;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class ArchivedTaskList {

    private final List<ArchivedTask> tasks = new ArrayList<>();

    public ArchivedTask add(Task task){
        ArchivedTask created = new ArchivedTask(
                task.getId(), task.getContent(),
                task.getAddedDate(), Calendar.getInstance().getTime());
        tasks.add(created);
        return created;
    }

    public List<ArchivedTask> getAllTasks() {
        return tasks;
    }

    public boolean remove(ArchivedTask task) {
        return tasks.remove(task);
    }

    public ArchivedTask findById(int id){
        for(ArchivedTask archivedTask : tasks){
            if(archivedTask.getId() == id)
                return archivedTask;
        }
        throw new ArchivedTaskNotFoundException(id);
    }
}
