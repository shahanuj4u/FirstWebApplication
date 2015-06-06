package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myservlet
 */
@WebServlet("/myservlet")
public class myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	try{
		PrintWriter out=response.getWriter();
		
		String User = "root";
		String pass = "";
		String DB_URL = "jdbc:mysql://localhost/anuj";
		String driver = "com.mysql.jdbc.Driver";
		java.sql.Statement st = null;
		Connection cn = null;
		Class.forName(driver);
		cn = DriverManager.getConnection(DB_URL, User, pass);
		String name=request.getParameter("name").toString();
		String email=request.getParameter("email").toString();
		
		String contact=request.getParameter("contact").toString();
		String sql = "INSERT INTO servletdb VALUES('"+name+"','"+email+"','"+contact+"')";
/*		String sql = "SELECT * FROM servletdb";*/
		st=cn.createStatement();
		int n=st.executeUpdate(sql);
/*		ResultSet rs = st.executeQuery(sql);
		out.println("<html><body><table>");
		while(rs.next())
		{
			String n1=rs.getString(1);
			String n2=rs.getString(2);
			String n3=rs.getString(3);
			out.print("<tr>");
			out.print("<td>"+n1+"</td>");
			out.print("<td>"+n2+"</td>");
			out.print("<td>"+n3+"</td>");
			out.print("</tr>");
		}
		out.println("</table></body></html>");*/
		out.println("SUCESSFUL...");
		
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	}

}
