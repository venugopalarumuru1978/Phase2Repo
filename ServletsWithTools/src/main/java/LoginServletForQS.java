import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServletForQS
 */
@WebServlet("/LoginServletForQS")
public class LoginServletForQS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServletForQS() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String[] users = {"Venugopal", "Krishna", "Nani"};
		
		String uname = request.getParameter("txtUname");
		String pwd = request.getParameter("txtPass");
		
		boolean b = false;
		for(String user : users)
		{
			if(uname.equals(user) && pwd.equals("12345"))
			{
				response.sendRedirect("WelcomeQS?uid=" + user);
				b = true;
			}
		}
		if(b==false)
			response.sendRedirect("Error.html");
	}

}
