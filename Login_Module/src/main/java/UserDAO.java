import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
  private static final String JDBC_USERNAME = "root";
  private static final String JDBC_PASSWORD = "root1234";

  public User getUserByUsernameAndPassword(String username, String password) {
    User user = null;
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("MySQL JDBC driver loaded successfully!");
      } catch (ClassNotFoundException e) {
        System.out.println("Failed to load MySQL JDBC driver.");
        e.printStackTrace();
      }

    try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
         PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
    ) {
      statement.setString(1, username);
      statement.setString(2, password);

      try (ResultSet resultSet = statement.executeQuery()) {
        if (resultSet.next()) {
          int id = resultSet.getInt("id");
          String fullname = resultSet.getString("fullname");
          String email = resultSet.getString("email");
          String userType = resultSet.getString("type");

          user = new User(id, fullname, email, username, password, userType);
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return user;
  }
}
