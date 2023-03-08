import java.sql.*;
import java.util.*;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/javaTimeline";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    public static void addUser(User user) {
        String query = "INSERT INTO user (id, username, email, type, password) VALUES (?, ?, ?, ?, ?)";

        String sql = "SELECT * FROM user WHERE username = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, user.getUsername());
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {

                try (PreparedStatement st = conn.prepareStatement(query)) {

                    st.setString(1, user.getId());
                    st.setString(2, user.getUsername());
                    st.setString(3, user.getEmail());
                    st.setBoolean(4, user.getType());
                    st.setString(5, user.getPassword());

                    st.executeUpdate();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }else {
                System.out.println("User name "+user.getUsername()+" is already registered");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getUser(String username) {
        List<String> user = new ArrayList<>();
        String sql = "SELECT * FROM user WHERE username = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user.add(rs.getString("id"));
                user.add(rs.getString("username"));
                user.add(rs.getString("email"));
                user.add(rs.getString("password"));
                Boolean isLecturer = Boolean.valueOf(rs.getString("type"));
                if (!isLecturer) {
                    user.add("Student");
                }else {
                    user.add("Lecturer");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user.isEmpty() ? null : user;
    }
    public static List<Student> getAllUsers() {
        List<Student> users = new ArrayList<>();
        try {
            String query = "SELECT * FROM user";
            Connection conn = DatabaseConnection.getConnection();
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("username");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");
                Boolean userType = Boolean.valueOf(resultSet.getString("type"));
                users.add(new Student(id, name, email, password,userType));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
