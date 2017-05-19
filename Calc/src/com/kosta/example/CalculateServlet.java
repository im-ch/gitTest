package com.kosta.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/calc.do") ()안에 내용넣으면 셋팅
public class CalculateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("num1")); //input name (데이터는 무조건 string으로 넘어옴)
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String oper = request.getParameter("operator");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>계산했다</title></head>");
		out.println("<body>");
		
		switch(oper){
		case "+": 
			out.println("<h1>"+num1+"+"+num2+"="+(num1+num2)+"</h2>");
			break;
		case "-":
			out.println("<h1>"+num1+"-"+num2+"="+(num1-num2)+"</h2>");
			break;
		case "*":
			out.println("<h1>"+num1+"*"+num2+"="+(num1*num2)+"</h2>");
			break;
		case "/":
			out.println("<h1>"+num1+"/"+num2+"="+((double)num1/num2)+"</h2>");
			break;
		}

		out.println("</body>");
		out.println("</html>");
		
	}
}
