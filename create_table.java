package ddl_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/student_data";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String query = "CREATE TABLE student (Roll_No int,Name varchar(50),Surname varchar(30),Total_Marks int)";
		
		Connection cn = null;
		Statement stmt = null;
		
			try {
				Class.forName(driver);
				System.out.println("Driver Loaaded Successfully");
				
				cn = DriverManager.getConnection(url, "root", "password");
				System.out.println("Connection Established Successfully..");
				
				stmt = cn.createStatement();             //platform creation where sql query can be execute
				System.out.println("Platform created Successfully..");
				
				stmt.execute(query);
				System.out.println("Query executed successfully..");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			finally{
				try {
					cn.close();
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

	}

}