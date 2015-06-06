package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;

/**
 * Servlet implementation class Cookie_2
 */
@WebServlet("/Cookie_2")
public class Cookie_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cookie_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		 PrintWriter out = response.getWriter();
		 Cookie ck[]=request.getCookies();
		 out.print("<html><body><center><h2> Hello " + ck[0].getValue());
		 Cookie[] cookies = request.getCookies();
		 Cookie usrCookie=null;
		 String Count = null;
		 if(cookies!=null){
		 for(Cookie cookie : cookies){
		 if("Count".equals(cookie.getName())){
		 Count = cookie.getValue();
		 usrCookie=cookie;
		 break;
		 }
		 }
		 }
		 if(Count==null || usrCookie==null){
		 usrCookie=new Cookie("Count",1+"");
		 }
		 else{
		 usrCookie.setValue(Integer.parseInt(Count)+1+"");
		 }
		 usrCookie.setMaxAge(60);
		 response.addCookie(usrCookie);
		 if(Count==null){
		 Count="0";
		 }
		 out.println("<html><body><center><h2> Your Previous Visits :"+Count+"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
