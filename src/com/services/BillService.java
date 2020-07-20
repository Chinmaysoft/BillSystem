package com.services;

import java.sql.SQLException;

import com.bean.Monthlybill;
import com.dao.BillDao;

public class BillService {

	BillDao bd=new BillDao();
	
	public boolean addBill(Monthlybill mb)throws SQLException,ClassNotFoundException
	{
		return bd.addBill(mb);
	}
	
	
}
