import java.util.*;

public class Lecturer extends User {
    private List<String> courseAssignments;
    private List<String> classSchedule;
    private List<String> lectureMaterials;

    public Lecturer(String id, String username, String password, String email) {
        super(id, username, password, email);
        this.courseAssignments = new ArrayList<>();
        this.classSchedule = new ArrayList<>();
        this.lectureMaterials = new ArrayList<>();
    }

    // Getters and setters for all attributes
    public List<String> getCourseAssignments() {
        return courseAssignments;
    }

    public void setCourseAssignments(List<String> courseAssignments) {
        this.courseAssignments = courseAssignments;
    }

    public List<String> getClassSchedule() {
        return classSchedule;
    }

    public void setClassSchedule(List<String> classSchedule) {
        this.classSchedule = classSchedule;
    }

    public List<String> getLectureMaterials() {
        return lectureMaterials;
    }

    public void setLectureMaterials(List<String> lectureMaterials) {
        this.lectureMaterials = lectureMaterials;
    }
}