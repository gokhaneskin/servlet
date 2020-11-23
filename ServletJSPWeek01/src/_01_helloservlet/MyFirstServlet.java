package _01_helloservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("MyFirstServlet#doGet called");
		PrintWriter printWriter=resp.getWriter();
		LocalTime localTime=LocalTime.now();
		printWriter.print("<h1> "+localTime+"<h1>");
	}
}
