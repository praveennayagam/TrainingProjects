package com.mphasis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcCRUDApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded ");
		String uname = "root";
		String pwd = "root@39";
		String url = "jdbc:mysql://localhost:3306/praveen";
		
		try (
				Connection con = DriverManager.getConnection(url, uname, pwd);
				Statement	st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM employee");)
			{
			
			//insert records
//				String query="insert into employee values(?,?,?,?,?,?)";
//			PreparedStatement ps=con.prepareStatement(query);
//			ps.setInt(1, 352);
//				ps.setString(2, "irfan4");
//				ps.setString(3, "987654321");
//			ps.setInt(4, 1);
//				ps.setInt(5, 23);
//				ps.setString(6, "irfan43@gmail.com");
//				
//				ps.executeUpdate();
//				System.out.println("row inserted successfully");
//				
				//read records
//				ResultSetMetaData rsmd=rs.getMetaData();
//				int columnsCount=rsmd.getColumnCount();
//				while(rs.next()) {
//				for(int i=1;i<=columnsCount;i++) 
//					System.out.println(rsmd.getColumnName(i)+" "+rs.getString(rsmd.getColumnName(i)));
//					System.out.println("---------------------------------");
//				
			//update record  
			
			String query="update employee set age=? where employeeid=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, 25);
			ps.setInt(2, 123);
			ps.executeUpdate();
			
			
			// delete record refer repository
			
			}
		catch (Exception e) {
			e.printStackTrace();
		}
				
				
				
			}

	}

