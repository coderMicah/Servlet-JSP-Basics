package com.Micah;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/rq")
public class SqServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
//		int r = Integer.parseInt(req.getParameter("result"));
//		int r = (int)req.getAttribute("result");
		
//		Session
		HttpSession session = req.getSession();
		String nameCg = (String) session.getAttribute("name");
		
		
//		Cookie
//		Cookie cookies[] = req.getCookies();
//		
//		int r = 0;
//		for(Cookie c : cookies)
//		{
//			if(c.getName().equals("result"))
//			{
//				r = Integer.parseInt(c.getValue());
//			}
//		}
//		
//		int result = r * r;
		
//		Servlet Context
		ServletContext ctx = getServletContext();
		String name  = ctx.getInitParameter("name");
		
		PrintWriter out = res.getWriter();
		out.println("Name from ServletContext is " + name);
		out.println("Name from ServletConfig is " + nameCg);
	}
}
