package com.ts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class School extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
			
			String name = req.getParameter("q");
			String result = "";
			if(name.equals("cricket")) {
				result = "Get Live Cricket Scores, Ball by Ball Commentary, Scorecard Updates, Match Facts & related News of all the International & Domestic Cricket";
			} else if(name.equals("movie")) {
				result = "List of Upcoming Movies in year 2024 and 2025. Watch Movie Trailers, Release Date, Latest News of movies in Mumbai coming soon at theatres near you.";
			}  else {
				result = "Sorry";
			}
			
			System.out.println("We are in backend file");
			
			req.setAttribute("data", result);
			req.getRequestDispatcher("school.jsp").forward(req, resp);
	    }
}
