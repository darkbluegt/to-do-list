package pl.pollub.task;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class TaskList {

    private final List<Task> tasks = new ArrayList<>();

    private final AtomicInteger counter = new AtomicInteger();

    public Task add(NewTask newTask){
        Task created = new Task(generateId(), newTask.getContent(), Calendar.getInstance().getTime());
        tasks.add(created);
        return created;
    }

    private int generateId() {
        return counter.incrementAndGet();
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public boolean remove(Task task) {
        return tasks.remove(task);
    }

}
