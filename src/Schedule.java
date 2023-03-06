public class Schedule {
    private Course course;
    private String classTime;
    private String location;

    public Schedule(Course course, String classTime, String location) {
        this.course = course;
        this.classTime = classTime;
        this.location = location;
    }

    // Getters and setters for all attributes
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getScheduleId() {
        return null;
    }
}
