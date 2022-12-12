package org.nlt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestController extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		PrintWriter out=resp.getWriter();
		HttpSession ses=req.getSession();
		String sessionId=ses.getId();
		String ip=req.getRemoteAddr();
		String browserDetail=req.getHeader("User-Agent");
		System.out.println(name);
		System.out.println(sessionId);
		System.out.println(ip);
		System.out.println(browserDetail);
		System.out.println("---------------------------");
		
		out.println("<h2>Do Get Method</h2>");
		out.println("<h2>"+name+"</h2>");	
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		PrintWriter out=resp.getWriter();
		HttpSession ses=req.getSession();
		String sessionId=ses.getId();
		String ip=req.getRemoteAddr();
		String browserDetail=req.getHeader("User-Agent");
		System.out.println(name);
		System.out.println(sessionId);
		System.out.println(ip);
		System.out.println(browserDetail);
		System.out.println("---------------------------");
		
		out.println("<h2>Do Post Method</h2>");
		out.println("<h2>"+name+"</h2>");	
	}
}
