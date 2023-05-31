package com.Micah;

import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebServlet("/add")
public class AddServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));

//		int result = i + j;
	
//		Writing on the web
//		PrintWriter out = res.getWriter();
//		out.println("The result before square is :" + result);
//		
		
//		Session Management using request object(other servlet will get values from req object)		
//		req.setAttribute("result", result);
		
//		Session management using session(other servlet will get values from req object)
//		HttpSession session = req.getSession();
//		session.setAttribute("result",result);
		
		ServletConfig cg = getServletConfig();
		String name = cg.getInitParameter("name");
		
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		
//		cookies
//		Cookie cookie = new Cookie("result",result + "");
//		res.addCookie(cookie);
		
//		Calling servlet(sq) inside other servlet(add)
//			A.Using Request Dispatcher
//		RequestDispatcher rd = req.getRequestDispatcher("rq");
//		rd.forward(req, res);
		
//			B.USING sendREDIRECT
//		Session Management with URL Rewriting(other servlet will get values from url parameter)	
		res.sendRedirect("rq");
		
		
		
		
		
	}

}
