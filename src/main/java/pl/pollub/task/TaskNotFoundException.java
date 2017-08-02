package pl.pollub.task;

public class TaskNotFoundException extends RuntimeException {

    public TaskNotFoundException(Task task) {
        super("Task not found: " + task.toString());
    }

    public TaskNotFoundException(int id) {
        super("Task with id: " + id + " not found.");
    }
}
