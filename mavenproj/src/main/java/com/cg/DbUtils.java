package com.cg;
import java.sql.*;
import java.util.*;
import java.io.*;

public class DbUtils {

	public static Connection getConnection() {
		Connection conn=null;
		try {
		// loading properties from file
		FileInputStream fin=new FileInputStream ("db.properties");
		Properties props=new Properties();
		props.load(fin);
		
		// Extracting properties 
		String driver = props.getProperty("db.driver");
		String url = props.getProperty("db.url");
		String user = props.getProperty("db.user");
		String pwd = props.getProperty("db.password");
		
			  Class.forName(driver);
		       conn= DriverManager.getConnection(url,user,pwd);
		      System.out.println("Connected");
		    
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		      
	}

}
