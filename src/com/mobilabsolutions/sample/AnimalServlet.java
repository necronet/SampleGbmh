package com.mobilabsolutions.sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnimalServlet
 */
@WebServlet("/AnimalServlet")
public class AnimalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public AnimalServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		processRequest(request);
	}

	private void processRequest(HttpServletRequest request) throws IOException {
		Integer age = Integer.valueOf(request.getParameter("age"));
		String race = request.getParameter("race");
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/plain");
		if(age!=null && race !=null){
			Animal animal=new Dog(race,age);
			out.println("Dog Succesfully created "+ animaml.toString());
		}else
		{
			out.println("Dog could not be created");
		}
		out.close();

	}
}
