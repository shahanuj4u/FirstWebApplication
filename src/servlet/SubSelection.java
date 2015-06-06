package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubSelection
 */
@WebServlet("/SubSelection")
public class SubSelection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubSelection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		out.println("<html><body><h1><table>");
		out.print("ANUJSHAH");
		Enumeration<> name=request.getParameterNames();
		out.print("ANUJSHAH");
	while(name.hasMoreElements())
	{	out.print("ANUJSHAH");
		String parName=name.nextElement().toString();
		String val=request.getParameter("parName");
		if(val.equals(""))
		{
			val="Null";
		}
		out.print("<tr><td>"+parName+"</td><td>"+val+"</td></tr>");
		
	}
		//	String val[]=request.getParameterValues("soc");
		/*for(int i=0;i<val.length;i++)
			out.println(val[i]);
		//out.print("ANUJSHAH");
*/		out.println("</table></h1></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
