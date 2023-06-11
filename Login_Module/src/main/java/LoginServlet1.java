
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/LoginServlet1")
public class LoginServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserDAO userDAO;

	@Override
	public void init() throws ServletException {
		super.init();
		userDAO = new UserDAO();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = userDAO.getUserByUsernameAndPassword(username, password);

		if (user != null) {
			String userType = user.getType();

			if (userType.equals("user")) {
				response.sendRedirect("welcome_user.jsp");
			} else if (userType.equals("analyst")) {
				response.sendRedirect("welcome_analyst.jsp");
			} else if (userType.equals("admin")) {
				response.sendRedirect("error.jsp");
			} else {
				response.sendRedirect("error.jsp");
			}
		} else {
			response.sendRedirect("error.jsp");
		}
	}
}