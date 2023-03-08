import java.util.*;

public class TimeManagementProgram {
    private static Database database;
    private static DatabaseConnection data;

    public TimeManagementProgram() {
        database = new Database();
    }

    public void createUser(String id,String username, String password, String email,Boolean isLecturer) {
        User student = new User(id,username, password, email,isLecturer);
        data.addUser(student);
    }

    public static void displayUser(String username){
        List<String> gotYou = data.getUser(username);
        for (String data : gotYou) {
            System.out.println( data);
        }
    }
    public static void displayCourse(String courseCode){
        List<String> gotYou = database.getCourse(courseCode);
        for (String data : gotYou) {
            System.out.println(data);
        }
    }

    public static void editStudentData(String username, Student newStudent){
        boolean isEdited=database.editStudent(username,newStudent);
        if(isEdited){
            System.out.println(username+" ::Detail Edit success");
        } else {
            System.out.println(username+" ::Detail Edit Failed");
        }
    }

    public static void displayAllUsers(){
        // retrieve the student accounts from the database
        List<Student> studentData = data.getAllUsers();

        // display the student accounts
        System.out.println("All Users");
        for (User row: studentData) {
            boolean isNotStudent=row.getType();
            String type;
            if(isNotStudent) {
                type = "Student";
            }else{
                type = "Lecturer";
            }
            System.out.println(row.getId()+" "+row.getUsername()+" "+row.getEmail()+" "+row.getPassword()+type);

        }
    }
    public static void deleteCreatedStudent(String username){
        boolean isDeleted= database.deleteStudent(username);
        if(!isDeleted){
            System.out.println("User:: "+username+" Delete Not Successful!");
        }else if(isDeleted){ System.out.println("User:: "+username+" Delete Success!");}
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
    public static void deleteCreatedLecturer(String username){
        boolean isDeleted= database.deleteLecturer(username);
        if(!isDeleted){
            System.out.println("Lecturer:: "+username+" Delete Not Successful!");
        }else if(isDeleted){ System.out.println("Lecturer:: "+username+" Delete Success!");}
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

    public static void deleteCreatedTask(String taskId){
        boolean isDeleted= database.deleteTask(taskId);
        if(!isDeleted){
            System.out.println("Task:: "+taskId+" Delete Not Successful!");
        }else if(isDeleted){ System.out.println("Task:: "+taskId+" Delete Success!");}
    }
    public static void displayTask(String taskId){
        System.out.println(database.getTask(taskId));
    }

    public void createTask(String description, Date dueDate, int priorityLevel, String userId, String taskId) {
        Task task = new Task(description,dueDate, priorityLevel, userId,taskId);
        database.addTask(task);
    }

    public void createCourse(String courseCode, String courseName, String description,List units) {
        Course course = new Course(courseCode, courseName, description, units);
        database.addCourse(course);
    }
    public void displayCourses(){
        List gotYou = database.getAllCourses();

        System.out.println(database.getAllCourses());
    }

    public void createSchedule(Course course, String classTime, String location) {
        Schedule schedule = new Schedule(course, classTime, location);
        //Todo Create some code !!
    }

    public void createResource(String resourceType, String filePath, String description) {
        Resource resource = new Resource(resourceType, filePath, description);
        database.addResource(resource);
    }

    public void createNotification(String notificationType, User recipient, String messagee) {
        Notification notification = new Notification(notificationType, recipient,messagee);
        database.addNotification(notification);
    }
    /*
    * Todo!! Create other methods and fix the existing notifications
    */

    public static void main(String[] args) {
        TimeManagementProgram program = new TimeManagementProgram();
        program.createUser("S4CDR5","user", "password", "user@example.com",false);
        program.createUser("EGS5FC", "Raccoon", "password1", "avenger@gmail.com",false);
        program.createUser("GHT9YD", "Sam", "password2", "Sam@gmail.com",false);
        program.createUser("KJU6RT", "RacSam", "password3", "Racsam@gmail.com",false);
        program.createUser("QWE2AS", "Alice", "password4", "alice@gmail.com",true);
        program.createUser("ZXN7BH", "TomSteve", "password5", "tom@gmail.com",true);
        program.createUser("FR23SW","lecturer", "password", "professorx@gmail.com",true);
        program.createTask("I am a task",new Date(System.currentTimeMillis()),1,"S4CDR5","34");
        program.displayAllUsers();
        program.displayUser("Raccoon");


        //List<String> unitList = Arrays.asList("Math100", "phyc234", "calc1", "eng345");
        //program.createCourse("ACS","Applied CS","A Program Under CS",unitList);
        }

    private void createNotification(int i, String s) {
    }

    private void createSchedule(Date date, Date date1, String s, int i, int i1) {
    }
}
