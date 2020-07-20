package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bean.Monthlybill;
import com.util.DBconnection;

public class BillDao {

	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	public boolean addBill(Monthlybill mb)throws SQLException,ClassNotFoundException
	{
		String sql="insert into Userbill(BillName,CustomerNo,CustomerName,MobNo,Amount) values(?,?,?,?,?)";
		boolean flag=false;
		con=DBconnection.GetConnection();
		pst=con.prepareStatement(sql);
		
		pst.setString(1, mb.getBillname());
		pst.setInt(2, mb.getCno());
		pst.setString(3, mb.getCname());
		pst.setInt(4, mb.getMobno());
		pst.setDouble(5, mb.getAmt());
		
		int row=pst.executeUpdate();
		
		if(row>0) {
			System.out.println("Save Data...");
			return true;
		}
		return flag;
	}
}
