import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/RegServlet")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname = request.getParameter("txtPname");
		String gender = request.getParameter("rdoGender");
		String hob1 = request.getParameter("chk1");
		String hob2 = request.getParameter("chk2");
		String hob3 = request.getParameter("chk3");
		String loc = request.getParameter("ddlLoc");
		
		System.out.println(hob1 + "  " + hob2 + "  " + hob3);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		 
		out.print("<table width='50%'>");
		out.print("<tr><td>Person Name : " + pname + "</td></tr>");
		out.print("<tr><td>Gender : " + gender + "</td></tr>");
		
		String strHob = "";
		if(hob1!=null)
		{
			if(hob1.equals("G"))
				strHob = strHob + " Gardening";
		}
		if(hob2!=null)
		{
			if(hob2.equals("P"))
				strHob = strHob + " Playing Chess";
		}
		if(hob3!=null)
		{
			if(hob3.equals("R"))
				strHob = strHob + " Reading Books";
		}
		out.print("<tr><td>Hobbies : " + strHob + "</td></tr>");
		
		if(!loc.equals("-1"))
			out.print("<tr><td>Location : " + loc + "</td></tr>");
			
		out.print("</table>");
	}
}
