import java.util.Date;

public class Task {
    private String taskId;
    private String description;
    private Date dueDate;
    private int priorityLevel;

    private String userId;
    private boolean isComplete;

    public Task(String description, Date dueDate, int priorityLevel,String userId,String taskId) {
        this.description = description;
        this.dueDate = dueDate;
        this.priorityLevel = priorityLevel;
        this.userId = userId;
        this.taskId = taskId;
        this.isComplete = false;
        // Task is incomplete by default
    }

    // Getters and setters for all attributes
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        String mySubmissionDate=String.valueOf(dueDate);
        return mySubmissionDate;
    }

    public String getDateAdded(){
        return String.valueOf(new Date(System.currentTimeMillis()));
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getPriorityLevel() {
        return String.valueOf(priorityLevel);
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String isComplete() {
        return String.valueOf(isComplete);
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getUserId() {
        return userId;
    }
}
