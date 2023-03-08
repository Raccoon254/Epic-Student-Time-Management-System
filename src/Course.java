import java.util.List;

public class Course {
    private String courseCode;
    private String courseName;
    private String courseDescription;
    private List<String> units;

    public Course(String courseCode, String courseName, String courseDescription, List<String> units) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.units = units;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getUnits() {
        return String.valueOf(units);
    }

    public void setUnits(List<String> units) {
        this.units = units;
    }
}
