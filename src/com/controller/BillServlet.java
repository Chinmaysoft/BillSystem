package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Monthlybill;
import com.services.BillService;

/**
 * Servlet implementation class BillServlet
 */
//@WebServlet("/BillServlet")
public class BillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String source=request.getParameter("source");
		if(source.equals("add")) {
			response.sendRedirect("Paynow.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BillService bs=new BillService();
		 Monthlybill mb=new Monthlybill();
		 
		 mb.setBillname(request.getParameter("bill"));
		 mb.setCno(Integer.parseInt(request.getParameter("cno")));
		 mb.setCname(request.getParameter("cname"));
		 mb.setMobno(Integer.parseInt(request.getParameter("mno")));
		 mb.setAmt(Double.parseDouble(request.getParameter("amt")));
		 
		 System.out.println("Bill Details :\n "+mb);
		 
		 try {
			boolean flag=bs.addBill(mb);
			if (flag) {
				response.setContentType("text/html");
				
				PrintWriter out=response.getWriter();
				
				out.println("<html> <head><title> Data View</title></head>"
						+ "<body>"
						+ "Customer Care No = "+mb.getCno()+"<br>"
						+ "Customer Name ="+mb.getCname()+"<br>"
						+ "Total Amount ="+mb.getAmt()+"<br>"
						+"</body></html>"
						);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		} 
	
}
