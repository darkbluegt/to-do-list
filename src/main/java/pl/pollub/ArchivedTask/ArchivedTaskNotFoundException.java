package pl.pollub.ArchivedTask;

public class ArchivedTaskNotFoundException extends RuntimeException {

    public ArchivedTaskNotFoundException(ArchivedTask task) {
        super("Archived task not found: " + task.toString());
    }

    public ArchivedTaskNotFoundException(int id) {
        super("Archived task with id: " + id + " not found.");
    }
}