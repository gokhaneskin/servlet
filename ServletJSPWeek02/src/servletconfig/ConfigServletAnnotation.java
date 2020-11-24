package servletconfig;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/configServletAnnotation", initParams = @WebInitParam(name="role",value="admin"))
public class ConfigServletAnnotation extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		String role=config.getInitParameter("role");
		resp.getWriter().print(role);
		
		String servletName=config.getServletName();
		ServletContext context=config.getServletContext();
		Enumeration<String> names = config.getInitParameterNames();
		
		
	}
}