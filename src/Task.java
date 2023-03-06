import java.util.Date;

public class Task {
    private String description;
    private Date dueDate;
    private int priorityLevel;

    private int userId;
    private boolean isComplete;

    public Task(String description, Date dueDate, int priorityLevel,int userId) {
        this.description = description;
        this.dueDate = dueDate;
        this.priorityLevel = priorityLevel;
        this.userId=userId;
        this.isComplete = false; // Task is incomplete by default
    }

    // Getters and setters for all attributes
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public Integer getTaskId() {
        return null;
    }
}
