public abstract class Task {
    // Fields
    private int taskId;
    private String taskName;
    private String taskDescription;
    private String taskStatus;

    // Constructor
    public Task(int taskId, String taskName, String taskDescription, String taskStatus) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    // Getters
    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    // Setters
    public void setTaskName(String name) {
        this.taskName = name;
    }

    public void setTaskDescription(String description) {
        this.taskDescription = description;
    }

    // Abstract method to be implemented by subclasses
    public abstract void updateStatus(String status);
}
