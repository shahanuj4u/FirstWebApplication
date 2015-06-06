package servlet;
import java.io.IOException;
import java.util.Date;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class FilterTime implements Filter {
static double totalTime;
public void doFilter(ServletRequest request, ServletResponse response,
FilterChain chain) throws IOException, ServletException {
Date startTime, endTime;
startTime = new Date();
chain.doFilter(request, response);
endTime = new Date();
totalTime = endTime.getTime() - startTime.getTime();
totalTime = totalTime / 1000;
System.out.println("Total elapsed time is: " + totalTime + " seconds." );
}
@Override
public void destroy() {
	// TODO Auto-generated method stub
	
}
@Override
public void init(FilterConfig arg0) throws ServletException {
	// TODO Auto-generated method stub
	
}
}
