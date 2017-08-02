package pl.pollub.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pollub.ArchivedTask.ArchivedTask;
import pl.pollub.ArchivedTask.ArchivedTaskList;
import pl.pollub.ArchivedTask.ArchivedTaskNotFoundException;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskList taskList;

    @Autowired
    ArchivedTaskList archivedTaskList;

    public Task addNewTask(NewTask newTask){
        return taskList.add(newTask);
    }
    public Task getActiveById(int id){
        return taskList.findById(id);
    }

    public List<Task> getAllActive(){
        return taskList.getAllTasks();
    }

    public List<ArchivedTask> getAllArchived(){
        return archivedTaskList.getAllTasks();
    }

    public ArchivedTask archiveTaskById(int id){
        Task task = taskList.findById(id);
        if(taskList.remove(task)){
            archivedTaskList.add(task);
        }
        throw new TaskNotFoundException(task);
    }

    public Task restoreTaskById(int id){
        ArchivedTask archivedTask = archivedTaskList.findById(id);
        if(archivedTaskList.remove(archivedTask)){
            taskList.restore(archivedTask);
        }
        throw new ArchivedTaskNotFoundException(archivedTask);
    }

    public ArchivedTask deleteArchivedTaskById(int id){
        ArchivedTask archivedTask = archivedTaskList.findById(id);
        if(archivedTaskList.remove(archivedTask)){
            return archivedTask;
        }
        throw new ArchivedTaskNotFoundException(archivedTask);
    }
}
