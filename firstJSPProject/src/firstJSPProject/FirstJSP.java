package firstJSPProject;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from First Servlet");
		PrintWriter pw = response.getWriter();
		pw.println(this.getServletConfig().getInitParameter("user"));
		pw.println("<h1>Hello From FirstJSP Servlet !!!</h1>");
	}
}
