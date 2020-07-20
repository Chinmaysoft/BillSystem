package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Month;
import java.util.ArrayList;

import com.bean.Monthlybill;
import com.util.DBconnection;

public class SaveDao {

	Connection con=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	public Monthlybill SearchBno(int cno)throws SQLException,ClassNotFoundException
	{
		Monthlybill mb=null;
		boolean flag=false;
		con=DBconnection.GetConnection();
		String sql="select BillName,CustomerNo,CustomerName,Mobno,Amount from userbill where CustomerNo=?";
		pst=con.prepareStatement(sql);
		
		pst.setInt(1, cno);
		
		rs=pst.executeQuery();
		
		while (rs.next()) {
			mb=new Monthlybill();
//			mb.setBno(rs.getInt(1));
			mb.setBillname(rs.getString(1));
			mb.setCno(rs.getInt(2));
			mb.setCname(rs.getString(3));
			mb.setMobno(rs.getInt(4));
			mb.setAmt(rs.getDouble(5));
			
			
		}
		return mb;
	}
	
	public ArrayList<Monthlybill> SearchSubscription(String Sub) throws SQLException,ClassNotFoundException
	{
		ArrayList<Monthlybill> Month=new ArrayList<Monthlybill>();
		Monthlybill month=null;
		boolean flaf=false;
		String sql="select BillName,CustomerNo,CustomerName,Mobno,Amount from userbill u,subscription s where UPPER(s.Subname)=UPPER(?) and u.BillNo=s.BillNo";
		
		con=DBconnection.GetConnection();
		pst=con.prepareStatement(sql);
		
		pst.setString(1, Sub);
		
		rs=pst.executeQuery();
		
		while(rs.next()) {
			month=new Monthlybill();
			
			month.setBillname(rs.getString(1));
			month.setCno(rs.getInt(2));
			month.setCname(rs.getString(3));
			month.setMobno(rs.getInt(4));
			month.setAmt(rs.getDouble(5));
			
			Month.add(month);
		}
		return Month;
	}
	
	
	
}
