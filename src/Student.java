import java.util.*;

public class Student extends User {
    private List<String> courseEnrollment;
    private List<String> assignedTasks;
    private List<String> classSchedule;

    public Student(String id,String username, String password, String email) {
        super(id, username, password, email);
        this.courseEnrollment = new ArrayList<>();
        this.assignedTasks = new ArrayList<>();
        this.classSchedule = new ArrayList<>();
    }

    // Getters and setters for all attributes
    public List<String> getCourseEnrollment() {
        return courseEnrollment;
    }

    public void setCourseEnrollment(List<String> courseEnrollment) {
        this.courseEnrollment = courseEnrollment;
    }

    public List<String> getAssignedTasks() {
        return assignedTasks;
    }

    public void setAssignedTasks(List<String> assignedTasks) {
        this.assignedTasks = assignedTasks;
    }

    public List<String> getClassSchedule() {
        return classSchedule;
    }

    public void setClassSchedule(List<String> classSchedule) {
        this.classSchedule = classSchedule;
    }
}