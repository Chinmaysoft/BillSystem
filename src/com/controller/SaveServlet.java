package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Month;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Monthlybill;
import com.bean.Subscription;
import com.services.SearchService;

/**
 * Servlet implementation class SaveServlet
 */

public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SearchService service=new SearchService();
		ArrayList<Monthlybill> month=null;
		String source=request.getParameter("search");
		if(source.equals("cno")) {
			PrintWriter out=response.getWriter();
			try {
				String cno=request.getParameter("searchval");
				Monthlybill	mb=service.SearchBno(Integer.parseInt(cno));
				if(mb != null) {
				response.setContentType("text/html");	
				
				out.println("<html> <head><title> Data View</title></head>"
						+ "<body>"
						+ "Bill Name ="+mb.getBillname()+"<br>"
						+ "Customer Care No = "+mb.getCno()+"<br>"
						+ "Customer Name ="+mb.getCname()+"<br>"
						+ "Mob No ="+mb.getMobno()+"<br>"
						+ "Total Amount ="+mb.getAmt()+"<br>"
						);
				
				}else {
					out.print("Sorry...."+"</body></html>");
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		else if(source.equals("subscription")) {
			try {
			String Sub=request.getParameter("searchval");
			month=service.SearchSubscription(Sub);
			response.setContentType("text/html");	
			PrintWriter out=response.getWriter();
			out.println("<html><head></head><title>Subscription Details</title>");
			out.println("<body>");
			if(month.size()>0) {
				
				for (Monthlybill mb :month) {
					out.println("Bill Name ="+mb.getBillname()+"<br>"
							+ "Customer Care No = "+mb.getCno()+"<br>"
							+ "Customer Name ="+mb.getCname()+"<br>"
							+ "Mob No ="+mb.getMobno()+"<br>"
							+ "Total Amount ="+mb.getAmt()+"<br>");
				}
			}else {
				out.println("No DTH Subscription "+Sub+"in User"
						+ "</body></html>");
			}
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
