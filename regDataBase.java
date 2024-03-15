package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class regDataBase extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
		PrintWriter out=resp.getWriter();
		String userName=req.getParameter("name1");
		String myEmail=req.getParameter("email1");
		String myPassword=req.getParameter("pass1");
		String myGender=req.getParameter("gender1");
		String myCity=req.getParameter("city1");
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
//			
//		}
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/jdatabase","root","Lumad&786");
			
			PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?,?)");
			ps.setString(1, userName);
			ps.setString(2, myEmail);
			ps.setString(3, myPassword);
			ps.setString(4, myGender);
			ps.setString(5, myCity);
			
			int count=ps.executeUpdate();
			if(count>0) {
				resp.setContentType("text/html");
				out.print("<h3 style='color:green'>User registered successfull</h3>");
				
				RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
				rd.include(req, resp);
				
			}
			else {
				
				resp.setContentType("text/html");
				out.print("<h3 style='color:red'>User not registered due to some error</h3>");
				
				RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
				rd.include(req, resp);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.setContentType("text/html");
			out.print("<h3 style='color:red'>Exception Occured: "+e.getMessage()+"</h3>");
			
			RequestDispatcher rd=req.getRequestDispatcher("/index.jsp");
			rd.include(req, resp);
		}
	}

}
