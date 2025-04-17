import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TaskManagerTest {

    private TaskManager taskManager;

    @BeforeEach
    public void setup() {
        taskManager = new TaskManager();
    }

    @Test
    public void testAddTask() {
        Task task = new ActiveTask(1, "Finish Homework", "Complete all exercises", "In Progress", "High", "2025-05-01");
        taskManager.addTask(task);
        assertEquals(1, taskManager.getTaskList().size());
    }

    @Test
    public void testRemoveTask() {
        Task task = new ActiveTask(1, "Finish Homework", "Complete all exercises", "In Progress", "High", "2025-05-01");
        taskManager.addTask(task);
        taskManager.removeTask(1);
        assertEquals(0, taskManager.getTaskList().size());
    }

    @Test
    public void testUpdateTaskStatus() {
        Task task = new ActiveTask(1, "Finish Homework", "Complete all exercises", "In Progress", "High", "2025-05-01");
        taskManager.addTask(task);
        taskManager.updateTaskStatus(1, "Completed");
        assertEquals("Completed", task.getTaskStatus());
    }

    @Test
    public void testCannotUpdateCompletedTask() {
        Task task = new CompletedTask(2, "Submit Report", "Finalize and submit the report", "Completed", "2025-04-15", "No issues");
        taskManager.addTask(task);
        taskManager.updateTaskStatus(2, "In Progress");
        assertEquals("Completed", task.getTaskStatus());  // Status shouldn't change
    }
}
