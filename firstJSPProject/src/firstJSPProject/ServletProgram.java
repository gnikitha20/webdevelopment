package firstJSPProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletProgram extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		String userName=request.getParameter("userName");
		if(userName!=" " && userName!=null){
		session.setAttribute("savedUserName", userName);
		}
		pw.println("Hello From GET!!!"+session.getAttribute("savedUserName"));
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		out.println("Hello From POST !!!"+request.getParameter("userName"));
		out.println("We Know your full name is "+request.getParameter("firstName")+" "+request.getParameter("lastName"));
		out.println("You are a "+request.getParameter("prof"));
		out.println("You live in "+request.getParameter("location"));
	}
	}
