import java.util.*;

public class Database {

    private List<List<String>> userData;
    private List<List<String>> lecturerData;
    private List<List<String>> studentData;
    private List<List<String>> taskData;
    private List<List<String>> courseData;
    // Add additional hashmaps !!Raccoon Uses Lists 😂🙌 :: !! for other types of data as needed

    public Database() {
        courseData = new ArrayList<>();
        taskData = new ArrayList<>();
        lecturerData = new ArrayList<>();
        studentData = new ArrayList<>();
        userData = new ArrayList<>();
    }

    //Methods For course management
    public void addCourse(Course course){
        List<String> row = new ArrayList<>(Arrays.asList(course.getCourseCode(),course.getCourseName(),course.getCourseDescription(),course.getUnits()));
        courseData.add(row);
    }

    public List getAllCourses(){
        return courseData;
    }
    public List<String> getCourse(String courseCode){
        for(List<String> row : courseData ) {
            if(row.get(0)==courseCode){
                return row;
            }
        }
        return null;
    }
    public boolean deleteCourse(String courseCode){

        return false;
    }
    public boolean editCourse(String courseCode,Course newCourse){

        return false;
    }



    // Methods for user account operations
    public void addUser(User user) {
        List<String> row = new ArrayList<>(Arrays.asList(user.getId(),user.getUsername(), user.getEmail(), user.getPassword()));
        userData.add(row);
    }

    public List getAllUsers(){
        return userData;
    }

    public List<String> getUser(String username) {
        for (List<String> user : studentData) {
            if (user.get(0).equals(username)) {
                return user;
            }
        }
        return null;
    }

    // Methods for task operations
    public void addTask(Task task) {
        List<String> row = new ArrayList<>(Arrays.asList(task.getUserId(),task.getPriorityLevel(), task.getTaskId(),task.getDescription(),task.getDueDate(),task.isComplete(),task.getDateAdded()));
        taskData.add(row);
    }
    public List getAllTasks(){
        return taskData;
    }

    public List<String> getTask(String taskId) {
        for (List<String> Task : taskData) {
            if (Task.get(2).equals(taskId)) {
                return Task;
            }
        }
        return null;
    }
    public boolean deleteTask(String taskId) {
        Iterator<List<String>> iterator = taskData.iterator();
        while (iterator.hasNext()) {
            List<String> user = iterator.next();
            if (user.get(2).equals(taskId)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Methods for schedule operations
    //public void addSchedule(Schedule mySchedule)

    //public Schedule getSchedule(int scheduleId)

    //public void updateSchedule(Schedule schedule)

    //public void deleteSchedule(int scheduleId)
    public void addResource(Resource resource) {
    }

    public void addNotification(Notification notification) {
    }

    public List<Course> getCourses() {
        return null;
    }

    public List<Schedule> getSchedules() {
        return null;
    }

    public List<Resource> getResources() {
        return null;
    }

    public List<Notification> getNotifications() {
        return null;
    }

    public void addStudent(Student student) {
        List<String> row = new ArrayList<>(Arrays.asList(student.getId(),student.getUsername(), student.getEmail(), student.getPassword()));
        studentData.add(row);
    }
    public List getAllStudents(){
        return studentData;
    }

    public List<String> getStudent(String username) {
        for (List<String> user : studentData) {
            if (user.get(0).equals(username)) {
                return user;
            }
        }
        return null;
    }
    public boolean deleteStudent(String username) {
        Iterator<List<String>> iterator = studentData.iterator();
        while (iterator.hasNext()) {
            List<String> user = iterator.next();
            if (user.get(1).equals(username)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public boolean editStudent(String username, Student newStudent) {
        for (List<String> user : studentData) {
            if (user.get(1).equals(username)) {
                user.set(0, newStudent.getId());
                user.set(1, newStudent.getUsername());
                user.set(2, newStudent.getEmail());
                user.set(3, newStudent.getPassword());
                return true;
            }
        }
        return false;
    }
    public void addLecturer(Lecturer lecturer) {
        List<String> row = new ArrayList<>(Arrays.asList(lecturer.getId(),lecturer.getUsername(), lecturer.getEmail(), lecturer.getPassword()));
        lecturerData.add(row);
    }
    public List getAllLecturers(){
        return lecturerData;
    }

    public List<String> getLecturer(String username) {
        for (List<String> user : lecturerData) {
            if (user.get(0).equals(username)) {
                return user;
            }
        }
        return null;
    }

    public boolean deleteLecturer(String username) {
        Iterator<List<String>> iterator = lecturerData.iterator();
        while (iterator.hasNext()) {
            List<String> user = iterator.next();
            if (user.get(1).equals(username)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
