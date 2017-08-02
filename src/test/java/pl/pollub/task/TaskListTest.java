//package pl.pollub.task;
//
//import static org.junit.Assert.*;
//import static org.mockito.Matchers.any;
//import static org.mockito.Mockito.when;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import pl.pollub.ArchivedTask.ArchivedTask;
//import pl.pollub.ArchivedTask.ArchivedTaskList;
//
//public class TaskListTest {
//
//    private TaskList taskList;
//
//    @Before
//    public void setUp(){
//        archivedTasks = new ArchivedTaskList();
//        taskList = new TaskList();
//    }
//
//    @Test
//    public void whenICreateNewTask_Then_ThisTaskIsOnTheTaskList() throws Exception {
//        ArchivedTaskList archivedTasks = new ArchivedTaskList();
//        TaskList taskList = new TaskList(archivedTasks);
//        Task created1 = taskList.add(new NewTask("task1"));
//        taskList.add(new NewTask( "task2"));
//
//        assertEquals(2, taskList.getAllTasks().size());
//        assertTrue(taskList.getAllTasks().contains(created1));
//    }
//
//    @Test
//    public void ICanArchiveExistingTask() throws Exception{
//        //given: a task
//        Task created = taskList.add(new NewTask( "task1"));
//
//        //when: i archive it
//        taskList.archive(created);
//
//        //then: it disappears from TaskList and add to archiveTaskList
//        assertFalse(taskList.getAllTasks().contains(created));
//        assertNotNull(archivedTasks.getAllTasks().get(0).getTask().getContent(), "task1");
//        System.out.println(archivedTasks.getAllTasks().toString());
//    }
//}