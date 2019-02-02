

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String user = request.getParameter("usn");
		String pwd = request.getParameter("pwd");
		
				
				if(user.equals(user) && pwd.equals(pwd))
				{
					response.sendRedirect("LoginSuccess.jsp");
				}
				else
				{
					RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.html");
					PrintWriter out= response.getWriter();
					out.println("<font color=red>Either user name or password is wrong.</font>");
					rd.include(request, response);
					
				}
				
	}

}
