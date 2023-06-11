import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/mydatabase";
  private static final String JDBC_USERNAME = "root";
  private static final String JDBC_PASSWORD = "root1234";

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    String fullname = request.getParameter("fullname");
    String email = request.getParameter("email");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("MySQL JDBC driver loaded successfully!");
      } catch (ClassNotFoundException e) {
        System.out.println("Failed to load MySQL JDBC driver.");
        e.printStackTrace();
      }

    if (isUsernameExists(username)) {
      // Redirect to an error page if the username already exists
      response.sendRedirect("username_already_exists.jsp");
      return;
    }

    try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
         PreparedStatement statement = connection.prepareStatement("INSERT INTO users (fullname, email, username, password, type) VALUES (?, ?, ?, ?, ?)");
    ) {
      statement.setString(1, fullname);
      statement.setString(2, email);
      statement.setString(3, username);
      statement.setString(4, password);
      statement.setString(5, "user"); // Default user type

      statement.executeUpdate();

      // Redirect to a success page or perform any additional actions
      response.sendRedirect("login.jsp");
    } catch (SQLException e) {
      e.printStackTrace();
      // Redirect to an error page or handle the error appropriately
      response.sendRedirect("error.jsp");
    }
  }

  private boolean isUsernameExists(String username) {
    try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
         PreparedStatement statement = connection.prepareStatement("SELECT username FROM users WHERE username = ?");
    ) {
      statement.setString(1, username);
      try (ResultSet resultSet = statement.executeQuery()) {
        return resultSet.next();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }
}
