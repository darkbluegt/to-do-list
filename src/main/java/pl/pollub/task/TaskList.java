package pl.pollub.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.pollub.ArchivedTask.ArchivedTask;
import pl.pollub.ArchivedTask.ArchivedTaskList;

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

    public Task restore(ArchivedTask archivedTask){
        Task restoredTask = new Task(archivedTask.getId(), archivedTask.getContent(), archivedTask.getAddedDate());
        tasks.add(restoredTask);
        return restoredTask;
    }

    public Task findById(int id){
        for(Task task : tasks){
            if(task.getId() == id)
                return task;
        }
        throw new TaskNotFoundException(id);
    }
}
