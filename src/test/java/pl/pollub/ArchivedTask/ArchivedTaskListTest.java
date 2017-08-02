/*
package pl.pollub.ArchivedTask;

import org.junit.Before;
import org.junit.Test;
import pl.pollub.task.NewTask;
import pl.pollub.task.Task;
import pl.pollub.task.TaskList;

import static org.junit.Assert.*;

public class ArchivedTaskListTest {

    TaskList tasks;
    ArchivedTaskList archivedTasks;

    @Before
    public void createArchivedTaskListsWithTasks(){
        ArchivedTaskList archivedTasks = new ArchivedTaskList();
        TaskList tasks = new TaskList(archivedTasks);

    }

    @Test
    public void when_IArchiveTask_then_ThisTaskIsRemovedFromTaskList() throws Exception {
        Task created = tasks.add(new NewTask("task1"));
        tasks.add(new NewTask( "task2"));
        tasks.archive(created);

        assertEquals(1, archivedTasks.getAllTasks().size());
        assertEquals(1, tasks.getAllTasks().size());
        assertTrue(archivedTasks.getAllTasks().get(0).getTask().equals(created));
    }

    @Test
    public void ICanRemoveExistingTask(){
        //given: a task
        TaskList taskList = new TaskList();
        Task task = taskList.add(new NewTask( "task1"));

        //when: i remove it
        //Task task = ;
        taskList.remove(task);

        //then: it disappears
        assertFalse(taskList.getAllTasks().contains(task));
    }
}*/
