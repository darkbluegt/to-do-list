package pl.pollub.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.pollub.ArchivedTask.ArchivedTask;

@Controller
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Task addTask(@RequestBody NewTask newTask) {
        return taskService.addNewTask(newTask);
    }

    @RequestMapping(value = "/active", method = RequestMethod.GET)
    public @ResponseBody List<Task> getAllActiveTasks() {
        return taskService.getAllActive();
    }

    @RequestMapping(value = "/archived", method = RequestMethod.GET)
    public @ResponseBody List<ArchivedTask> getAllArchivedTasks() {
        return taskService.getAllArchived();
    }

    @RequestMapping(value = "/archive/{id}", method = RequestMethod.PUT)
    public @ResponseBody ArchivedTask archiveTaskById(@PathVariable int id) throws RuntimeException{
        return taskService.archiveTaskById(id);
    }

    @RequestMapping(value = "/restore/{id}", method = RequestMethod.PUT)
    public @ResponseBody Task restoreArchivedTaskById(@PathVariable int id) throws RuntimeException{
        return taskService.restoreTaskById(id);
    }

    @RequestMapping(value = "/archive/{id}", method = RequestMethod.DELETE)
    public @ResponseBody Task deleteArchivedTaskById(@PathVariable int id) throws RuntimeException{
        return taskService.deleteArchivedTaskById(id);
    }
}