package com.services;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Monthlybill;
import com.dao.SaveDao;

	

public class SearchService {

	SaveDao sd=new SaveDao();
	
	public Monthlybill SearchBno(int cno)throws SQLException,ClassNotFoundException
	{
		return sd.SearchBno(cno);
	}
	
	public ArrayList<Monthlybill> SearchSubscription(String Sub) throws SQLException,ClassNotFoundException
	{
		return sd.SearchSubscription(Sub);
	}
	}
