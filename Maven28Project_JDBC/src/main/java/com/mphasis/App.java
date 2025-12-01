package com.mphasis;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded ");
		String uname = "root";
		String pwd = "root@39";
		String url = "jdbc:mysql://localhost:3306/mphasisdb";
		
		try (
				Connection con = DriverManager.getConnection(url, uname, pwd);
				Statement	st = con.createStatement();
				ResultSet rs = st.executeQuery("SELECT * FROM praveen.employee");)
			{
			
			ResultSetMetaData rsmd=rs.getMetaData();
			int columnsCount=rsmd.getColumnCount();
			
			for(int i=1;i<=columnsCount;i++)
				System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnClassName(i));
				System.out.println();
			
			System.out.println("--------------------------------------------------");
			while (rs.next()) {
//				System.out.println("EmployeeId: " + rs.getInt(1));
//				System.out.println("EmployeeName: " + rs.getString(2));
//				System.out.println("EmployeeMobile: " + rs.getString(3));
//				System.out.println("EmployeeDID: " + rs.getInt(4));
//				System.out.println("EmployeeAge: " + rs.getInt(5));
//				System.out.println("Employee Mail: " + rs.getString(6));
				for(int i =1;i<=columnsCount;i++)
					System.out.println(rsmd.getColumnName(i)+" : "+   rs.getString(rsmd.getColumnName(i)));
				System.out.println("------------------------------------------------");
			}
			
			DatabaseMetaData dbmd=con.getMetaData();
			System.out.println(dbmd.getDatabaseProductName());
		ResultSet rs1=	dbmd.getTables(null, null, "%", new String[] {"TABLE"});
			while(rs1.next())
				System.out.println(rs1.getString("TABLE_NAME"));
			
		}catch (Exception e) {

			e.printStackTrace();
		}
		// use trywithresources to avoid manual closing...
	}
}
