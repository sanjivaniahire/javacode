package dml_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertData {

public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/student_data";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		String insert_query = "INSERT INTO `student`(`Roll_No`,`Name`,`Surname`,`Total_Marks`)VALUES(?,?,?,?)";
		String update_query = "update student set Surname = 'Hello'";
		
		Connection cn = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		
		int x;
		
		try {
			Class.forName(driver);
			
			cn = DriverManager.getConnection(url, "root", "password");
			
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			
			
			pstmt1 = cn.prepareStatement(insert_query);
			pstmt2 = cn.prepareStatement(update_query);

			
			do {
				System.out.println("Enter Roll No : ");
				int roll = sc1.nextInt();
				
				System.out.println("Enter Name : ");
				String name = sc2.nextLine();
				
				System.out.println("Enter Surname : ");
				String surname = sc2.nextLine();
				
				System.out.println("Enter Total Marks : ");
				int marks = sc1.nextInt();
				
				pstmt1.setInt(1, roll);
				pstmt1.setString(2, name);
				pstmt1.setString(3, surname);
				pstmt1.setInt(4, marks);
				
				pstmt1.executeUpdate();
				
				System.out.println("Continue : press 1");
				System.out.println("Quit : press 0");
				x = sc1.nextInt();
				
				if(x==0)
				{
					System.out.println("Thank you");
				}
				else if(x!=1)
				{
					throw new UserInputException();
				}
				
				
			}while(x==1);
			
			System.out.println("Data inserted Successfully..");

			pstmt2.executeUpdate();
		
			
			System.out.println("Surname Updated to Hello Successfully..");
			
			
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
//		finally {
//
//			try {
//				pstmt1.close();
//				pstmt2.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			try {
//				cn.close();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//
//		
		

	}

}
