package pl.pollub.task;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskListTest {

    @Test
    public void whenICreateNewTaskThenThisTaskIsOnTheTaskList() throws Exception {
        TaskList taskList = new TaskList();
        Task created1 = taskList.add(new NewTask("task1"));
        taskList.add(new NewTask( "task2"));

        assertEquals(2, taskList.getAllTasks().size());
        assertTrue(taskList.getAllTasks().contains(created1));
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
}