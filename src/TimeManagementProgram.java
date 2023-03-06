import java.util.*;

public class TimeManagementProgram {
    private static Database database;

    public TimeManagementProgram() {
        database = new Database();
    }

    public void createUser(String id, String username, String password, String email) {
        User user = new User(id,username, password, email);
        database.addUser(user);
    }

    public static void displayUser(String username){
        List<String> gotYou = database.getUser(username);
        for (String data : gotYou) {
            System.out.println( data);
        }
    }

    public static void displayAllUsers(){
        // retrieve the user accounts from the database
        List<List<String>> userData = database.getAllUsers();

        // display the user accounts
        System.out.println("UserList");
        for (List<String> row : userData) {
            System.out.println(String.join(", ", row));
        }
    }

    //This method displays students users, Lecturers and Students
    public static void displayAllRegistered(){
        // retrieve the user accounts from the database
        List<List<String>> userData = database.getAllUsers();

        // display the user accounts
        System.out.println("UserList");
        for (List<String> row : userData) {
            System.out.println(String.join(", ", row));
        }
        // retrieve the student accounts from the database
        List<List<String>> studentData = database.getAllStudents();

        // display the student accounts
        System.out.println("StudentList");
        for (List<String> row : studentData) {
            System.out.println(String.join(", ", row));
        }
        // retrieve the lecturer accounts from the database
        List<List<String>> lecturerData = database.getAllLecturers();

        // display the lecturer accounts
        System.out.println("LecturerList");
        for (List<String> row : lecturerData) {
            System.out.println(String.join(", ", row));
        }

    }

    public void createStudent(String id,String username, String password, String email) {
        Student student = new Student(id,username, password, email);
        database.addStudent(student);
    }

    public static void displayStudent(String username){
        List<String> gotYou = database.getUser(username);
        for (String data : gotYou) {
            System.out.println( data);
        }
    }

    public static void displayAllStudents(){
        // retrieve the student accounts from the database
        List<List<String>> studentData = database.getAllStudents();

        // display the student accounts
        System.out.println("StudentList");
        for (List<String> row : studentData) {
            System.out.println(String.join(", ", row));
        }
    }

    public void createLecturer(String id,String username, String password, String email) {
        Lecturer lecturer = new Lecturer(id, username, password, email);
        database.addLecturer(lecturer);
    }

    public static void displayLecturer(String username){
        List<String> gotYou = database.getLecturer(username);
        for (String data : gotYou) {
            System.out.println(data);
        }
    }

    public static void displayAllLectures(){
        // retrieve the lecturer accounts from the database
        List<List<String>> lecturerData = database.getAllLecturers();

        // display the accounts
        System.out.println("LecturerList");
        for (List<String> row : lecturerData) {
            System.out.println(String.join(", ", row));
        }
    }
    public static void displayAllTasks(){
        // retrieve the lecturer accounts from the database
        List<List<String>> taskData = database.getAllTasks();

        // display the accounts
        System.out.println("Task List");
        for (List<String> row : taskData) {
            System.out.println(
                    " [ User Id:: " + row.get(0)+" ]" +
                    " [ Priority Level:: "+ row.get(1)+" ]" +
                    " [ Task Id:: "+ row.get(2)+" ]" +
                    " [ Task Description:: "+ row.get(3)+" ]" +
                    " [ Due Date:: "+ row.get(4)+" ]" +
                    " [ Task Complete:: "+ row.get(5)+" ]" +
                    " [ Date Added:: "+ row.get(6)+" ]"
            );
        }
    }
    public static void displayTask(String taskId){
        List<String> gotYou = database.getTask(taskId);
        for (String data : gotYou) {
            System.out.println(data);
        }
    }

    public void createTask(String description, Date dueDate, int priorityLevel, String userId, String taskId) {
        Task task = new Task(description,dueDate, priorityLevel, userId,taskId);
        database.addTask(task);
    }

    public void createCourse(String courseCode, String courseName, String description) {
        Course course = new Course(courseCode, courseName, description);
        database.addCourse(course);
    }

    public void createSchedule(Course course, String classTime, String location) {
        Schedule schedule = new Schedule(course, classTime, location);
        database.addSchedule(schedule);
    }

    public void createResource(String resourceType, String filePath, String description) {
        Resource resource = new Resource(resourceType, filePath, description);
        database.addResource(resource);
    }

    public void createNotification(String notificationType, User recipient, String messagee) {
        Notification notification = new Notification(notificationType, recipient,messagee);
        database.addNotification(notification);
    }

    public static void main(String[] args) {
        TimeManagementProgram program = new TimeManagementProgram();
        program.createUser("S4CDR5","user", "password", "user@example.com");
        program.createStudent("EGS5FC","student", "password", "student@example.com");
        program.createLecturer("FR23SW","lecturer", "password", "professorx@example.com");
        program.createTask("I am a task",new Date(System.currentTimeMillis()),1,"S4CDR5","34");
       // displayAllTasks();
        displayTask("34");
        }

    private void createNotification(int i, String s) {
    }

    private void createSchedule(Date date, Date date1, String s, int i, int i1) {
    }


    static void  displayData(){
        // create an instance of the database

        // retrieve the user accounts from the database
        Map<String, User> users = database.getUsers();

        // display the user accounts
        System.out.println("User Accounts:");
        for (Map.Entry<String, User> entry : users.entrySet()) {
            System.out.println("Username: " + entry.getKey() + ", User Data: " + entry.getValue());
        }


        // retrieve the tasks from the database
        Map<String, Task> tasks = database.getTasks();

        // display the tasks
        System.out.println("\nTasks:");
        for (Map.Entry<String, Task> entry : tasks.entrySet()) {
            System.out.println("Description: " + entry.getKey() + ", User Data: " + entry.getValue());
        }

        // retrieve the courses from the database
        List<Course> courses = database.getCourses();

        // display the courses
        System.out.println("\nCourses:");
        for (Course course : courses) {
            System.out.println(course);
        }

        // retrieve the schedules from the database
        List<Schedule> schedules = database.getSchedules();

        // display the schedules
        System.out.println("\nSchedules:");
        for (Schedule schedule : schedules) {
            System.out.println(schedule);
        }

        // retrieve the resources from the database
        List<Resource> resources = database.getResources();

        // display the resources
        System.out.println("\nResources:");
        for (Resource resource : resources) {
            System.out.println(resource);
        }

        // retrieve the notifications from the database
        List<Notification> notifications = database.getNotifications();

        // display the notifications
        System.out.println("\nNotifications:");
        for (Notification notification : notifications) {
            System.out.println(notification);
        }
    }
}
