package com.bean;

import java.util.ArrayList;

public class Monthlybill {

	 int Bno;
	String Billname;
	int Cno;
	String Cname;
	int Mobno;
	Double Amt;
	ArrayList<Subscription> Subscriptionlist;
	
	
	
	public Monthlybill() {
		super();
	}


	public Monthlybill(int bno, String billname, int cno, String cname, int mobno, Double amt,
			ArrayList<Subscription> subscriptionlist) {
		super();
		Bno = bno;
		Billname = billname;
		Cno = cno;
		Cname = cname;
		Mobno = mobno;
		Amt = amt;
		Subscriptionlist = subscriptionlist;
	}
	
	
	public int getBno() {
		return Bno;
	}
	public void setBno(int bno) {
		Bno = bno;
	}
	public String getBillname() {
		return Billname;
	}
	public void setBillname(String billname) {
		Billname = billname;
	}
	public int getCno() {
		return Cno;
	}
	public void setCno(int cno) {
		Cno = cno;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getMobno() {
		return Mobno;
	}
	public void setMobno(int mobno) {
		Mobno = mobno;
	}
	public Double getAmt() {
		return Amt;
	}
	public void setAmt(Double amt) {
		Amt = amt;
	}
	public ArrayList<Subscription> getSubscriptionlist() {
		return Subscriptionlist;
	}
	public void setSubscriptionlist(ArrayList<Subscription> subscriptionlist) {
		Subscriptionlist = subscriptionlist;
	} 
	
	
		
	
}
