package com.uttara.test;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Date;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateServlet
 */
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DateServlet() {
    	System.out.println("in ds no arg constructor");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("in ds->doGet()");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String[] qoutes={"Today is a good day","Aham Brahmasmi"};
		
		Date dt=new Date();
		String html="<html><body><h1>Date & Time</h1><b>Todays date & time is "+dt.toString()+"</b><br/> Qoute of the day:"+qoutes[(int)(Math.random()*qoutes.length)]+"</body></html>";
		System.out.println("html");
		PrintWriter pw=response.getWriter();
		pw.write(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
