package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String myEmail=req.getParameter("email1");
		String myPassword=req.getParameter("pass1");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdatabase","root","Lumad&786");
			
			PreparedStatement ps=con.prepareStatement("select id users where email=? && password=?");
			ps.setString(1, myEmail);
			ps.setString(2, myPassword);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'>Invalid Email and Password</h3>");
				
				RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
				rd.include(req, resp);
			}
			else {
				resp.setContentType("text/html");
				out.print("<h3 style='color:green'>You Login Successfully</h3>");
				
				RequestDispatcher rd=req.getRequestDispatcher("/home.jsp");
				rd.include(req, resp);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'>Exception Occured: "+e.getMessage()+"</h3>");
			
			RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
			rd.include(req, resp);
		}
	}
	
}
