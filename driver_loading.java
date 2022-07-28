package loading;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverLoading {

public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/student_data";
		String driver= "com.mysql.cj.jdbc.Driver";
		
		Connection  cn = null;
		Statement stmt = null;
		
		
		try 
		{
			Class.forName(driver);  //Diver Loading
			System.out.println("Driver Loaded Successfully..");
			
			cn = DriverManager.getConnection(url,"root","password");
			System.out.println("Connection Established Successfull..");
			
			stmt = cn.createStatement();
			System.out.println("Platform created successfully ...");
			
			stmt.close();
			cn.close();	
		} 
		
		
		catch (ClassNotFoundException | SQLException e) 
		{	
			System.out.println("Problem while loading");
			e.printStackTrace();
		}

	}

}