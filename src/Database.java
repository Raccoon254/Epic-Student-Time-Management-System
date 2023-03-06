import java.util.*;

public class Database {
    private HashMap<String, User> userMap;
    private HashMap<Integer, Task> taskMap;
    private HashMap<String, Schedule> scheduleMap;

    private List<List<String>> userData;
    private List<List<String>> lecturerData;
    private List<List<String>> studentData;
    private List<List<String>> taskData;
    // Add additional hashmaps for other types of data as needed

    public Database() {
        taskData = new ArrayList<>();
        lecturerData = new ArrayList<>();
        studentData = new ArrayList<>();
        userData = new ArrayList<>();
        taskMap = new HashMap<>();
        scheduleMap = new HashMap<>();
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





    public void updateUser(User user) {
        userMap.put(user.getUsername(), user);
    }

    public void deleteUser(String username) {
        userMap.remove(username);
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


    public void deleteTask(int taskId) {
        taskMap.remove(taskId);
    }

    // Methods for schedule operations
    public void addSchedule(Schedule schedule) {
        scheduleMap.put(schedule.getScheduleId(), schedule);
    }

    public Schedule getSchedule(int scheduleId) {
        return scheduleMap.get(scheduleId);
    }

    public void updateSchedule(Schedule schedule) {
        scheduleMap.put(schedule.getScheduleId(), schedule);
    }

    public void deleteSchedule(int scheduleId) {
        scheduleMap.remove(scheduleId);
    }

    public void addResource(Resource resource) {
    }

    public void addNotification(Notification notification) {
    }

    public Map getUsers() {
        return userMap;
    }

    public Map getTasks() {
        return taskMap;
    }

    public List<Course> getCourses() {
        return null;
    }

    public List<Schedule> getSchedules() {
        return null;
    }

    public void addCourse(Course course) {
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
}
