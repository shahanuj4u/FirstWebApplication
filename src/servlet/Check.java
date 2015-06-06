package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class Check
 */
@WebServlet("/Check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			PrintWriter out=response.getWriter();
			String uname=request.getParameter("user").toString();
			String pwd=request.getParameter("pass").toString();
			String User="root";
			String pass="";
			String driver="com.mysql.jdbc.Driver";
			String DB_URL = "jdbc:mysql://localhost/anuj";
			java.sql.Connection cn=null;
			Class.forName(driver);
			cn=DriverManager.getConnection(DB_URL, User, pass);
			Statement st=cn.createStatement();
			String sql="SELECT user,pass From Logintbl";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				String dbUser=rs.getString(1);
				String dbPass=rs.getString(2);
				if(dbUser.equals(uname) && dbPass.equals(dbPass))
				{
					out.println("<html><head></head><body><center><b><h1>");
					out.println("Welcome..."+uname);
					out.println("</h1></b></center></body></html>");
					break;
				}
				else
				{
					out.println("<html><head></head><body><center><b><h1>");
					out.println("Sorry.."+uname+",you are not allowed.");
					out.println("</h1></b></center></body></html>");
					break;
				}
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
