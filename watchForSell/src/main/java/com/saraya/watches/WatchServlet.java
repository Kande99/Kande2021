package com.saraya.watches;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saraya.model.Watch;
import com.saraya.model.WatchService;


@WebServlet(urlPatterns = "/watch.do")
public class WatchServlet extends HttpServlet {
	WatchService ws = new WatchService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("watches", ws.getAllWatches() );
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int year = Integer.parseInt(request.getParameter("yr"));
		String make = request.getParameter("mk");
		String model = request.getParameter("md");
		String image = request.getParameter("im");
		
	   ws.addWatch(year, make, model, image);
	   response.sendRedirect("/watch.do");

	}

}